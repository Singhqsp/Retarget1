package Practise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DefaultValuesInVideo21 {
	RequestSpecification rs ;
	ResponseSpecification rsp;
	@BeforeClass
	public void setup()
	{
		
				
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		RestAssured.basePath="booking";
		
		rs=RestAssured.given()
				.log().all().contentType("application/json");
		rsp=RestAssured.expect()
				.statusCode(200);
	}
	
	@Test
	public void defaultTime()
	{
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
		RestAssured.given().spec(rs)
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
		.then().spec(rsp);
		
		
	}
	@Test
	public void defaultTime1()
	{
		RestAssured.given().spec(rs)
		//.baseUri("https://restful-booker.herokuapp.com/")
		//.basePath("booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim1\",\r\n"
				+ "    \"lastname\" : \"Brown1\",\r\n"
				+ "    \"totalprice\" : 1111,\r\n"
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
		.spec(rsp);
		
	}
	
}
