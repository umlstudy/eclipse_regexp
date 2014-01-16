package org.gayafoundation.plugin.regexp.view.help;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.gayafoundation.plugin.regexp.Activator;
import org.gayafoundation.plugin.regexp.resource.LocalImageResource;

public class RegExpGuideDialog extends TrayDialog {

	public RegExpGuideDialog(Shell parentShell) {
		super(parentShell);
		Image image = Activator.getImage(LocalImageResource.REG_2_IMG_KEY);
		if ( image != null ) {
			setDefaultImage(image);
		}
	}

	protected Control createDialogArea(Composite parent) {
		Control ctrl = super.createDialogArea(parent);
		new RegExpGuideViewer(parent);
		
		return ctrl;
	}
	public static int open(Shell shell) {
		RegExpGuideDialog dlg = new RegExpGuideDialog(shell);
		
		return dlg.open();
	}
}
