package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.widgets.Composite;

public class RegExpGuideViewerPart05J extends TwoColumnTitledTable {
	
	public RegExpGuideViewerPart05J(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		
		setTitle("java.lang.Character classes (simple java character type");
		addTableItem(new String[] {"\\p{javaLowerCase}",	"Equivalent to java.lang.Character.isLowerCase()"});
		addTableItem(new String[] {"\\p{javaUpperCase}",	"Equivalent to java.lang.Character.isUpperCase()"});
		addTableItem(new String[] {"\\p{javaWhitespace}",	"Equivalent to java.lang.Character.isWhitespace()"});
		addTableItem(new String[] {"\\p{javaMirrored}",	"Equivalent to java.lang.Character.isMirrored()"});
	}
}
