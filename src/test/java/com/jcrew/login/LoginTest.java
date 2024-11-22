package com.jcrew.login;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class LoginTest {
    
    @Test
    public void loginJcrewBasicAuth() {
        HashMap<String, String> credentials = new LinkedHashMap<String, String>();
        credentials.put("email", "7sep@aol.com");
        credentials.put("password", "Abc@12345");

        RestAssured.baseURI = "https://www.jcrew.com/";

        Response response = given()
            .log().all() // Log the request
            .contentType(ContentType.JSON)
            .queryParam("brand", "JC")
            .queryParam("client_id", "04e5ba0a-cca2-438c-b1d8-352bf9867974")
            .queryParam("country-code", "CA")
            .queryParam("locale", "en-US")
            .body(credentials)
            .when()
            .post("checkout-api/graphql")
            .then()
            .log().all() // Log the response
            .extract()
            .response();
        
        response.
        prettyPrint();

        // Extract specific data if needed
//        String emailString = response.jsonPath().getString("data.accountUser.userDetails.email");
//        System.out.println("Extracted Email: " + emailString);
        
        
    }
}
