package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video50FinalNestedJsonObject {
	@Test
	public void nestedJsonObject()
	{
		Video50NestedJsonObject  v1= new Video50NestedJsonObject();
		
		v1.setId(1);
		v1.setName("RRR");
		Video50InnerJsonObject v2 = new Video50InnerJsonObject();
		v2.setCity("ALD");
		v2.setDistict("Year");
		v1.setAdress(v2);
		
		RestAssured.given()
		.log().all()
		.body(v1)
		.get();
		
		
		
		
		
	}

}
