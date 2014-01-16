package org.gayafoundation.plugin.regexp.view;

import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.graphics.Color;
import org.gayafoundation.plugin.common.events.GuideTextShower;

public class InputViewerGuideTextShower extends GuideTextShower {
	
	private SourceViewer sv;
	
	private InputViewerGuideTextShower(SourceViewer sv) {
		this.sv = sv;
	}
	
	public static InputViewerGuideTextShower create(SourceViewer sv) {
		return new InputViewerGuideTextShower(sv);
	}
	
	@Override
	protected String getText() {
		return sv.getDocument().get();
	}

	@Override
	protected void setTextReal(String text) {
		sv.getDocument().set(text);
	}

	@Override
	public String getGuideText() {
		return "시험하고자 하는 문자열을 입력하세요.";
	}

	@Override
	protected void setForeground(Color color) {
		sv.getTextWidget().setForeground(color);
	}
}
