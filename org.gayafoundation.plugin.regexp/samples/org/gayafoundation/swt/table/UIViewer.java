package org.gayafoundation.swt.table;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public abstract class UIViewer {
	
	private Composite parent;
	
	protected UIViewer(Composite parent) {
		this.parent = parent;
		
		createUI();
		initUI();
	}
	
	protected abstract void createUI();
	
	protected abstract void initUI();
	
	protected abstract void addHook();
	
	public Display getDisplay() {
		return parent.getDisplay();
	}
	
	public Composite getParent() {
		return parent;
	}
	
	public Point computeSize(int wHint, int hHint) {
		return getParent().computeSize(wHint, hHint);
	}
}
