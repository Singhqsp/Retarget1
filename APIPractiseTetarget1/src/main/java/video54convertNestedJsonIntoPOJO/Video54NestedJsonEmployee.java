package video54convertNestedJsonIntoPOJO;
/*{
	"id":1,
	"name":"Ramu",
	"Age":33,
	"adress":
	        {
		      "city":"Pak",
		      "country;":"TAT",
		      "Street":44
	        }
}*/
public class Video54NestedJsonEmployee {
	
	private int id;
	private String name;
	private int age;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//private Address address;

		
	
	
	
	
	
	

}
