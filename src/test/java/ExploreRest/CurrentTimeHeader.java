package ExploreRest;

import org.testng.annotations.Test;

import JsonPathExpression.Responce;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CurrentTimeHeader {
	
	@Test (description = "chcking for the timeStamp")
	
	public void checkTimeStamp()
	{
		long currentTime= System.currentTimeMillis();
	Response responce= 	given().log().all(). body("{\"timestamp\":"+currentTime+"}").when().get("www.jcrew.com");
	int statusCode=	responce.statusCode();
	System.out.println(statusCode);
		
		
	}
	

}
