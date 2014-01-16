package org.gayafoundation.swt.table;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TableColumn;

public class TwoColumnTitledTable extends TitledTable {

	public TwoColumnTitledTable(Composite parent, int titleStyle, int tableStyle) {
		super(parent, titleStyle, tableStyle);
	}

	@Override
	protected void initUI() {
		new TableColumn(getTable(), SWT.NONE);
		new TableColumn(getTable(), SWT.NONE);
	}

	@Override
	protected void addHook() {
		
	}
}