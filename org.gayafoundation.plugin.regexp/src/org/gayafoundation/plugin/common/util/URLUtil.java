package org.gayafoundation.plugin.common.util;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

public class URLUtil {
	
	public static URL find(String bundleId, String path) {
        return find(Platform.getBundle(bundleId), path);
    }
    
    public static URL find(Bundle bundle, String path) {
        if (bundle == null) {
			return null;
		}
        return FileLocator.find(bundle, new Path(path), null);
    }
}
