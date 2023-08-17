package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video36JsonArrayPayload {
	
	@Test
	public void createArrayPayload()
	{
		Map<String, Object> empDetail= new LinkedHashMap<>();
		empDetail.put("id",1);
		empDetail.put("name","sss");
		empDetail.put("class",3);
		empDetail.put("Com","TCS");
		
		Map<String, Object> empDetai= new LinkedHashMap<>();
		empDetai.put("id",1);
		empDetai.put("name","sss");
		empDetai.put("class",3);
		empDetai.put("Com","TCS");
		
		
		List allEmp= new ArrayList<>();
		allEmp.add(empDetail);
		allEmp.add(empDetai);
		
		RestAssured .given()
		.log()
		.all()
		.body(allEmp)
		.get();
		
		
		
		
		
		
		
		
		
		
	}
	 
	
	

}
