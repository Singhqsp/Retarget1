package Practise;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class VIdeo40JsonArrayResponseToJavaList {
	//https://run.mocky.io/v3/e1cd9e3a-629d-4517-b749-3c740e8694be
	/*[
	{
	"id": "1",
	"name": "Raja",
	"last-named": "Singh",
	"phone": {
	"home": 1234,
	"office": 33232
	}
	},
	{
	"id": "2",
	"name": "Raj",
	"last-named": "Sing",
	"phone": {
	"home": 12343,
	"office": 332323
	}
	}
	]
	*/
	//@Test
	public void arrayResponse()
	{
		List<Object> array = RestAssured.given()
		.log().all()
		.get("https://run.mocky.io/v3/e1cd9e3a-629d-4517-b749-3c740e8694be")
		.as(List.class);
		
		System.out.println(array.size());
		
		System.out.println(array.get(0));//Print peticular
		
		Map<Object, String> obj =(Map<Object, String>) array.get(0);
		
		System.out.println(obj.get("id"));
		
		
	}
	@Test
	public void arrayResponseGenric()
	{
		List<Map<String, Object>> array = RestAssured.given()
		.log().all()
		.get("https://run.mocky.io/v3/e1cd9e3a-629d-4517-b749-3c740e8694be")
		.as(new TypeRef<List<Map<String,Object>>>() {
		});
		
		System.out.println(array.size());
		
		System.out.println(array.get(0));//Print peticular
		
		Map<String, Object> data= array.get(0);
		System.out.println(data);
		System.out.println(data.get("id"));
		
	}


}
