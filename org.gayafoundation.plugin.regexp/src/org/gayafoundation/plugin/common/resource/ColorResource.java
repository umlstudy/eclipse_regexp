package org.gayafoundation.plugin.common.resource;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * JFaceColor 참고할 것
 * @author B111206
 *
 */
public class ColorResource {
	
	public static Color getColor(int r, int g, int b) {
		ColorRegistry registry = JFaceResources.getColorRegistry();
		String symbolicName = String.format("%02x%02x%02x", r, g, b); //$NON-NLS-1$
		Color color = registry.get(symbolicName);
		if ( color == null ) {
			RGB rgb = new RGB(r, g, b);
			synchronized (registry) {
				if ( registry.get(symbolicName) == null ) {
					registry.put(symbolicName, rgb);
				}
			}
			color = registry.get(symbolicName);
		}
		
		return color;
	}
	
	public static final Color getRed(Display display) {
		return display.getSystemColor(SWT.COLOR_RED);
	}
	
	public static final Color getBlue(Display display) {
		return display.getSystemColor(SWT.COLOR_BLUE);
	}
	
	public static final Color getGray(Display display) {
		return display.getSystemColor(SWT.COLOR_GRAY);
	}
	
	public static final Color getDarkBlue(Display display) {
		return display.getSystemColor(SWT.COLOR_DARK_BLUE);
	}
	
	public static final Color getDarkYellow(Display display) {
		return display.getSystemColor(SWT.COLOR_DARK_YELLOW);
	}
	
	public static final Color getDarkMagenta(Display display) {
		return display.getSystemColor(SWT.COLOR_DARK_MAGENTA);
	}
}
