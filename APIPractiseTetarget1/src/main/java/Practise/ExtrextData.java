package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ExtrextData {
	
	@Test
	public void extractData()
	{
	  String data=	RestAssured.given()
		.log().all()
		.contentType("application/json")
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
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.when().post()
		.then()
		.log().all()
		.extract()
		.asString();
	  
	  System.out.println("++++++++++++++++"+data);
	}

}
