package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart02C2 extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart02C2(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Character classes");
		addTableItem(new String[] {"[abc]",	"a, b, or c (simple class)"});
		addTableItem(new String[] {"[^abc]",	"Any character except a, b, or c (negation)"});
		addTableItem(new String[] {"[a-zA-Z]",	"a through z or A through Z, inclusive (range)"});
		addTableItem(new String[] {"[a-d[m-p]]",	"a through d, or m through p: [a-dm-p] (union)"});
		addTableItem(new String[] {"[a-z&&[def]]",	"d, e, or f (intersection)"});
		addTableItem(new String[] {"[a-z&&[^bc]]",	"a through z, except for b and c: [ad-z] (subtraction)"});
		addTableItem(new String[] {"[a-z&&[^m-p]]",	"a through z, and not m through p: [a-lq-z](subtraction)"});
		addTableItem(new String[] {" "});
	}
}
