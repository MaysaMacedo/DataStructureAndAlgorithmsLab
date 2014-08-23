package sorting.simpleSorting;

import sorting.SortingImpl;

/**
 * The insertion sort algorithm consumes the array (element by element) and inserts the elements 
 * into an ordered list. The algorithm must sort the elements from 
 * leftIndex to rightIndex (inclusive). 
 */
public class Insertionsort<T extends Comparable<T>> extends SortingImpl<T> {
	@Override
	protected void sort(T[] array, int leftIndex, int rightIndex) {
		T tmp;
		int j;
		if ((array.length > leftIndex) && (array.length > rightIndex) &&  (leftIndex > -1) && (leftIndex > -1)) {
			for(int i = leftIndex ; i <= rightIndex; i++){
				 tmp = array[i];//1
				j = i -1;//4
				while( (j >= leftIndex && array[j].compareTo(tmp) > 0)){
					array[j+1] = array[j];//[0,1,2,5,4,8]
					j--;
				}
				array[j+1] = tmp;
			} 
		}		// [2,0,5,8,4,1]
	}			//vai comparando com o anterior sempre .. se o elementoIndex+1 > elementoIndex
				//o elementoIndex+1 vai ser trocado pelo o elementoIndex e se continuar no while
				// o elementoIndex vai ser trocado pelo elementoIndex-1 e assim por diante 
				// até que não nenhum elemento anterior for menor que seu sucessor ai o elemento sucessor
				// vai ser trocado pela chave.

}
