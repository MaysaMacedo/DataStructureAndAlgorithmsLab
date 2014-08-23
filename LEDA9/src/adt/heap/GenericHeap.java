package adt.heap;

public interface GenericHeap<T extends Comparable<T>> {

	public abstract boolean isEmpty();

	/**
	 * Inserts a new element into the heap and maintains the invariant.
	 */
	public abstract void insert(T element);

	/**
	 * Removes and returns the root element of the heap. The method returns null 
	 * if the heap is empty. If the heap is min-heap the element is the minimum of the heap; 
	 * otherwise, the heap is max-heap and the element is the maximum of the heap.
	 */
	public abstract T extractRootElement();
	
	

	/**
	 * Returns the root element without removing it. It returns null if the heap is empty. 
	 * If the heap is min-heap the element is the minimum of the heap; 
	 * otherwise, the heap is max-heap and the element is the maximum of the heap.
	 */
	public T rootElement();
	
	/**
	 * Sorts the elements of an array by using the heap concept. In a max-heap, the sorting must occur 
	 * in the internal array of the heap. At the end, the method returns a copy (another array) 
	 * containing only the not null elements of the internal array. This means the method must first
	 * reset this heap, then building a new heap and finally applying the real sorting.
	 * In a min-heap this method simply extracts the elements of the head and puts them into an auxiliary 
	 * array  that is returned at the end.
	 */ 
	public abstract T[] heapsort(T[] array);

	/**
	 * This method is intended to build the heap with the elements of a given array. 
	 * Thus, if the heap has already elements, they are lost (that is the heap is reseted) and 
	 * the heap is built with new elements.  
	 */
	public abstract void buildHeap(T[] array);

	/**
	 * Returns an array representing the underlying structure (internal array) of the heap.
	 * @return
	 */
	public abstract T[] toArray();

}