package org.gayafoundation.plugin.common.resource;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.Font;

public class FontResource {

	public static Font getDefaultFont() {
		return JFaceResources.getTextFont();
	}
}
