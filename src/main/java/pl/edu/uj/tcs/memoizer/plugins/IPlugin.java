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
	public IStateObject getState();  // FIXME Potrzebne to w ogóle do czego?
	
	public String getServiceName();

}