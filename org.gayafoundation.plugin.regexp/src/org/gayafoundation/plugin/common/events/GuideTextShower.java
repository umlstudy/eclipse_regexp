package org.gayafoundation.plugin.common.events;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.graphics.Color;
import org.gayafoundation.plugin.common.resource.ColorResource;

public abstract class GuideTextShower implements FocusListener {

	public static Color GUIDE_TEXT_COLOR = ColorResource.getColor(120, 120, 120);
	public static Color NORMAL_TEXT_COLOR = ColorResource.getColor(0, 0, 0);
	
	@Override
	public final void focusGained(FocusEvent evt) {
		String msg = getText();
		if ( getGuideText().equals(msg) ) {
			setText("");
		}
	}
	
	public final void setText(String text) {
		if ( getGuideText().equals(text) ) {
			setForeground(GUIDE_TEXT_COLOR);
		} else {
			setForeground(NORMAL_TEXT_COLOR);
		}
		setTextReal(text);
	}

	protected abstract String getText();
	
	protected abstract void setTextReal(String text);

	public abstract String getGuideText();
	
	protected abstract void setForeground(Color color);
	

	@Override
	public final void focusLost(FocusEvent evt) {
		String msg = getText();
		if ( msg == null || msg.isEmpty() ) {
			setText(getGuideText());
		}
	}
}
