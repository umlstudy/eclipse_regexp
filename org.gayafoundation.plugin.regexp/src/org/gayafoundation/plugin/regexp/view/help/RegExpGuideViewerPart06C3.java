package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart06C3 extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart06C3(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Classes for Unicode blocks and categories");
		addTableItem(new String[] {"\\p{InGreek}",	"A character in the Greek block (simple block)"});
		addTableItem(new String[] {"\\p{Lu}",	"An uppercase letter (simple category)"});
		addTableItem(new String[] {"\\p{Sc}",	"A currency symbol"});
		addTableItem(new String[] {"\\P{InGreek}",	"Any character except one in the Greek block (negation)"});
		addTableItem(new String[] {"[\\p{L}&&[^\\p{Lu}]] ",	"Any letter except an uppercase letter (subtraction)"});
	}
}
