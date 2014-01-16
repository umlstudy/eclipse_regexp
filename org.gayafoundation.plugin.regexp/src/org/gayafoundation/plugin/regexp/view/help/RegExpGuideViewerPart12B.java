package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart12B extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart12B(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Back references");
		addTableItem(new String[] {"\\n",	"Whatever the nth capturing group matched"});
	}
}
