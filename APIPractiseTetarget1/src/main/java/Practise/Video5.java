package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

//import com.github.scribejava.core.model.Response;

//import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import static org.hamcrest.Matchers.*;

public class Video5 {
	@Test
	public void createPost()
	{
		RequestSpecification restdata=RestAssured.given();
		restdata.log().all();
		//restdata.baseUri("https://restful-booker.herokuapp.com/");
		//restdata.basePath("booking");
		restdata.baseUri("https://restful-booker.herokuapp.com/booking");
		restdata.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}");
	     
		Response response= restdata.post();
		
		ValidatableResponse validate=response.then();
		validate.statusCode(200);
		
		
	}

}
