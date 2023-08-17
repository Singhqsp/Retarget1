package Practise;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Video57ConvertArrayResponseToList.Viseo51ArrayInsideJsonObject;
import io.restassured.RestAssured;

public class Video51FinalArrayInsideObject {
	@Test
	public void arrayInsideObject()
	{
		Viseo51ArrayInsideJsonObject c= new Viseo51ArrayInsideJsonObject();
		c.setId(123);
		c.setName("sss");
		
		Video51JsonObjectInner v2 = new Video51JsonObjectInner();
		v2.setCity("ALD");
		v2.setDistict("DYD");
		
		Video51JsonObjectInner v3 = new Video51JsonObjectInner();
		v3.setCity("ALD1");
		v3.setDistict("DYD1");
		
		List l = new ArrayList<>();
		l.add(v2);
		l.add(v3);
		
		c.setAdress(l);
		
		RestAssured.given()
		.log().all()
		.body(c)
		.get();
		
		
		
		
		
	
	}

}
