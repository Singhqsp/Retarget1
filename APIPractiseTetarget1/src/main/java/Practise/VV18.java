package Practise;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class VV18 {
	
	ResponseSpecification res;
	@BeforeClass
	public void setResponse()
	{ 
		 res = RestAssured.expect();	
		res.statusCode(200)
		.time(Matchers.lessThan(5000L))
		.contentType(ContentType.JSON);
		
		
	}
	@Test
	public void responseValidate()
	{
		
		
		RestAssured
		.given()
		.log().all()
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
		.when()
		.post()
		.then()
		.spec(res);
		
		
	}
	@Test
	public void responseValidate2()
	{
		
		
		RestAssured
		.given()
		.log().all()
		.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"JimData\",\r\n"
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
		.spec(res);
		
		
	}


}
