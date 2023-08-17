package Practise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Video17MultipleData {
	RequestSpecification rst;
	@BeforeClass
	public void commonData()
	{
		rst=RestAssured.given().log().all();
		rst.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/");
		
		
	}
	@Test
	public void createData()
	{
		RestAssured.given()
		.spec(rst)
		.basePath("booking")
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
		.when()
		.post()
		.then()
		.statusCode(200)
		.log()
		.all();
	}

}
