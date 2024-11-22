package JsonPathExpression;

import java.util.Arrays;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathExtractorPrac {
	
	@Test
	public void extractResponce()
	{
		JsonPath jsonPath= new JsonPath(Responce.responce());
	//	String phoneNumbers= jsonPath.param("phoneNumbers", "$..phoneNumbers"));
//	String phoneNumbers= 	jsonPath.get("phoneNumbers");
	//	Arrays.toString(jsonPath.param("phoneNumbers", "$..phoneNumbers"));
		//System.out.println(phoneNumbers);
	JsonPath pnString= 	jsonPath.param("phoneNumbers", "$..phoneNumbers");
	}

}
