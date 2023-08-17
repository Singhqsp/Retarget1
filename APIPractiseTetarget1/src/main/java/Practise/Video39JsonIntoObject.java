package Practise;

import java.util.Map;

import org.checkerframework.checker.units.qual.K;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Video39JsonIntoObject {

	@Test
	public void jsonIntoObjectData()
	{
		 Map d = RestAssured.when()
		.get("https://run.mocky.io/v3/d4c02069-256c-4dfa-9c2c-cb0f3287165a")
		.as(Map.class);
		 
		 String data= (String) d.get("name"); 
		 System.out.println(data);
		 
		 d.keySet().forEach(K -> System.out.println(K));
	}
}
