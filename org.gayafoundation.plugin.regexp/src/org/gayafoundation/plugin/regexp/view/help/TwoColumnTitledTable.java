package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;
import org.gayafoundation.plugin.common.component.TitledTable;

public class TwoColumnTitledTable extends TitledTable {

	public TwoColumnTitledTable(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void createUI() {
		super.createUI();
		new TableColumn(getTable(), SWT.NONE).setWidth(130);
		new TableColumn(getTable(), SWT.NONE).setWidth(300);
	}

	@Override
	protected void addHook() {
		
	}
	
	public void pack() {
		getTable().getColumns()[1].pack();
	}
}