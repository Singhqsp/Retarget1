package Video59JsonWriteDataPartially;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import video58ReadDataFromFileSendToPOjo.PojoClass;

public class DynmaicDataWriteInPojo {
	
	@Test
	public void dynamicDataWrite() throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper om = new ObjectMapper();
		
		PojoClass pc= om.readValue(new File("./Video58JsonData.Json"),PojoClass.class);

		pc.setCityName("DDDD");
		
		String dataWritten = om.writeValueAsString(pc);
		
	     System.out.println(pc.getCityName());
		
	}

}
