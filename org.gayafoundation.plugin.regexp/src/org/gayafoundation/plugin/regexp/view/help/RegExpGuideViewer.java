package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.gayafoundation.common.util.log.LogUtil;
import org.gayafoundation.plugin.common.component.Component;
import org.gayafoundation.plugin.common.resource.ColorResource;
import org.gayafoundation.plugin.regexp.RegExpConstants;

public class RegExpGuideViewer extends Component {
	
	public RegExpGuideViewer(Composite parent) {
		super(parent);
	} 

	@Override
	protected void createUI() {

		Composite back = new Composite(getParent(), SWT.NONE);
		back.setLayout(GridLayoutFactory.fillDefaults().create());
		back.setLayoutData(new GridData(GridData.FILL_BOTH)); 
		
		// 스크롤바 생성
		final ScrolledComposite sc = new ScrolledComposite(back, SWT.VERTICAL | SWT.HORIZONTAL);
		sc.setLayoutData(new GridData(GridData.FILL_BOTH)); 
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
	    createPart01(backComp);
	    createPart02(backComp);
	    createPart03(backComp);
	    createPart04(backComp);
	    createPart05(backComp);
	    createPart06(backComp);
	    createPart07(backComp);
	    createPart08(backComp);
	    createPart09(backComp);
	    createPart10(backComp);
	    createPart11(backComp);
	    createPart12(backComp);
	    createPart13(backComp);
	    createPart14(backComp);
		
		sc.setContent(backComp);
		int prefHeight = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
		int prefWidth  = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
	    if ( RegExpConstants.DEBUG_STPE2 ) {
	    	LogUtil.debug(String.format("Height : %d, Width : %d",prefHeight, prefWidth));
	    	backComp.setBackground(ColorResource.getRed(getDisplay()));
	    }

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
	
	private void createPart01(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart01C1 part = new RegExpGuideViewerPart01C1(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}

	private void createPart02(Composite parent) {
		Composite comp = createPartComposite(parent);
		RegExpGuideViewerPart02C2 part = new RegExpGuideViewerPart02C2(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart03(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart03P1 part = new RegExpGuideViewerPart03P1(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart04(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart04P2 part = new RegExpGuideViewerPart04P2(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart05(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart05J part = new RegExpGuideViewerPart05J(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart06(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart06C3 part = new RegExpGuideViewerPart06C3(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart07(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart07B part = new RegExpGuideViewerPart07B(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart08(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart08G part = new RegExpGuideViewerPart08G(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart09(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart09R part = new RegExpGuideViewerPart09R(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart10(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart10P3 part = new RegExpGuideViewerPart10P3(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart11(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart11L part = new RegExpGuideViewerPart11L(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart12(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart12B part = new RegExpGuideViewerPart12B(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart13(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart13Q part = new RegExpGuideViewerPart13Q(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	private void createPart14(Composite parent) {
		Composite comp = createPartComposite(parent);
	    RegExpGuideViewerPart14S part = new RegExpGuideViewerPart14S(comp, SWT.NONE, SWT.FULL_SELECTION);
	    part.pack();
	}
	
	@Override
	protected void addHook() {
		
	}
}
