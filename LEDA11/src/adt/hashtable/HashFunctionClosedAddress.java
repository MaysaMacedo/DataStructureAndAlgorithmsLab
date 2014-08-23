package adt.hashtable;

/**
 * The kind of method used by a hash function for closed addressing. 
 */
enum HashFunctionClosedAddressMethod {DIVISION, MULTIPLICATION}

/**
 * It represents a hash function to be used in hashtable that work with closed address. 
 */
public interface HashFunctionClosedAddress extends HashFunction {
	
	/**
	 * The hash function considering closed address. It uses the hashCode method inherited from Object.  
	 */
	public int hash(Object element);
}
