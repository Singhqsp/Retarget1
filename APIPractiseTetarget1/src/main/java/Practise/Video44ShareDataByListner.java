package Practise;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video44ShareDataByListner {
	
	@Test(priority = 1)
	public void sharDataByListner(ITestContext context)
	{
		int id = RestAssured.given()
				
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
				.contentType("application/json")
				.when()
				.post()
				.then()
				.log()
				.all()
				.extract().jsonPath().getInt("bookingid");
			
		     context.setAttribute("bookingid",id);
	}
	@Test(priority = 2)
	public void getDataByListner(ITestContext context)
	{
			System.out.println("+++++++++++++++++++++++++");
			RestAssured.given()
			.log().all().baseUri("https://restful-booker.herokuapp.com/booking/"+context.getAttribute("bookingid"))
			.when()
			.get()
			.then()
			.log().all();
			
			
		}
	}
	
	
	


