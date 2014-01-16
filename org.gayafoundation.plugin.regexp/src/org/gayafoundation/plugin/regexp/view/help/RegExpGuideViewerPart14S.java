package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart14S extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart14S(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Special constructs (non-capturing)");
		addTableItem(new String[] {"(?:X)",	"X, as a non-capturing group"});
		addTableItem(new String[] {"(?idmsux-idmsux) ",	"Nothing, but turns match flags i d m s u x on - off"});
		addTableItem(new String[] {"(?idmsux-idmsux:X)  ",	"X, as a non-capturing group with the given flags i d m s u x on - off"});
		addTableItem(new String[] {"(?=X)",	"X, via zero-width positive lookahead"});
		addTableItem(new String[] {"(?!X)",	"X, via zero-width negative lookahead"});
		addTableItem(new String[] {"(?<=X)",	"X, via zero-width positive lookbehind"});
		addTableItem(new String[] {"(?<!X)",	"X, via zero-width negative lookbehind"});
		addTableItem(new String[] {"(?>X)",	"X, as an independent, non-capturing group"});
	}
}
