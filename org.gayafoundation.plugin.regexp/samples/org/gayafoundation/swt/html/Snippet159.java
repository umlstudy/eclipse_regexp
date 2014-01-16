package org.gayafoundation.swt.html;

import org.eclipse.swt.*;
import org.eclipse.swt.browser.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class Snippet159 {
	public static void main(String[] args) {
		final String newTitle = "New Value for Title";
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		final Browser browser;
		try {
			browser = new Browser(shell, SWT.NONE);
		} catch (SWTError e) {
			System.out.println("Could not instantiate Browser: "
					+ e.getMessage());
			display.dispose();
			return;
		}
		browser.addTitleListener(new TitleListener() {
			public void changed(TitleEvent event) {
				System.out.println("TitleEvent: " + event.title);
				shell.setText(event.title);
			}
		});
		browser.addProgressListener(new ProgressListener() {
			public void changed(ProgressEvent event) {
			}

			public void completed(ProgressEvent event) {
				/*
				 * Set HTML title tag using JavaScript and DOM when page has
				 * been loaded
				 */
				boolean result = browser.execute("document.title='" + newTitle
						+ "'");
				if (!result) {
					/*
					 * Script may fail or may not be supported on certain
					 * platforms.
					 */
					System.out.println("Script was not executed.");
				}
			}
		});
		/* Load an HTML document */
		browser.setUrl("http://www.eclipse.org");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}