package seedu.addressbook.data.person;

//Credit Teo Ming Yi
public class PostalCode {
	
	private String postalCode;
	
	public PostalCode (String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getPostalCode(){
		return postalCode;
	}
	
	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public boolean equals(Object other){
		return other == this || (other instanceof PostalCode && this.postalCode.equals(((PostalCode) other).postalCode));
	}
}