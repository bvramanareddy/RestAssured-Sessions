package Day4;

import org.testng.annotations.Test;

import Day2.JsonPrac;
import ReuableClasses.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Library {
	
	@Test
	public void addBook()
	{
		RestAssured.baseURI= "http://216.10.245.166";
		
		String responceString=  given().header("Content-Type", "application/json").body(Payload.addbookPayload()).
		when().post("/Library/Addbook.php").
		then().assertThat().statusCode(200).extract().response().asString();
		
	JsonPath js= new JsonPath(responceString);
	
	String iDString= js.get("ID");
		System.out.println(iDString);
	
		
	}

}
