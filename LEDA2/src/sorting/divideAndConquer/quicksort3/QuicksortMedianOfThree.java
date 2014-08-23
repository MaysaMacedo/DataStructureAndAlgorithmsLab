package sorting.divideAndConquer.quicksort3;


import java.util.Arrays;

import sorting.SortingImpl;
import sorting.Util;

/**
 * The interface describing the algorithm of quicksort median of 3. 
 * The implementation of the algorithm must be in-place!
 */
public class QuicksortMedianOfThree<T extends Comparable<T>> extends SortingImpl<T>{
	
	public void sort(T[] array, int leftIndex, int rightIndex) {
		

		if(leftIndex < rightIndex && rightIndex != 0 &&  array.length > rightIndex && array.length != 0){
		
			int middle = (rightIndex - leftIndex + 1 )/2 + leftIndex;
			quicksort3(array, leftIndex, rightIndex);
			Util.swap(array, middle , rightIndex - 1);
			int pivot = quick(array, leftIndex + 1, rightIndex - 1);
			System.out.println(Arrays.toString(array));
			sort(array, leftIndex, pivot-1);
			sort(array, pivot +1, rightIndex);
		}
		
		
	}
	private void quicksort3(T[] array, int leftIndex, int rightIndex) {
		
		int middle = ((rightIndex - leftIndex + 1)/2 +leftIndex);
		
		if(array[rightIndex].compareTo(array[middle]) < 0)
			Util.swap(array,rightIndex, middle );
		if(array[rightIndex ].compareTo(array[leftIndex]) < 0)
			Util.swap(array, rightIndex, leftIndex);
		if(array[leftIndex].compareTo(array[middle]) > 0)
			Util.swap(array, leftIndex, middle);
	}
	
	private int quick(T[] array, int left, int right) {
		int i = left;
		int j = right - 1;
		T q = array[right];
		
		while(i <= j){
			if(array[i].compareTo(q) <= 0) {
				i++;
			} else if (array[j].compareTo(q) > 0){
				j--;
			} else {
				 Util.swap(array,i,j);
			}
			 
		}
		Util.swap(array, right, i);
		return i;
	}
}
