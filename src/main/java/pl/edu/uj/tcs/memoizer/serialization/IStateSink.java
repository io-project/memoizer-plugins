package pl.edu.uj.tcs.memoizer.serialization;

import net.sf.json.JSONObject;

public interface IStateSink {

	/**
	 * Saves object represented by string
	 * @param object
	 */
	void saveData(String object);
}
