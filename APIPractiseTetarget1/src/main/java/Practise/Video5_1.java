package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video5_1 {
	
	@Test
	public void m1()
	{
		RestAssured.given().log().all()
		.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.when().post()
		.then().log().all();
	}

}
