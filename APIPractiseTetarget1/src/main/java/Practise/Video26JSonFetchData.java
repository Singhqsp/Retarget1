package Practise;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class Video26JSonFetchData {
	
	@Test
	public void JsonDataFetch()
	{
		String data="{\r\n"
				+ "  \"Name\":\"Abhi\",\r\n"
				+ "  \"Rollnum\":123,\r\n"
				+ "  \"trainer\":\"maths\",\r\n"
				+ "   \"sal\":212,\r\n"
				+ "   \"adress\":{\r\n"
				+ "     \"place\":\"Hyd\",\r\n"
				+ "     \"Area\":\"KPHB\"\r\n"
				+ "     \r\n"
				+ "     \r\n"
				+ "   }\r\n"
				+ "  \r\n"
				+ "  \r\n"
				+ "}";
		
		JsonPath js = new JsonPath(data);
		
		System.out.println(js.get("Name"));
		System.out.println(js.getString("adress.place"));
		
		
		
	}

}
