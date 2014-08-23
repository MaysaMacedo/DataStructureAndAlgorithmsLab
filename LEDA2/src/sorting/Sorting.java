package sorting;

/**
 *The interface of all sorting algorithms. It contains only the signature of the sort method.  
 *This method must be implemented according to the specific algorithm.
 */
public interface Sorting<T extends Comparable<T>> {
	
	/**
	 * It sorts the array considering all elements. It must make use of another method 
	 * that sorts an array from a left index to a right index. 
	 * See the class SortingImpl for details.  
	 */
	public void sort(T[] array);
}
