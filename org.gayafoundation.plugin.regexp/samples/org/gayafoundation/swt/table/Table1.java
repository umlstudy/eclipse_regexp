package org.gayafoundation.swt.table;

import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.gayafoundation.plugin.common.resource.ColorResource;

public class Table1 {

	static int[] data = new int[0];

	public static void main(String[] args) {
		Display display = new Display();
		
		Shell shell = new Shell(display);
		shell.setSize(600, 300);
		shell.setLayout(new FillLayout());
		shell.setBackground(ColorResource.getBlue(display));
		
//		final ScrolledComposite sc = new ScrolledComposite(shell, SWT.VERTICAL | SWT.HORIZONTAL);
//	    sc.setExpandHorizontal(true);
//	    sc.setExpandVertical(true);
//	    sc.setMinSize(600, 300);
//		sc.setBounds(1, 1, 300, 200);
//	    sc.setBackground(ColorResource.red);
//
//		final Composite backComp = new Composite(sc, SWT.NONE);
//		GridLayout layout = GridLayoutFactory.fillDefaults().spacing(5, 0).create();
//		backComp.setLayout(layout);
//		backComp.setLayoutData(GridDataFactory.fillDefaults().create());

		new RegExpGuideViewer(shell);
//		RegExpGuideViewer regExpGuideViewer = new RegExpGuideViewer(shell);
//		regExpGuideViewer.pack();

//		sc.setContent(backComp);
//		int prefHeight = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
//		int prefWidth  = backComp.computeSize(SWT.DEFAULT, SWT.DEFAULT).x;
//		System.out.format("%d %d", prefHeight, prefWidth);
//		backComp.setSize(prefWidth, prefHeight);
//		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
