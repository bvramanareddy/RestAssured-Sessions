package Day1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class StausLineEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.given().log().all()
		 .when()
		 	.get("https://reqres.in/api/users?page=2")
		 	.then()
		 	.statusCode(200)
		 	.body("page", equalTo(2)).extract().statusLine();
	}

}
