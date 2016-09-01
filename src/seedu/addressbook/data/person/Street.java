package seedu.addressbook.data.person;

//Credit Teo Ming Yi
public class Street {
	
	private String street;
	
	public Street (String street){
		this.street = street;
	}
	
	public String getStreet(){
		return street;
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public boolean equals(Object other){
		return other == this || (other instanceof Street && this.street.equals(((Street) other).street));
	}
}