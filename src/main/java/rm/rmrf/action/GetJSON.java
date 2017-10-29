package rm.rmrf.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.Action;

public class GetJSON {
	private String jsonVal = "古诗词";
	private ArrayList list = new ArrayList();
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private Map<String, Object> dataMap;
	private String key = "just see see";

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public String getJsonVal() {
		return jsonVal;
	}

	public void setJsonVal(String jsonVal) {
		this.jsonVal = jsonVal;
	}

	public String execute() throws Exception {
		System.out.println("GetJSON pass");
		this.dataMap = new HashMap<String, Object>();
		
		return Action.SUCCESS;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
}
