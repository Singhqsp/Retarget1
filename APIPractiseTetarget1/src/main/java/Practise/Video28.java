package Practise;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Video28 {
	@Test
	public void JsonArray()
	{
		String data="[\r\n"
				+ " \"10\",\r\n"
				+ " \"20\",\r\n"
				+ " \"30\",\r\n"
				+ " \"40\",\r\n"
				+ " \"50\"\r\n"
				+ "]";
		JsonPath jp = new JsonPath(data);
		System.out.println(jp.getString("[3]"));
	    List<Object> list = jp.getList("$");
	    System.out.println(list.size());
	
	
	}
	@Test
	public void multipleElemet()
	{
		String data="[\r\n"
				+ "  [\r\n"
				+ "	\"10\",\r\n"
				+ "	\"20\",\r\n"
				+ "	\"30\",\r\n"
				+ "	\"40\",\r\n"
				+ "	\"50\"\r\n"
				+ "],\r\n"
				+ "[\r\n"
				+ "	\"10\",\r\n"
				+ "	\"20\",\r\n"
				+ "	\"30\",\r\n"
				+ "	\"40\",\r\n"
				+ "	\"50\"\r\n"
				+ "]\r\n"
				+ "]";
		
		JsonPath jp = new JsonPath(data);
		System.out.println(jp.getString("[1][1]"));
		System.out.println(jp.getList("$").size());//Size of all Array it will give
		//But I want the particular array so
		System.out.println(jp.getList("$").get(1));//[10,20,30,40,50]
		 
		List<Object> l = (List<Object>) jp.getList("$").get(1);
		System.out.println(l.size());
		
		
	}
	
}
