package Practise;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AssertionVideo31InlineAssertion {
	@Test
	public void inlineAssertion()
	{
		RestAssured.given()
		.log().all()
		.contentType("application/json")
		.baseUri("https://restful-booker.herokuapp.com/auth")
		.body("{\r\n"
				+ "    \"username\" : \"admin\",\r\n"
				+ "    \"password\" : \"password123\"\r\n"
				+ "}")
		.when()
		.post()
		.then()
		.log()
		.all()
		//Check weather token is empty or not
		.body("token",Matchers.notNullValue())
		//It will also calculate the length is equal or not
		.body("token.length()",Matchers.is(15))
		//It will also calculate the length is equal or not
		
		.body("token.size()",Matchers.equalTo(15))
		
		//Check the regex data is present or not
		
		.body("token",Matchers.matchesRegex("^[a-z0-9]+$"));
		
		
		
	}

}
