package video56converSimpleJsonIntoResponsePOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ConverArrayToPojo {
	@Test
	public void ArrayPojoConvert()
	{
		PojoClass[] t= RestAssured.get("https://run.mocky.io/v3/f5c6e003-7c92-4816-8109-0b2a0bba7b5a")
	    .as(PojoClass[].class);	
		
		System.out.println(t.length);
		
		System.out.println(t[0].getHouseNo());
		
	}

}
