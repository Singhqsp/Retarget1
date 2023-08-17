package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Video37 {
	
	/*{
		  "id":1,
		  "firstName":"abhi",
		  "lastName":"Singh",
		  "email":"xyz@gmail.com",
		  "gender":"M",
		  "mobNum":[
		    "12345678",
		    "987654321"
		    
		  ],
		  "skils":{
		    "Java":"*****",
		    "Automation":"**"
		  }
		  
		  
		}
	*/
	@Test
	public void createComplexData()
	{

		List finalPayload=new ArrayList();
		
		
		Map<String, Object> payload1=new LinkedHashMap<>();
		payload1.put("id", 1);
		payload1.put("firstName","Abhi");
		payload1.put("ln","Singh");
		payload1.put("email","xyz@gmail.com");
		payload1.put("Gender","M ");
		
		List mobNum=new ArrayList<>();
		mobNum.add("1234567");
		mobNum.add("8889899");
		payload1.put("monNum", mobNum);
		
		
		Map<String, Object> skills=new HashMap<>();
		
		skills.put("java","****");
		skills.put("Auto","***");
		
		payload1.put("Skills",skills);
		
		finalPayload.add(payload1);
		
		
		Map<String, Object> payload2=new LinkedHashMap<>();
		payload2.put("id", 1);
		payload2.put("firstName","Abhi");
		payload2.put("ln","Singh");
		payload2.put("email","xyz@gmail.com");
		payload2.put("Gender","M ");
		
		List mobNum1=new ArrayList<>();
		mobNum1.add("1234567");
		mobNum1.add("8889899");
		payload1.put("monNum", mobNum1);
		
		
		Map<String, Object> skills1=new HashMap<>();
		
		skills1.put("java","****");
		skills1.put("Auto","***");
		
		payload1.put("Skills",skills1);
		
		finalPayload.add(payload2);
		
		RestAssured.given()
		.log().all()
		.body(finalPayload)
		.when()
		.get();
		
		
		
		
	}

}
