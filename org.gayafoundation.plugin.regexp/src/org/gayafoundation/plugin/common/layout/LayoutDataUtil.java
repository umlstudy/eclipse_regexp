package org.gayafoundation.plugin.common.layout;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.layout.GridData;

public class LayoutDataUtil {

	public static GridData createGridData(boolean h, boolean v) {
		return GridDataFactory.fillDefaults().grab(h, v).create();
	}
}
