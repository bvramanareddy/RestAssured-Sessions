package com.fakeAPIStore.www;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;

public class GetAllProducts extends BaseTest {
	
	@Test
	
	public void getAllProducts()
	{
		Response response= given().when().get("products").then().extract().response();
		List<Integer> ids = response.jsonPath().getList("id");
		System.out.println(ids);
//		response.then().assertThat().body("id", hasItem(5));
		String title = response.jsonPath().getString("find { it.id == 5 }.title");
		System.out.println("Title of Product with ID=5: " + title);
		
		String rateString= response.jsonPath().getString("rating.rate[0]");
		System.out.println(rateString);
		
		given().pathParam("id", 3).when().get("products/{id}").then().extract().response().prettyPrint();

	}
	
	@Test
	
	public void userLogin()
	{
		
		HashMap<String, String> loginCreds= new HashMap<String, String>();
		
		loginCreds.put("username", "mor_2314");
		loginCreds.put("password","83r5^_");
		
		Response tokenReponse=  given().contentType(ContentType.JSON).body(loginCreds).when().post("auth/login").then().extract().response();
		String token=  tokenReponse.jsonPath().get("token");
		System.out.println("Token Catured is :: " + token);
	}

}
