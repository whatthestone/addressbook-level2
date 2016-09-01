package seedu.addressbook.data.person;

//Credit Teo Ming Yi
public class Block {
	
	private String block;
	
	public Block (String block){
		this.block = block;
	}
	
	public String getBlock(){
		return block;
	}
	
	public void setBlock(String block){
		this.block = block;
	}
	
	public boolean equals(Object other){
		return other == this || (other instanceof Block && this.block.equals(((Block) other).block));
	}
}