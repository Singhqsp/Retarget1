package Practise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Vedio34JsonPayload {
	
	//@Test
	public void createDataMapsOfString()
	{
		Map<String,String> payloadString = new HashMap();
		
		payloadString.put("id", "1");
		payloadString.put("name", "Abhi");
		payloadString.put("rollNum", "123");
		payloadString.put("boolean", "false");
		
		RestAssured.given()
		.log()
		.all()
		.body(payloadString)
		.when()
		.get();
		
	}
	
	@Test
	public void createDataMapsOfObject()
	{
		Map<String,Object> payloadString = new LinkedHashMap<>();
		
		payloadString.put("id", 1);
		payloadString.put("name", "Abhi");
		payloadString.put("rollNum", 123);
		payloadString.put("boolean", false);
		
		RestAssured.given()
		.log()
		.all()
		.body(payloadString)
		.when()
		.get();
		
	}

}
