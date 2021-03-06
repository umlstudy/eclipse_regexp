package org.gayafoundation.swt.scroll;


/*
 * ScrolledComposite example snippet: scroll a control in a scrolled composite
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.custom.*;

public class Snippet5_1 {

public static void main (String [] args) 
{
    Display display = new Display ();
    Shell shell = new Shell (display);
    shell.setLayout(new FillLayout());
    // this button has a minimum size of 400 x 400. If the window is resized to be big
    // enough to show more than 400 x 400, the button will grow in size. If the window
    // is made too small to show 400 x 400, scrollbars will appear.
    Composite p = new Composite(shell, SWT.BORDER_DASH | SWT.H_SCROLL | SWT.V_SCROLL);
    p.setLayout(new FillLayout());
    
    ScrolledComposite c2 = new ScrolledComposite(p, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
    
    Button b2 = new Button(c2, SWT.PUSH);
    b2.setText("expanding button");
    c2.setContent(b2);
    c2.setExpandHorizontal(true);
    c2.setExpandVertical(true);
    c2.setMinSize(400, 400);

    shell.setSize(600, 300);
    shell.open ();
    while (!shell.isDisposed ()) {
        if (!display.readAndDispatch ()) display.sleep ();
    }
    display.dispose ();
}

}
