package pl.edu.uj.tcs.memoizer.plugins;

import java.awt.*;
import java.util.*;

import pl.edu.uj.tcs.memoizer.serialization.StateObject;

/*
 * Interface implemented by every plugin factory
 * @author pmikos (sokar92)
 */
public interface IPluginFactory {
	
	/*
	 * Returns plugin description for ex. DemotywatoryDownloadPlugin
	 */
	public String getPluginName();
	
	/*
	 * Returns icon related to given plugin 
	 */
	public Image getIcon();
	
	/*
	 * Creates new instance od plugin
	 * with specified initial state
	 */
	public IPlugin newInstance(StateObject pluginStateMap);
	
}