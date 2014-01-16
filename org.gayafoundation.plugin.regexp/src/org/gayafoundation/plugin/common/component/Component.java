package org.gayafoundation.plugin.common.component;

import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public abstract class Component {
	
	private Composite parent;
	
	protected Component(Composite parent) {
		this.parent = parent;
		
		createUI();
	}
	
	protected abstract void createUI();
	
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
