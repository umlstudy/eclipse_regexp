package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart11L extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart11L(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Logical operators");
		addTableItem(new String[] {"XY",	"X followed by Y"});
		addTableItem(new String[] {"X|Y",	"Either X or Y"});
		addTableItem(new String[] {"(X)",	"X, as a capturing group"});
	}
}
