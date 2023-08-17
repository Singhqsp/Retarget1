package Video64JsonIncludePropertiesAnotation;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

@JsonIncludeProperties(value = {"id","street"})
public class PojoClass1 extends PojoClass {
	public int getStreet() {
		return street;
	}

	private int street;

}
