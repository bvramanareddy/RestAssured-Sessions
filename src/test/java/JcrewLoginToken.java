import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JcrewLoginToken {
	
	

	@Test
	
	public void loginToJcrewTogetToken()
	
	{
		Response responce=  given().baseUri("www.jcrew.com/ca/")
		.header("Authentication", "H4sIAOcYNWcAA3VXy5KzPLJ8owkQpuPz8sNGXGyJRugC2gHyaQwC0zZtY57")
		.get("l/account/details").then().extract().response();
		responce.prettyPrint();
		responce.getBody();
		
		
	}
}
