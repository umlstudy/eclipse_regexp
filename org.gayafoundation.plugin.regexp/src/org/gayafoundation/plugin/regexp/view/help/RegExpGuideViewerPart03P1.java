package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart03P1 extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart03P1(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Predefined character classes");
		addTableItem(new String[] {".",	"Any character (may or may not match line terminators)"});
		addTableItem(new String[] {"\\d",	"A digit: [0-9]"});
		addTableItem(new String[] {"\\D",	"A non-digit: [^0-9]"});
		addTableItem(new String[] {"\\s",	"A whitespace character: [ \\t\\n\\x0B\\f\\r]"});
		addTableItem(new String[] {"\\S",	"A non-whitespace character: [^\\s]"});
		addTableItem(new String[] {"\\w",	"A word character: [a-zA-Z_0-9]"});
		addTableItem(new String[] {"\\W",	"A non-word character: [^\\w]"});
	}
}
