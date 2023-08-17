package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video54MainClass {
	@Test
	public void nestedObjectPojo()
	{
		Video54NestedJsonEmployee vne= RestAssured.get("https://run.mocky.io/v3/b40d0ee7-ecfc-4d96-9578-d09b78acc27b")
		.as(Video54NestedJsonEmployee.class);
		
		//System.out.println("++++++++++"+vne.getId());
		
		
	}

}
