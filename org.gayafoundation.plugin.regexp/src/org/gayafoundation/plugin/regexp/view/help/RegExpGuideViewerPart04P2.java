package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart04P2 extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart04P2(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("POSIX character classes (US-ASCII only)");
		addTableItem(new String[] {"\\p{Lower}",	"A lower-case alphabetic character: [a-z]"});
		addTableItem(new String[] {"\\p{Upper}",	"An upper-case alphabetic character:[A-Z]"});
		addTableItem(new String[] {"\\p{ASCII}",	"All ASCII:[\\x00-\\x7F]"});
		addTableItem(new String[] {"\\p{Alpha}",	"An alphabetic character:[\\p{Lower}\\p{Upper}]"});
		addTableItem(new String[] {"\\p{Digit}",	"A decimal digit: [0-9]"});
		addTableItem(new String[] {"\\p{Alnum}",	"An alphanumeric character:[\\p{Alpha}\\p{Digit}]"});
		addTableItem(new String[] {"\\p{Punct}",	"Punctuation: One of !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"});
		addTableItem(new String[] {"\\p{Graph}",	"A visible character: [\\p{Alnum}\\p{Punct}]"});
		addTableItem(new String[] {"\\p{Print}",	"A printable character: [\\p{Graph}\\x20]"});
		addTableItem(new String[] {"\\p{Blank}",	"A space or a tab: [ \\t]"});
		addTableItem(new String[] {"\\p{Cntrl}",	"A control character: [\\x00-\\x1F\\x7F]"});
		addTableItem(new String[] {"\\p{XDigit}",	"A hexadecimal digit: [0-9a-fA-F]"});
		addTableItem(new String[] {"\\p{Space}",	"A whitespace character: [ \\t\\n\\x0B\\f\\r]"});
	}
}
