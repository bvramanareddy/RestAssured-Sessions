package Day3;

import ReuableClasses.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParser {

	public static void main(String[] args) {

		JsonPath js=  new JsonPath(Payload.courseResponce());
		int count=  js.getInt("courses.size()");
		System.out.println(count);
		
		int totalAmount =js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print all the course titles
		
		for (int i = 0; i < count; i++) {
			String titleString= js.get("courses["+i+"].title");
			
			System.out.println(js.get("courses["+i+"].price").toString());
			System.out.println(titleString);
			
		
			
		}
	}
	

}