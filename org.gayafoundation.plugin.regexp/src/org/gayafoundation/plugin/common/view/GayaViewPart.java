package org.gayafoundation.plugin.common.view;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public abstract class GayaViewPart extends ViewPart {

	private IMemento memento;
	
	@Override
	public void createPartControl(Composite parent) {
		createPartCtrl(parent);
		if ( memento != null ) {
			restoreState(memento);
		}
		addHook();
	}
	
	public abstract void addHook();

	public abstract void createPartCtrl(Composite parent);
	
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		super.init(site, memento);
		this.memento = memento;
	}

	protected abstract void restoreState(IMemento memento);
}
