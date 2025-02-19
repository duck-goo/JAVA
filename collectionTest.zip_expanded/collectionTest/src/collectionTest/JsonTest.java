package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "djduck9");
		userMap.put("password", "1234");
		userMap.put("name", "이덕준");
		userMap.put("age", "95");
	
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
