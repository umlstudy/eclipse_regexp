package org.gayafoundation.plugin.regexp.view;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Combo;
import org.gayafoundation.plugin.common.events.GuideTextShower;

public class PatternComboGuideTextShower extends GuideTextShower {
	
	private Combo combo;
	
	private PatternComboGuideTextShower(Combo combo) {
		this.combo = combo;
	}
	
	public static PatternComboGuideTextShower create(Combo combo) {
		return new PatternComboGuideTextShower(combo);
	}
	
	@Override
	protected String getText() {
		return combo.getText();
	}

	@Override
	protected void setTextReal(String text) {
		combo.setText(text);
	}

	@Override
	public String getGuideText() {
		return "시험하고자 하는 <정규표현식>을 입력하세요.";
	}

	@Override
	protected void setForeground(Color color) {
		combo.setForeground(color);
	}
}
