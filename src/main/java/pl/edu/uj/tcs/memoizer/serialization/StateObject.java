package pl.edu.uj.tcs.memoizer.serialization;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import org.apache.commons.io.IOUtils;

import net.sf.json.JSONObject;


public class StateObject {
	
	protected final JSONObject jo;
	
	public StateObject(String object) {
		jo = JSONObject.fromObject(object);
	}
	
	public StateObject() {
		jo = new JSONObject();
	}
	
	public static StateObject fromStream(InputStream is) throws IOException {
		return new StateObject(IOUtils.toString(is));
	}
	
	public JSONObject getJSON() {
		return jo;
	}
	
	public void serialize(OutputStream os) throws IOException {
		os.write(jo.toString().getBytes());
	}
}
