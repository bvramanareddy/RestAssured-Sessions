package ExploreRest;

import org.testng.annotations.Test;

import JsonPathExpression.Responce;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Test1 {
	
	@Test
	
	public void login()
	{
		Response responce=  given().baseUri("https://petstore.swagger.io/v2/swagger.json").queryParam("status", "available").get("/pet/findByStatus").then().extract().response();
		System.out.println(responce.prettyPrint());
	}

}
