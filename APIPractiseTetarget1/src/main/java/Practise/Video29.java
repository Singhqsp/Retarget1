package Practise;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Video29 {
	
	@Test
	public void m1()
	{
		String s="[\r\n"
				+ "  {\r\n"
				+ "   \"firstName\":\"Mukesh\",\r\n"
				+ "   \"lastName\":\"Ota\",\r\n"
				+ "    \"age\":      31,\r\n"
				+ "     \"adress\":[\r\n"
				+ "           {\r\n"
				+ "             \"city\":\"ald\",\r\n"
				+ "             \"country\":\"India\"             \r\n"
				+ "           },\r\n"
				+ "           {\r\n"
				+ "             \"city\":\"pak\",\r\n"
				+ "             \"country\":\"India\"             \r\n"
				+ "           }\r\n"
				+ "\r\n"
				+ "              ]\r\n"
				+ "              \r\n"
				+ "  },\r\n"
				+ " {\r\n"
				+ "   \"firstName\":\"Dona\",\r\n"
				+ "   \"lastName\":\"Ota\",\r\n"
				+ "    \"age\":           3,\r\n"
				+ "     \"adress\":[\r\n"
				+ "           {\r\n"
				+ "             \"city\":\"cnb\",\r\n"
				+ "             \"country\":\"India\"             \r\n"
				+ "           },\r\n"
				+ "           {\r\n"
				+ "             \"city\":\"Ban\",\r\n"
				+ "             \"country\":\"India\"             \r\n"
				+ "           }\r\n"
				+ "\r\n"
				+ "                    ]\r\n"
				+ "              \r\n"
				+ "  }\r\n"
				+ "]";
		JsonPath jp = new JsonPath(s);
		String data= jp.getString("[0].adress[0].city");
		System.out.println(data);
		
	}

}
