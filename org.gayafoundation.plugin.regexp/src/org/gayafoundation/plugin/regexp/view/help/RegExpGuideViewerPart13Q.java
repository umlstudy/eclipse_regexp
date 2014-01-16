package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart13Q extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart13Q(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Quotation");
		addTableItem(new String[] {"\\",	"Nothing, but quotes the following character"});
		addTableItem(new String[] {"\\Q",	"Nothing, but quotes all characters until \\E"});
		addTableItem(new String[] {"\\E",	"Nothing, but ends quoting started by \\Q"});
	}
}
