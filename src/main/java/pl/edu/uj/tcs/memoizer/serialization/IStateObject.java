package pl.edu.uj.tcs.memoizer.serialization;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import net.sf.json.JSONObject;

/**
 * Prawdopodobnie służy do odzyskiwania wcześniej zapisanych String-ów.
 */
public interface IStateObject {
	
	JSONObject getJSON();
	
	public void serialize(IStateSink sink) throws SerializationException;
}
