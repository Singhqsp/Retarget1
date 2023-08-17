package Practise;

public class Video50NestedJsonObject {
	
	private int id;
	private String name;
	private Video50InnerJsonObject adress;
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
	public Video50InnerJsonObject getAdress() {
		return adress;
	}
	public void setAdress(Video50InnerJsonObject v2) {
		this.adress = v2;
	}

}
