package org.gayafoundation.plugin.regexp.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gayafoundation.plugin.regexp.view.help.RegExpGuideDialog;

public class RegExpHelpHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShell(event);
		RegExpGuideDialog.open(shell);
		
		return null;
	}

}
