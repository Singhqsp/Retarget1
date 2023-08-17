package Practise;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Video30FileJsonFetch {
	@Test
	public void m1()
	{
		String s = System.getProperty("user.dir")+"./JsonFileVideo30.json";
		File f = new File(s);
		System.out.println(s);
		JsonPath jp = new JsonPath(f);
		System.out.println(jp.getString("[2][1].city"));
	}

}
