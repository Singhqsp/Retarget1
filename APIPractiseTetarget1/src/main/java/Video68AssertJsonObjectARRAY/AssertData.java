package Video68AssertJsonObjectARRAY;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class AssertData {
	@Test
	public void verify()
	{
		RestAssured.get("https://run.mocky.io/v3/482cc702-bfc9-4974-921d-a8533ad813d1")
		.then()
		.body("$",Matchers.instanceOf(Map.class));
		
		RestAssured.get("https://run.mocky.io/v3/482cc702-bfc9-4974-921d-a8533ad813d1")
		.then()
		.body("eat",Matchers.instanceOf(List.class));
	
	}

}
