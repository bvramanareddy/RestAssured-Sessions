package JavaFaker;

import java.util.Locale;

import com.github.javafaker.Faker;

public class RandomTestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	fakeDataGenerator();
		
	}
public static void fakeDataGenerator() {
	
	Faker faker= new Faker();
	Faker fakeWithLocals= new Faker(Locale.UK);
	String city= faker.address().city();
	String state= faker.address().state();
	String country= faker.address().country();
	String zipCode=faker.address().zipCode();
 String mobile= 	faker.phoneNumber().phoneNumber();
 
 System.out.println(city);
 System.out.println(state);
 System.out.println(country);
System.out.println(zipCode);
System.out.println(mobile);
}
}
