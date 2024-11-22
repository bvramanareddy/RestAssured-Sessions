package ExploreRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class OptionsRest {

	@Test
	public static void getOptions() {
		RestAssured.given().contentType("application/font-woff").
		when().options("https://cdn-client.medium.com/lite/static/js/LandingAboutPage.MainContent.d087b939.chunk.js\r\n").then().log().all();
	}
}
