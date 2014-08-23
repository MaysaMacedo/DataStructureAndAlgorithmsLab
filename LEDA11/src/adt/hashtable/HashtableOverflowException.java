package adt.hashtable;

public class HashtableOverflowException extends RuntimeException {

	public HashtableOverflowException() {
		super("Hashtable overflow!");
	}

}
