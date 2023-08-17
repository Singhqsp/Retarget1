package Practise;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video49ArrayJSonPaypoadByPOJO {
	
	@Test
	public void JsonArrayPryload()
	{
		Video48_49POJOClass vp= new Video48_49POJOClass();
		vp.setCity("ALD");
		vp.setName("AAA");
		vp.setRollNum(1234);
		vp.setX(333);
		
		Video48_49POJOClass vp1= new Video48_49POJOClass();
		vp.setCity("ALD1");
		vp.setName("AAA1");
		vp.setRollNum(12341);
		vp.setX(3331);
		
		List multiplObjectArray= new ArrayList();
		multiplObjectArray.add(vp);
		multiplObjectArray.add(vp1);
		
		RestAssured.given()
		.log().all()
		.body(multiplObjectArray)
		.get();
	}

}
