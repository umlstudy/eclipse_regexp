package org.gayafoundation.plugin.regexp.resource;

import org.gayafoundation.plugin.common.resource.ImageResource;
import org.gayafoundation.plugin.regexp.Activator;

public class LocalImageResource extends ImageResource {

	public static final String REG_2_IMG_KEY = "reg2__";
	private static final String REG_2_IMG_PATH = "$nl$/icons/reg2.png";
	
	public LocalImageResource() {
		setImage(REG_2_IMG_KEY,getImageDescriptorFromPlugin(Activator.PLUGIN_ID, REG_2_IMG_PATH));
	}
}
