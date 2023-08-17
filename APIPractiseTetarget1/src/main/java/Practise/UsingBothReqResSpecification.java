package Practise;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class UsingBothReqResSpecification {
	@Test
	public void m1()
	{
		RequestSpecification rst=RestAssured.given().log().all();
		rst.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/booking");
		
		ResponseSpecification res = RestAssured.expect();	
			res.statusCode(200)
			.time(Matchers.lessThan(5000L))
			.contentType(ContentType.JSON);
			
		
		RestAssured
	.given()
	.spec(rst)
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
