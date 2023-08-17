package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video53JsonResponsetoPojo {
	
	@Test
	public void resToPojo()
	{
		Video53EMP vm= RestAssured.get("https://run.mocky.io/v3/e56acc5f-127c-4dcc-9d89-90e004db66cc")
		.as(Video53EMP.class);
		
		System.out.println(vm.getAge());
		
		
		
	}

}
