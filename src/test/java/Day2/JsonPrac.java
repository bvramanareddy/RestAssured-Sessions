package Day2;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonPrac {

	public static JsonPath rawJsontoRead(String responceString) {
		
	
		JsonPath jsonPath= new JsonPath(responceString);
		return jsonPath;
	} 

}
