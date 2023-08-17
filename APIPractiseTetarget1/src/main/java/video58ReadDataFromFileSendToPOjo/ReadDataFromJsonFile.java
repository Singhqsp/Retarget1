package video58ReadDataFromFileSendToPOjo;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadDataFromJsonFile {
	
	@Test
	public void resdJsonFile() throws StreamReadException, DatabindException, IOException
	{
		ObjectMapper om = new ObjectMapper();
		
		PojoClass pc= om.readValue(new File("./Video58JsonData.Json"),PojoClass.class);
		
	     System.out.println(pc.getHouseNo());
		
	}

}
