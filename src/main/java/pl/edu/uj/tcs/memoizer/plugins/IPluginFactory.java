package pl.edu.uj.tcs.memoizer.plugins;

import java.awt.Image;
import java.util.List;

import pl.edu.uj.tcs.memoizer.serialization.StateObject;

/*
 * Interface implemented by every plugin factory
 * @author pmikos (sokar92)
 */
public interface IPluginFactory {
	
	/*
	 * Returns plugin description for ex. DemotywatoryDownloadPlugin
	 */
	public String getServiceName();
	
	/*
	 * Returns icon related to given plugin 
	 */
	public Image getIcon();
	
	/*
	 * Creates new instance of downloading plugin  with specified initial state
	 * for a particular type of view
	 */
	public IDownloadPlugin newInstance(StateObject pluginState, EViewType viewType);
	
	/*
	 * Returns list of views implemented by downloading plugins provided by this factory
	 */
	public List<EViewType> getAvailableDownloadViews();
	
}