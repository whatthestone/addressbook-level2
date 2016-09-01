package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
//Credit Teo Ming Yi
/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses should be in this format:" + "BLOCK, STREET, UNIT, POSTAL_CODE ";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private boolean isPrivate;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    
    public static final int INDEX_BLOCK = 0;
    public static final int INDEX_STREET = 1;
    public static final int INDEX_UNIT = 2;
    public static final int INDEX_POSTALCODE = 3;
    public static final int NUMBER_OF_COMPONENTS = 4;
    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (address == null || !isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] value = address.split(", ");
        block = new Block(value[INDEX_BLOCK]);
        street = new Street(value[INDEX_BLOCK]);
        unit = new Unit(value[INDEX_UNIT]);
        postalCode = new PostalCode(value[INDEX_POSTALCODE]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.split(", ").length == NUMBER_OF_COMPONENTS;
    }

    @Override
    public String toString() {
        return block.getBlock() + ", " + street.getStreet() + ", " + unit.getUnit() + ", " + postalCode.getPostalCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
	                && this.block.equals(((Address) other).block)
	                && this.street.equals(((Address) other).street)
	                && this.unit.equals(((Address) other).unit)
	                && this.postalCode.equals(((Address) other).unit)
	                );
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}