package com.fakeAPIStore.www;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BaseTest {
	
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI= "https://fakestoreapi.com/";
		
		
	}

}
