package Practise;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Video24JsonIntro {
	@Test
	public void JsonIntroData()
	{
		String jsonData="{\r\n"
				+ "  \"fn\":\"Raja\",\r\n"
				+ "  \"ln\":\"Rani\"\r\n"
				+ "}";
		JsonPath jp = new JsonPath(jsonData);
		String data= jp.get("fn");
		System.out.println(data);
		
		
	}

}
