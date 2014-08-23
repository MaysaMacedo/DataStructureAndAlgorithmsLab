package adt.hashtable;

/**
 * This class is an implementation of the hash function using linear probing. 
 */
public class HashFunctionLinearProbingImpl<T> implements HashFunctionOpenAddress {

	protected Hashtable<T> hashtable;
	
	// The auxiliary hash function used by linear probing.
	protected HashFunctionClosedAddress originalHashFunction;
	
	public HashFunctionLinearProbingImpl(Hashtable<T> hashtable, HashFunctionClosedAddressMethod method) {
		super();
		this.hashtable = hashtable;
		originalHashFunction = new HashFunctionDivisionMethodImpl<>(hashtable);
	}
	
	/**
	 * The hash function might use the length of the hashtable. This can be captured through the method
	 * capacity of the hashtable.
	 */
	@Override
	public int hash(Object element, int probe) {
		return Math.abs((originalHashFunction.hash(element)+probe) % hashtable.capacity());
	}

}
