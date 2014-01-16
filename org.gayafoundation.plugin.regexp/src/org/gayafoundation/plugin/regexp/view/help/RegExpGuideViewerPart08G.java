package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart08G extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart08G(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Greedy quantifiers");
		addTableItem(new String[] {"X?",	"X, once or not at all"});
		addTableItem(new String[] {"X*",	"X, zero or more times"});
		addTableItem(new String[] {"X+",	"X, one or more times"});
		addTableItem(new String[] {"X{n}",	"X, exactly n times"});
		addTableItem(new String[] {"X{n,}",	"X, at least n times"});
		addTableItem(new String[] {"X{n,m}",	"X, at least n but not more than m times"});
	}
}
