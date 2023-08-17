package Video65JsonIgnoreProderties;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExtractDynamicJSOn {
	@Test
	public void extractAllData() throws JsonMappingException, JsonProcessingException
	{
		String jsonData="\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "  \"ida\":2,\r\n"
				+ "  \"name\":\"star\"\r\n"
				+ "}";
		ObjectMapper om = new ObjectMapper();
		Emp em= om.readValue(jsonData,Emp.class);
		
		System.out.println(em.getAge());
		System.out.println(em.getStreet());
		System.out.println(em.getName());
		System.out.println(em.getId());
	}

}
