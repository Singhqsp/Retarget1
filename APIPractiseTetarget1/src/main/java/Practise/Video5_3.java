package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video5_3 {
	@Test
	public void getData()
	{
		RestAssured.given().log().all()
		.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/")
		.basePath("{id}")
		.pathParam("id",2)
		.when()
		.get()
		.then()
		.log()
		.all();
	}

}
