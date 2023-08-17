package video54convertNestedJsonIntoPOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video54MainClass {
	@Test
	public void nestedObjectPojo()
	{
		Video54NestedJsonEmployee vne= RestAssured.get("https://run.mocky.io/v3/d2466df2-a741-4b18-980e-c730435db21c")
		.as(Video54NestedJsonEmployee.class);
		
		System.out.println(vne.getAge());
		
		//System.out.println("++++++++++"+vne.getId());
		
		
	}

}
