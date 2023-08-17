package Video61DynamicJsonPayLoadJNON_NULL;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DynamicJsonPayload {
	@Test
	public void dynamicData() throws JsonProcessingException
	{
	PojoClass pc = new PojoClass();
	pc.setId(1);
	pc.setCityName("DD");
	pc.setHouseNo(232);
	ObjectMapper om = new ObjectMapper();
	//String data= om.writeValueAsString(pc);
	String data= om.writerWithDefaultPrettyPrinter().writeValueAsString(pc);
	System.out.println(data);
	}
}
