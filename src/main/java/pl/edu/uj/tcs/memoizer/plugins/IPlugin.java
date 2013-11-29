package pl.edu.uj.tcs.memoizer.plugins;

import pl.edu.uj.tcs.memoizer.serialization.IStateObject;

/*
 * Interface required to implement by plugins
 * @author pmikos (sokar92)
 */
public interface IPlugin {
	
	/*
	 * Returns plugin state
	 */
	public IStateObject getState();
	
	public String getServiceName();

}