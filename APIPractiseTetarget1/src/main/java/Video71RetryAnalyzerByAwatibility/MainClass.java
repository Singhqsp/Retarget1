package Video71RetryAnalyzerByAwatibility;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class MainClass {
	@Test
	public static int test()
	{
		Random r = new Random();
		int num=r.nextInt(1);
		if(num%2==0)
		{
			Response res= RestAssured.given()
			.contentType(ContentType.JSON)
			.when()
			.get("https://restful-booker.herokuapp.com/booking/1");
			int resdata=res.getStatusCode();
			return  resdata;
			}
		else
		{
			return 0;
		}
	}

}
