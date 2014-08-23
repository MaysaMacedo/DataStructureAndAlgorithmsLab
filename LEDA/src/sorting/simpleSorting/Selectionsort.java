package sorting.simpleSorting;

import sorting.SortingImpl;
import sorting.Util;

/**
 * The selection sort algorithm chooses the smallest (greatest) element form the
 * array and puts it in the first (last) position. Then it repeats the same
 * process to put the second smallest (greatest) element in the second (second
 * from the end) position, and so on. The algorithm must sort the elements from
 * leftIndex to rightIndex.
 */
public class Selectionsort<T extends Comparable<T>> extends SortingImpl<T> {
	@Override
	protected void sort(T[] array, int leftIndex, int rightIndex) {
		if ((array.length > leftIndex) && (array.length > rightIndex) &&  (leftIndex > -1) && (leftIndex > -1)) {
			for (int i = leftIndex; i <= rightIndex ; i++) {
				int min = i;
				for (int j = i; j <= rightIndex ; j++) {
					if (array[min].compareTo(array[j]) > 0) {
						min = j;
					}
				}
				Util.swap(array, min, i);
			}
		}
			//Percorre uma vez e acha o menor elemento , coloca ele no primeiro lugar
			// depois vai percorrendo outras vezes mas sem contar mais com a posição
			// em que o elemento menor foi colocado porque ele já ta correto , e assim por diante
	}

}
