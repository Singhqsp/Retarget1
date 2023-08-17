package Video66JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PojoClass {
	@JsonProperty("book Name")
	private String bookNAme;
	@JsonProperty("auth Name")
	private String authorName;
	public String getBookNAme() {
		return bookNAme;
	}
	public void setBookNAme(String bookNAme) {
		this.bookNAme = bookNAme;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	

}
