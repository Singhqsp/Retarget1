package Practise;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.scribejava.core.model.Response;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Assertion31Video {
	@Test
	public void assertToken()
	{
	  String d=RestAssured.given()
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
		.log().all()
		//.statusCode(200)
		.extract()
		.asString();
	  
	  JsonPath jp = new JsonPath(d);
	  
      System.out.println(jp.getString("token").toString());
	  
	  
	  Assert.assertNotNull(jp.get("token"));
	  
	  
	  
	 
	}

}
