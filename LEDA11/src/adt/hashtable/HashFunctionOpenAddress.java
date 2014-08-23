package adt.hashtable;

/**
 * The kind of method used by a hash function for open addressing. 
 */
enum HashFunctionOpenAdressMethod {LINEAR_PROBING, QUADRATIC_PROBING, DOUBLE_HASHING}

/**
 * It represents a hash function to be used in hashtable that work with open address. 
 */
public interface HashFunctionOpenAddress extends HashFunction {
	/**
	 * The hash function considering  open address. It uses the hashCode method inherited from Object.  
	 */
	public int hash(Object element, int probe);
}
