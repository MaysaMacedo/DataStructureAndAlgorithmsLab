package adt.hashtable;

import java.util.LinkedList;

public class HashtableOpenAddressLinearProbingImpl<T> extends
		AbstractHashtable<T, Object> {
	
	// DO NOT DELET THIS CONSTRUCTOR. ADJUST IT.
	public HashtableOpenAddressLinearProbingImpl(int size,HashFunctionClosedAddressMethod method) {
		super(size);
		//TODO Adjust your constructor here
		// The length of the internal table must be given size
		// the hash function must be an implementation of linear probing. 
		table =  new Object[size];
	    hashFunction = new HashFunctionLinearProbingImpl(this, method);
	}
	
	@Override
	public void insert(T element) {
		int probi = 0;
		int hash = ((HashFunctionLinearProbingImpl<T>) hashFunction).hash(element,probi);
		if(size() == table.length)
			throw new HashtableOverflowException();
		if(element != null){
		while(probi != table.length-1){
			if(search(element)!= null)
				break;
			if(table[hash] == null || table[hash] instanceof DELETED){
				table[hash] = element;
				elements ++;
			}
			else{
				probi ++;
				hash = ((HashFunctionLinearProbingImpl<T>) hashFunction).hash(element,probi);
				COLLISIONS ++;}
		}}
	}

	@Override
	public void remove(T element) {
		if(element != null){
		if(search(element) != null){
			table[indexOf(element)] = new DELETED();
			elements --;
		}}
	}

	@Override
	public T search(T element) {
		if(element!=null){
		if(indexOf(element) != -1) {
			return element;
		}
		}
		return null;
		
	}

	@Override
	public int indexOf(T element) {
		if(element != null){
		int probi = 0;
		int hash = ((HashFunctionLinearProbingImpl<T>) hashFunction).hash(element,probi);
		while(probi != table.length-1){
			if(table[hash] == null){
				return -1;
				}
			if(table[hash].equals(element)){
				return hash;
			}else {
				probi ++;
				hash = ((HashFunctionLinearProbingImpl<T>) hashFunction).hash(element,probi);
			}
		}
		}return -1;
	}

}
