package Day4;

import org.testng.Assert;
import org.testng.annotations.Test;

import ReuableClasses.Payload;
import io.restassured.path.json.JsonPath;

public class TestNgSum {
	
	@Test
	public void sumofCourses()
	{
		JsonPath js=  new JsonPath(Payload.courseResponce());
		int count=  js.getInt("courses.size()");
		//System.out.println(count);
		
		int sum=0;
		
		for (int i = 0; i < count; i++) {
		 int price = js.getInt("courses["+i+"].price");
		 int copies = js.getInt("courses["+i+"].copies");
		 		int amount= price * copies;
		 		System.out.println(amount);
		 		sum = sum + amount;
			
		}
		System.out.println(sum);
		
		int purchaseAmount=  js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, purchaseAmount);
	}

}
