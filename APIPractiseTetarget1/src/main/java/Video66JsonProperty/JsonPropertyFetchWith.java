package Video66JsonProperty;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertyFetchWith {
	
	@Test
	public void serializeAndUnserializeVaiable() throws Throwable
	{
		PojoClass pc = new PojoClass();
		pc.setAuthorName("RS DATA");
		pc.setBookNAme("RRR");
		ObjectMapper om = new ObjectMapper();
		String objectData= om.writerWithDefaultPrettyPrinter().writeValueAsString(pc);
	
		System.out.println(objectData);
		
		 om.readValue(objectData,PojoClass.class);
		
	}

}
