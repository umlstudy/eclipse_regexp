package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart01C1 extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart01C1(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("Characters");
		addTableItem(new String[] { "x", 	"The character x"});
		addTableItem(new String[] {"\\\\"	,"The backslash character"});
		addTableItem(new String[] {"\\0n"	,"The character with octal value 0n (0 <= n <= 7)"});
		addTableItem(new String[] {"\\0nn"	,"The character with octal value 0nn (0 <= n <= 7)"});
		addTableItem(new String[] {"\\0mnn"	,"The character with octal value 0mnn (0 <= m <= 3, 0 <= n <= 7)"});
		addTableItem(new String[] {"\\xhh"	,"The character with hexadecimal value 0xhh"});
		addTableItem(new String[] {"\\uhhhh"	,"The character with hexadecimal value 0xhhhh"});
		addTableItem(new String[] {"\\t"		,"The tab character ('\\u0009')"});
		addTableItem(new String[] {"\\n"		,"The newline (line feed) character ('\\u000A')"});
		addTableItem(new String[] {"\\r"		,"The carriage-return character ('\\u000D')"});
		addTableItem(new String[] {"\\f"		,"The form-feed character ('\\u000C')"});
		addTableItem(new String[] {"\\a"		,"The alert (bell) character ('\\u0007')"});
		addTableItem(new String[] {"\\e"		,"The escape character ('\\u001B')"});
		addTableItem(new String[] {"\\cx"	,"The control character corresponding to x"});
	}
}
