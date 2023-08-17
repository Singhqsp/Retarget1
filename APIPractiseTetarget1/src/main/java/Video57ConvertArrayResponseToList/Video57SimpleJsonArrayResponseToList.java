package Video57ConvertArrayResponseToList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Video57SimpleJsonArrayResponseToList {
	@Test
	public void convertToList()
	{
		List<PojoClass> pj= RestAssured.get("https://run.mocky.io/v3/f5c6e003-7c92-4816-8109-0b2a0bba7b5a")
	    .as(new TypeRef<List<PojoClass>>() {});
		
		System.out.println(pj.get(0).getHouseNo());
		
		
	}
	

}
