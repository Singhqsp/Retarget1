package Video62DynamicJsonPayloadNONEMPTY;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PojoClass {
    private int id;
    private int houseNo;
    private String cityName;
    private List listdata;
    private Map<String,Object> mapData;
	public List getListdata() {
		return listdata;
	}
	public void setListdata(List listdata) {
		this.listdata = listdata;
	}
	public Map<String, Object> getMapData() {
		return mapData;
	}
	public void setMapData(Map<String, Object> mapData) {
		this.mapData = mapData;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
    

}
