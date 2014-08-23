package sorting;

public abstract class SortingImpl<T extends Comparable<T>> implements Sorting<T> {

	/**
	 * This implementation uses another method that sorts the array from an leftIndex to a rightIndex.
	 * Obviously, if the entire array will be sorted, then the leftIndex is 0 and the right index
	 * is array.length-1. 
	 */
	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length-1);
	}
	
	/**
	 * This method sorts a piece of an array. The piece is specified from leftIndex (inclusive)
	 * to the rightIndex (inclusive). The method is in-place.
	 */
	protected abstract void sort(T[] array, int leftIndex, int rightIndex);
	
}
