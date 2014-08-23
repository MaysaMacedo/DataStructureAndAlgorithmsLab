package sorting.linearSorting;

import java.util.Arrays;

import sorting.SortingImpl;

public class Countingsort extends SortingImpl<Integer> {

	@Override
	protected void sort(Integer[] array,int leftIndex, int rightIndex) {
		
		if(rightIndex != 0 && leftIndex < rightIndex && array.length > rightIndex && array.length != 0){
		int[] arrayC = new int[100];
		int[] arrayB= new int[rightIndex - leftIndex+1];
		
		for(int i = leftIndex; i <= rightIndex ; i++) {
			arrayC[array[i]-1] = arrayC[array[i]-1] + 1;
		}
		
		for(int j = 1; j < arrayC.length ;j++){
			arrayC[j] = arrayC[j] + arrayC[j-1];	
		}
		
		for(int j = rightIndex ;j >= leftIndex;j--){
			arrayB[arrayC[array[j]-1]-1] = array[j];
			arrayC[array[j]-1] = arrayC[array[j]-1]- 1;
		}
		for(int k = 0 ; k < arrayB.length; k++){
			array[leftIndex+k] = arrayB[k];
		}
		}
	}

}
