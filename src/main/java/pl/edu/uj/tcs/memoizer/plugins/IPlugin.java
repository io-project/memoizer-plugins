package pl.edu.uj.tcs.memoizer.plugins;

import java.awt.*;
import java.util.*;

import pl.edu.uj.tcs.memoizer.serialization.StateObject;

/*
 * Interface required to implement by plugins
 * @author pmikos (sokar92)
 */
public interface IPlugin {
	
	/*
	 * Returns plugin state
	 */
	public StateObject getState();
	
	public String getName();

}