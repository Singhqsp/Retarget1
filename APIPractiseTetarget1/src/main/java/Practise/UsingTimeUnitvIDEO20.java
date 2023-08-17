package Practise;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

public class UsingTimeUnitvIDEO20 {
	
	@Test
	public void timeCheckData()
	{
		Response res= RestAssured.given()
		.log().all().contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/booking/1")
		.when().get();
		System.out.println(res.getTime());
		System.out.println(res.getTimeIn(TimeUnit.SECONDS));
		res.then().time(Matchers.lessThan(5000L));
		res.then().time(Matchers.greaterThan(2000L));
		 
	}

}
