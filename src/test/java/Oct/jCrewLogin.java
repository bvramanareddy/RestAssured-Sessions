package Oct;

import org.testng.annotations.Test;

import JsonPathExpression.Responce;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static  io.restassured.RestAssured.*;



public class jCrewLogin {
	
	@Test
	
	public void basicAuthJcrew() {
		
		RestAssured.baseURI= "https://www.jcrew.com/ca/";
		int statusCode=  given().auth().basic("boda.v@yahoo.com", "Abc@12345").get().then().extract().statusCode();
		System.out.println(statusCode);
		
		Response responce=  given().auth().basic("boda.v@yahoo.com", "Abc@12345").get().then().extract().response();
		System.out.println(responce.toString());
	}

}
