package Practise;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NestedJsonObject39 {
	
	@Test
	public void jsonIntoObjectData()
	{
		 Map d = RestAssured
		.get("https://run.mocky.io/v3/4067ea3b-8f75-4009-be7c-83b5e1d6c33f")
		.as(Map.class);
	     
		 Map<String,String> data= (Map<String,String>) d.get("skills");
		 System.out.println(data);
		System.out.println(data.get("java"));
		
	
	}

}
