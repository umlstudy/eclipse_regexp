package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart07B extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart07B(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Boundary matchers");
		addTableItem(new String[] {"^",	"The beginning of a line"});
		addTableItem(new String[] {"$",	"The end of a line"});
		addTableItem(new String[] {"\\b",	"A word boundary"});
		addTableItem(new String[] {"\\B",	"A non-word boundary"});
		addTableItem(new String[] {"\\A",	"The beginning of the input"});
		addTableItem(new String[] {"\\G",	"The end of the previous match"});
		addTableItem(new String[] {"\\Z",	"The end of the input but for the final terminator, if any"});
		addTableItem(new String[] {"\\z",	"The end of the input"});
	}
}
