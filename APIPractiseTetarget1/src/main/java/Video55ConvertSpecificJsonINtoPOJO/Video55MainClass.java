package Video55ConvertSpecificJsonINtoPOJO;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video55MainClass {
	@Test
	public void nestedObjectPojo()
	{
		Video55Address vne= RestAssured.get("https://run.mocky.io/v3/d2466df2-a741-4b18-980e-c730435db21c")
	    .jsonPath()
	    .getObject("address",Video55Address.class);
		
		System.out.println(vne.getStreet());		
		
	}

}
