package Practise;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import com.github.scribejava.core.model.Response;

import io.restassured.RestAssured;

public class Video41DynamicElement {
	
	//@Test
	public void arrayFetchByObjectResponse()
	{
		io.restassured.response.Response res= RestAssured.when().get("https://run.mocky.io/v3/74d64c78-0c66-4126-a82f-5d9b3c07e91f");
		  
		Map data = res.as(Map.class);
		
		System.out.println(data.keySet());
		//RTEcom.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize value of type `java.util.LinkedHashMap
		
		
		
		
		
	
		
	}
	//@Test
	public void fetchArrayGotArray()
	{
		//here I am providing Proper array so array data fetching
		io.restassured.response.Response res= RestAssured.get("https://run.mocky.io/v3/fdae525f-ac6b-41d1-a22a-559bb3ce3010");
		  
		 List data = res.as(List.class);
		
		System.out.println(data.size());
		
	}
//	@Test
	public void fetchArrayGotObject()
	{
		//here I am providing Proper array so array data fetching
		io.restassured.response.Response res= RestAssured.get("https://run.mocky.io/v3/2407d9ad-8332-42f4-b739-6d627b3ec160");
		  
		 List data = res.as(List.class);
		
		System.out.println(data.size());
		
	}
	@Test
	public void dynamicDataFetch()
	{
		io.restassured.response.Response res= RestAssured.get("https://run.mocky.io/v3/2407d9ad-8332-42f4-b739-6d627b3ec160");
		
		            Object resObject = res.as(Object.class);
		            
		            if(resObject instanceof Map)
		            {
		            	Map data = (Map) resObject;
		            	
		            	System.out.println(data.keySet());
		            }
		            else {
						List data = (List) resObject;
						
						System.out.println(data.size());
					}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
