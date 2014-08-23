package sorting.simpleSorting;

import sorting.SortingImpl;
import sorting.Util;

/**
 * The bubble sort algorithm pushes big elements to the right or small elements
 * to the left by exchanging adjacent elements. The algorithm must sort the
 * elements from leftIndex to rightIndex (inclusive).
 */
public class Bubblesort<T extends Comparable<T>> extends SortingImpl<T> {

	@Override
	protected void sort(T[] array, int leftIndex, int rightIndex) {

		if ((array.length > leftIndex) && (array.length > rightIndex) &&  (leftIndex > -1) && (leftIndex > -1)) {
			for (int i = leftIndex; i < rightIndex +1; i++) {
				for (int j = leftIndex; j < rightIndex + leftIndex - i; j++) {
					if (array[j].compareTo(array[j + 1]) > 0) {
						Util.swap(array, j + 1, j);
					}
				}
			}
		}
	}           // [2,0,5,8,4,1]
}				// [0,2,1,4,5,8]

				// vai percorrendo e trocando na primeira ida(o maior fica no final) , em seguida 
				//percorre novamente mas vai até o tamanho - 1
				// vai sempre diminuindo o tamanho da lista que tem que percorrer , e trocando
				// os elementos se for necessario ,de forma que os maiores elementos ficam a direita