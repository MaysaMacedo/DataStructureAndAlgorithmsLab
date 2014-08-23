package adt.hashtable;

public class HashFunctionDivisionMethodImpl<T> implements
		HashFunctionClosedAddress {

	protected Hashtable<T> hashtable;

	public HashFunctionDivisionMethodImpl(Hashtable<T> hashtable) {
		this.hashtable = hashtable;
		//Adjust your constructor to initialize the hashtable attribute with the correct hash function
		
	}
	
	/**
	 * The hash function might use the length of the hashtable. This can be captured through the method
	 * capacity of the hashtable.
	 */
	@Override
	public int hash(Object element) {
		return Math.abs((element.hashCode()) % hashtable.capacity());
	}

}
