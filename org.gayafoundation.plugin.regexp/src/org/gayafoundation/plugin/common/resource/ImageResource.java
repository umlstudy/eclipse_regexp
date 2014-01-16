package org.gayafoundation.plugin.common.resource;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.gayafoundation.plugin.common.util.URLUtil;
import org.gayafoundation.plugin.regexp.Activator;

/**
 * 참조
 * WorkbenchImages
 * .getImageDescriptor(IWorkbenchGraphicConstants.IMG_ETOOL_HELP_CONTENTS)
 * 
 * ISharedImages.IMG_ETOOL_DEF_PERSPECTIVE
 * 
 * BundleUtility.find(PlatformUI.PLUGIN_ID, path)
 * 
 * @author B111206
 *
 */
public abstract class ImageResource implements AllocatedResource {
	
	ImageRegistry imageRegistry;
	
	protected ImageResource() {
		imageRegistry = new ImageRegistry();
	}

	public Image getImage(String key) {
		return imageRegistry.get(key);
	}
	
	public void setImage(String key, Image image) {
		if ( image != null ) {
			Image oldImage = getImage(key);
			if ( oldImage != null ) {
				oldImage.dispose();
			}
			imageRegistry.put(key, image);
		}
	}

	public void setImage(String key, ImageDescriptor imageDescriptor) {
		if ( imageDescriptor != null ) {
			setImage(key, imageDescriptor.createImage());
		}
	}
	
	public void dispose() {
		imageRegistry.dispose();
	}
	
	/**
	 * example
	 * 
	 * to get help image descriptor
	 * String path = "$nl$/icons/full/etool16/help_contents.gif";
	 * 
	 * @param path
	 * @return
	 */
	public static ImageDescriptor getImageDescriptorFromPlatformUI(String path) {
		URL url = URLUtil.find(PlatformUI.PLUGIN_ID, path);
        return ImageDescriptor.createFromURL(url);
	}

    public static ImageDescriptor getImageDescriptorFromPlugin(String pluginId, String imageFilePath) {
    	return Activator.imageDescriptorFromPlugin(pluginId, imageFilePath);
    }
    
    public static ImageDescriptor getImageDescriptorImgToolCopy() {
    	return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_COPY);
    }
    
    public static ImageDescriptor getImageDescriptorHelp() {
    	String path = "$nl$/icons/full/etool16/help_contents.gif";
    	return getImageDescriptorFromPlatformUI(path);
    }
}
