package Practise;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video31InlineAsserion {
	
	@Test
	public void perticularDataThereOrNot()
	{
			RestAssured.given()
			.log().all()
			.contentType("application/json")
			.baseUri("https://restful-booker.herokuapp.com/booking")
			.body("[\r\n"
					+ "  {\r\n"
					+ "    \"bookingid\": 1\r\n"
					+ "  },\r\n"
					+ "  {\r\n"
					+ "    \"bookingid\": 2\r\n"
					+ "  },\r\n"
					+ "  {\r\n"
					+ "    \"bookingid\": 3\r\n"
					+ "  },\r\n"
					+ "  {\r\n"
					+ "    \"bookingid\": 4\r\n"
					+ "  }\r\n"
					+ "]")
			.when()
			.get()
			.then()
			.log()
			.all()
			.body("bookingid",Matchers.hasItems(2,3));
		}
	

}
