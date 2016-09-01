package seedu.addressbook.data.person;

//Credit Teo Ming Yi
public class Unit {
	
	private String unit;
	
	public Unit (String unit){
		this.unit = unit;
	}
	
	public String getUnit(){
		return unit;
	}
	
	public void setUnit(String unit){
		this.unit = unit;
	}
	
	public boolean equals(Object other){
		return other == this || (other instanceof Unit && this.unit.equals(((Unit) other).unit));
	}
}