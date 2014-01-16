package org.gayafoundation.swt.scroll;

/*
 * ScrolledComposite example snippet: scroll a control in a scrolled composite
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Snippet5_3 {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());

		Composite c1 = new Composite(shell, SWT.BORDER_DASH);
		c1.setLayout(GridLayoutFactory.fillDefaults().create());

		Composite c1_top = new Composite(c1, SWT.BORDER_DASH);
		c1_top.setLayout(GridLayoutFactory.fillDefaults().create());
		c1_top.setLayoutData(new GridData(GridData.FILL_BOTH)); 
		c1_top.setBackground(display.getSystemColor(SWT.COLOR_RED));

		ScrolledComposite c1_top_scrolComp = new ScrolledComposite(c1_top,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		c1_top_scrolComp.setLayout(GridLayoutFactory.fillDefaults().create());
		c1_top_scrolComp.setLayoutData(new GridData(GridData.FILL_BOTH)); 
		c1_top_scrolComp.setBackground(display.getSystemColor(SWT.COLOR_WHITE));

		Button c1_top_scrolComp_btn = new Button(c1_top_scrolComp, SWT.PUSH);
		c1_top_scrolComp_btn.setText("expanding button");
		c1_top_scrolComp.setContent(c1_top_scrolComp_btn);
		c1_top_scrolComp.setExpandHorizontal(true);
		c1_top_scrolComp.setExpandVertical(true);
		c1_top_scrolComp.setMinSize(400, 400);

		Composite c1_btm = new Composite(c1, SWT.BORDER_DASH);
		c1_btm.setLayout(GridLayoutFactory.fillDefaults().create());
		Button c1_btm_btn = new Button(c1_btm, SWT.PUSH);
		c1_btm_btn.setText("Fix sized button");

		shell.setSize(600, 300);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
