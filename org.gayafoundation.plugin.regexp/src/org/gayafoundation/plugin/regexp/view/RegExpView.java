package org.gayafoundation.plugin.regexp.view;

import java.util.List;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.gayafoundation.common.util.log.LogUtil;
import org.gayafoundation.common.util.regexp.RegExp;
import org.gayafoundation.common.util.regexp.RegExp.Location;
import org.gayafoundation.plugin.common.events.GuideTextShower;
import org.gayafoundation.plugin.common.layout.LayoutDataUtil;
import org.gayafoundation.plugin.common.resource.ColorResource;
import org.gayafoundation.plugin.common.text.source.SourceViewerUtil;
import org.gayafoundation.plugin.common.view.GayaViewPart;
import org.gayafoundation.plugin.regexp.data.RegExpExamples;
import org.gayafoundation.plugin.regexp.data.TitleBody;

public class RegExpView extends GayaViewPart {

	private static final Color MATCHED_COLOR_FOREGROUND = ColorResource.getColor(0, 0, 255);
	private static final Color MATCHED_COLOR_BACKGROUND = ColorResource.getColor(0, 255, 255);
	
	private SourceViewer inputViewer;
	private Combo patternCombo;

	PatternComboGuideTextShower patternComboGuideTextShower;
	InputViewerGuideTextShower inputViewerGuideTextShower;

	@Override
	public void createPartCtrl(Composite parent) {
		parent.setLayout(GridLayoutFactory.fillDefaults().create());

		patternCombo = new Combo(parent, SWT.SINGLE);
		patternCombo.setLayoutData(LayoutDataUtil.createGridData(true, false));
		//patternCombo.setFont(FontResource.getDefaultFont());
		patternComboGuideTextShower = PatternComboGuideTextShower.create(patternCombo);
		patternComboGuideTextShower.setText(patternComboGuideTextShower.getGuideText());
		patternCombo.setItems(RegExpExamples.MAP_DATA.keySet().toArray(new String[0]));
		
		inputViewer = new SourceViewer(parent, SourceViewerUtil.createDefaultRuler(), SWT.FLAT | SWT.V_SCROLL | SWT.H_SCROLL);
		inputViewer.getControl().setLayoutData(LayoutDataUtil.createGridData(true, true));
		//inputViewer.getTextWidget().setFont(FontResource.getDefaultFont());
		inputViewer.addPainter(SourceViewerUtil.createDefaultCursorLinePainter(inputViewer));
		inputViewer.setDocument(new Document(""));
		inputViewerGuideTextShower = InputViewerGuideTextShower.create(inputViewer);
		inputViewerGuideTextShower.setText(inputViewerGuideTextShower.getGuideText());
	}

	@Override
	public void addHook() {
		patternCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				LogUtil.debug(patternCombo.getText());
				String guideText = patternComboGuideTextShower.getGuideText();
				if (!guideText.equals(patternCombo.getText())) {
					if (!regexp()) {
						setDefaultStyle();
					}
				}
			}
		});
		patternCombo.addFocusListener(patternComboGuideTextShower);
		patternCombo.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String key = patternCombo.getText();
				TitleBody titleBody = RegExpExamples.MAP_DATA.get(key);
				
				if ( titleBody != null ) {
					patternComboGuideTextShower.setText(titleBody.getTitle());
					inputViewerGuideTextShower.setText(titleBody.getBody());
				} else {
					patternComboGuideTextShower.setText("");
					inputViewerGuideTextShower.setText("");
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		inputViewer.addTextListener(new ITextListener() {

			@Override
			public void textChanged(TextEvent e) {
				String guideText = inputViewerGuideTextShower.getGuideText();
				if (!guideText.equals(inputViewer.getDocument().get())) {
					if (!regexp()) {
						setDefaultStyle();
					}
				}
			}
		});
		inputViewer.getTextWidget().addFocusListener(inputViewerGuideTextShower);
	}

	@Override
	public void setFocus() {
		patternCombo.setFocus();
	}

	private boolean regexp() {
		String input = inputViewer.getDocument().get();
		String pattern = patternCombo.getText();

		if (input == null || pattern == null)
			return false;
		if (input.isEmpty() || pattern.isEmpty())
			return false;
		List<Location> foundLocations = RegExp.find(pattern, input);

		int totalMatches = foundLocations.size();
		if (totalMatches < 1)
			return false;

		StyleRange matchHighLightStyle = new StyleRange();
		matchHighLightStyle.foreground = MATCHED_COLOR_FOREGROUND;
		matchHighLightStyle.background = MATCHED_COLOR_BACKGROUND;
		matchHighLightStyle.fontStyle = SWT.BOLD;
		int[] ranges = new int[totalMatches * 2];
		StyleRange[] styles = new StyleRange[totalMatches];
		int idx = 0;
		for (Location loc : foundLocations) {
			ranges[idx * 2] = loc.getStart();
			ranges[idx * 2 + 1] = loc.getLength();
			styles[idx++] = matchHighLightStyle;
		}
		inputViewer.getTextWidget().setStyleRanges(ranges, styles);

		return true;
	}

	private void setDefaultStyle() {
		String input = inputViewer.getDocument().get();
		if (input == null || input.isEmpty()) {
			return;
		}

		StyleRange styleRange = new StyleRange();
		styleRange.start = 0;
		styleRange.length = input.length();

		if (input.equals(inputViewerGuideTextShower.getGuideText())) {
			styleRange.foreground = GuideTextShower.GUIDE_TEXT_COLOR;
		} else {
			styleRange.foreground = GuideTextShower.NORMAL_TEXT_COLOR;
		}
		inputViewer.getTextWidget().setStyleRange(styleRange);
	}

	//
	// 상태저장/불러오기
	@Override
	public void saveState(IMemento memento) {
		if ( memento != null ) {
			memento.putString("patternCombo", patternComboGuideTextShower.getText());
			memento.putString("inputViewer", inputViewerGuideTextShower.getText());
		}
	}

	@Override
	protected void restoreState(IMemento memento) {
		if ( memento != null ) {
			String pc = memento.getString("patternCombo");
			if ( pc != null ) patternComboGuideTextShower.setText(pc);
			
			String iv = memento.getString("inputViewer");
			if ( iv != null ) inputViewerGuideTextShower.setText(iv);
		}
	}
}
