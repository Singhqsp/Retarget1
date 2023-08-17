package Practise;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

/*{
	"id":"21"
	"age":35,
	"adaress":{
		"City":"Hyd",
		"Street":"2",
		"location":"hyderabad"
		 
	}
}
*/
public class NestedJsonObjectPayloadVideo35 {
	
	@Test
	public void nestedJsonObjectCheck()
	{
		Map<String,Object> O=new LinkedHashMap();
		O.put("id","21");
		O.put("ade",35);
		
		Map<String,Object> adrMap=new LinkedHashMap();
		adrMap.put("City","Hyd");
		adrMap.put("Street","2");
		adrMap.put("location","hyderabad");
		
		O.put("adress",adrMap);
		
		RestAssured.given()
		.log().all()
		.body(O)
		.when()
		.get()
		;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
