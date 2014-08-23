package sorting.variationsOfBubblesort;

import sorting.SortingImpl;
import sorting.Util;

/**
 * The implementation of the algorithm must be in-place! 
 */
public class Gnomesort<T extends Comparable<T>> extends SortingImpl<T>{
	protected void sort(T[] array,int leftIndex, int rightIndex){
	
		if(!(rightIndex != 0 && leftIndex < rightIndex && array.length > rightIndex && array.length != 0)){
			return;
		}
		int pos = leftIndex + 1;
		while(pos <= rightIndex){
			if(array[pos].compareTo(array[pos-1]) >= 0){
				pos ++;
			
			}else{
				Util.swap(array, pos, pos-1);
			if(pos > leftIndex + 1)
				pos --;
			else
				pos ++;
		
			}
		}
	}
}

