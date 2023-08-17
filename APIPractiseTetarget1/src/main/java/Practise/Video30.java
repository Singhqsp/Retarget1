package Practise;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Video30 {
	@Test
	public void fetchMultipleData()
	{
		String path= System.getProperty("user.dir")+"./MultipleDataFetch.json";
	
		File f = new File(path);
		
		JsonPath jp = new JsonPath(f);
		
		System.out.println(jp.getString("[0].firstName"));
		   //It will fetch all the data of that perticular JSON which are similar
		   List<Object> fn = jp.getList("firstName");
		   System.out.println(fn+"d");
		   System.out.println(fn.toString()+"d");
		   
		   String ss = jp.getString("find{it.firstName=='Mukesh' & it.lastName=='Ota'}.age");
		   
		   System.out.println(ss);
		   
		   System.out.println(jp.getList("findAll{it.age>311}.firstName"));
		   	
	       System.out.println(jp.getInt("size()"));     
	}
	
	

}
