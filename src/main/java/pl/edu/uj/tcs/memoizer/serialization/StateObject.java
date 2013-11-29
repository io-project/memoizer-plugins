package pl.edu.uj.tcs.memoizer.serialization;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import net.sf.json.JSONObject;


public class StateObject {
	
	protected final JSONObject jo;
	
	public StateObject(String object) {
		jo = JSONObject.fromObject(object);
	}
	
	public StateObject(JSONObject jo) {
		this.jo = jo;
	}
	
	public StateObject() {
		jo = new JSONObject();
	}
	
	public static StateObject fromSource(IStateSource source) throws IOException {
		return new StateObject(source.getData());
	}
	
	public JSONObject getJSON() {
		return jo;
	}
	
	public void serialize(IStateSink sink) throws IOException {
		sink.saveData(jo.toString());
	}
}
