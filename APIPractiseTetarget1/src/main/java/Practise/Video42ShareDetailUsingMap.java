package Practise;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class Video42ShareDetailUsingMap {
	public static LinkedHashMap<String , Object> dataMap=new LinkedHashMap<String,Object>(); 
	public static  void mapadddata(String key,Object value)
	{
		dataMap.put(key, value);
		
		
		//return dataMap;
	   	
	}
	public static Object getValue(String key)
	{
		Object data = dataMap.get(key);
		System.out.println("-------------------------");
		System.out.println(data);
		return data;
	}

}
class MainSharingClass{
	@Test(priority = 1)
	public void dataidCreate()
	{
	   int id = RestAssured.given()
		
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Jim\",\r\n"
				+ "    \"lastname\" : \"Brown\",\r\n"
				+ "    \"totalprice\" : 111,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2018-01-01\",\r\n"
				+ "        \"checkout\" : \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
				+ "}")
		.contentType("application/json")
		.when()
		.post()
		.then()
		.log()
		.all()
		.extract().jsonPath().getInt("bookingid");
		
		Video42ShareDetailUsingMap.mapadddata("bookingid",id);
		//System.out.println(id);
	 	}
	@Test(priority = 2)
	public void dataIdfetch()
	{
		System.out.println("+++++++++++++++++++++++++");
		RestAssured.given()
		.log().all().baseUri("https://restful-booker.herokuapp.com/booking/"+Video42ShareDetailUsingMap.getValue("bookingid"))
		.when()
		.get()
		.then()
		.log().all();
		
		
	}
	
	
}