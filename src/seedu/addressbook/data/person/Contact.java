package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

    public final String value;
    public boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        this.value = contact;
    }
    
    protected Contact(){  
    	this.value = "";
    }  
    
	public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
}
