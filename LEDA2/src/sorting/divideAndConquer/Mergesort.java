package sorting.divideAndConquer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import sorting.SortingImpl;

public class Mergesort<T extends Comparable<T>> extends SortingImpl<T> {

	@Override
	protected void sort(T[] array,int leftIndex, int rightIndex) {
		if(rightIndex != 0 && rightIndex < array.length && leftIndex < rightIndex && array.length != 0){
		if(array.length > 1){
			T[] left = Arrays.copyOfRange(array , leftIndex ,leftIndex + (rightIndex - leftIndex + 1 )/ 2);
			T[] right = Arrays.copyOfRange(array ,leftIndex + (rightIndex - leftIndex + 1 )/ 2  , rightIndex + 1);
			
			sort(left , 0 , left.length-1); //gera uma arvore 
			sort(right , 0 , right.length-1);
			T[] list = merge( left , right);
			for(int i = 0; i < list.length ; i++){
				array[i +leftIndex] = list[i];
			}
			}}
		
	}
	
	private T[] merge(T[] left, T[] right) {
		T[] array = (T[]) Array.newInstance(left[0].getClass(), left.length+right.length);
		int index = 0;
		int i = 0;
		int j = 0;
		while( left.length > i && right.length > j) {
			if (left[i].compareTo(right[j]) <= 0) {
				array[index] = left[i];
				index ++;
				i++;
			
			} else {
				array[index] = right[j];
				index ++;
				j++;
			}


		}
		if (i < left.length){
			for (int k = i ; k < left.length; k++) {
				array[index] = left[k];
				index ++;
			} 
		}
		
		if (j < right.length){
			for(int k = j ; k < right.length ; k++){
				array[index] = right[k];
				index++;
			}
		}
		
	
		return array;
}
}
		// Vai dividindo várias vezezs até chegar no caso base , quando chegar no caso base
		// ele ordena.