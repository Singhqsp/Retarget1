package Practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class Video22HeadersExamples {
	
	//@Test
	public void headers()
	{
		RestAssured.given().log().all()
		.header("Key1","value1")
		.when()
		.get();
	}
	//@Test
	public void PassingHeadersMultipleValue()
	{
		RestAssured.given().log().all()
		.header("Key1","value1")
		.header("Key1","value11111")
		.header("Key","val1","val2")
		.when()
		.get();
	}
	@Test
	public void passHeadersMap()
	{
		Map<String, String> headermap= new HashMap<>();
		headermap.put("h1","v1");
		headermap.put("h2","v2");
		headermap.put("h3","v3");
		headermap.put("h4","v4");
		headermap.put("h5","v5");
		
		RestAssured.given()
		.log().all()
		.headers(headermap)
		.when().get();				
	}
	@Test
	public void passHeaderInMaps()
	{
		List<Header> allHeade=new ArrayList<>();
		Header head = new Header("KK1","VV2");
		Header head1 = new Header("KK2","VV3");
		Header head2 = new Header("K1","VV4");
		allHeade.add(head);
		allHeade.add(head1);
		allHeade.add(head2);
		Headers headerall=new Headers(allHeade);
		RestAssured.given()
		.log().all()
		.headers(headerall)
		.when().get();
		
	}

}




