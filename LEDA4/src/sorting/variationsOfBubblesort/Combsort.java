package sorting.variationsOfBubblesort;

import sorting.SortingImpl;
import sorting.Util;

/**
 * The combsort algoritm. 
 */
public class Combsort<T extends Comparable<T>> extends SortingImpl<T> {
	@Override
	protected void sort(T[] array,int leftIndex, int rightIndex) {
		
		if(!(rightIndex != 0 && leftIndex < rightIndex && array.length > rightIndex && array.length != 0)){
			return;
		}
		int g = rightIndex - leftIndex + 1,change = 1 ;
		
		while(g != 1 || change == 1){
			int i = leftIndex;
			change = 0;
			if(g > 1)
				g = (int) (g/1.25);
			while(i+g <= rightIndex){
				if(array[i] .compareTo(array[i+g]) > 0){
					Util.swap(array, i,i+g);
					change = 1;
				}i++;				
			}
		}
	}
}
