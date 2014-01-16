package org.gayafoundation.plugin.common.component;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.gayafoundation.plugin.common.resource.ColorResource;
import org.gayafoundation.plugin.regexp.RegExpConstants;

public abstract class TitledTable extends Component {
	
	private Label title;
	private Table table;
	
	private int titleStyle;
	private int tableStyle;
	
	protected TitledTable(Composite parent, int titleStyle, int tableStyle) {
		super(parent);
		this.titleStyle = titleStyle;
		this.tableStyle = tableStyle;
	}
	
	protected void createUI() {
		
		title = new Label(getParent(), titleStyle);
		table = new Table(getParent(), tableStyle);
		if ( RegExpConstants.DEBUG_STPE1 ) {
			table.setHeaderVisible(true);
		}
		
		setTitleLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		setTableLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		if ( RegExpConstants.DEBUG_STPE1 ) {
			title.setBackground(ColorResource.getDarkYellow(getDisplay()));
			table.setBackground(ColorResource.getDarkMagenta(getDisplay()));
		}
	}
	
	public Table getTable() {
		return table;
	}
	
	public void setTitle(String title) {
		this.title.setText(title);
	}
	
	public TableItem addTableItem(String[] columnValues) {
		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(columnValues);
		return item;
	}
	
	public void setTableLayoutData(GridData gridData) {
		table.setLayoutData(gridData);
	}
	
	public void setTitleLayoutData(GridData gridData) {
		title.setLayoutData(gridData);
	}
	
	public void pack() {
		for ( TableColumn column : table.getColumns() ) {
			if ( column.getWidth() < 1 ) {
				column.pack();
			}
		}
	}
}