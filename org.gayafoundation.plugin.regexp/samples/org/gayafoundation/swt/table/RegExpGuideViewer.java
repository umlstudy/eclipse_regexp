package org.gayafoundation.swt.table;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Composite;
import org.gayafoundation.plugin.common.resource.ColorResource;
import org.gayafoundation.plugin.regexp.RegExpConstants;

public class RegExpGuideViewer extends UIViewer {
	
	public RegExpGuideViewer(Composite parent) {
		super(parent);
	} 

	@Override
	protected void createUI() {

		// 스크롤바 생성
		final ScrolledComposite sc = new ScrolledComposite(getParent(), SWT.VERTICAL | SWT.HORIZONTAL);
	    sc.setExpandHorizontal(true);
	    sc.setExpandVertical(true);
	    if ( RegExpConstants.DEBUG_STPE1 ) {
	    	sc.setBackground(ColorResource.getRed(getDisplay()));
	    }

	    // 백그라운드 작성
		final Composite backComp = new Composite(sc, SWT.NONE);
		backComp.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());
		backComp.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	    if ( RegExpConstants.DEBUG_STPE1 ) {
	    	backComp.setBackground(ColorResource.getRed(getDisplay()));
	    }
		
		// 파트생성
	    createFirstPart(backComp);
	    createSecondPart(backComp);
		
		sc.setContent(backComp);
		int prefHeight = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		int prefWidth  = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
		sc.setMinSize(prefWidth, prefHeight);
	}
	
	private Composite createPartComposite(Composite parent) {
		Composite comp = new Composite(parent, SWT.NONE);
		comp.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());
		comp.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    if ( RegExpConstants.DEBUG_STPE1 ) {
	    	comp.setBackground(ColorResource.getBlue(getDisplay()));
	    }
	    
	    return comp;
	}
	
	private void createFirstPart(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart part = new RegExpGuideViewerPart(comp, SWT.NONE, SWT.NONE);
	    part.pack();
	}

	private void createSecondPart(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart part = new RegExpGuideViewerPart(comp, SWT.NONE, SWT.BORDER);
	    part.pack();
	}


	@Override
	protected void initUI() {
	}

	@Override
	protected void addHook() {
		
	}
}
