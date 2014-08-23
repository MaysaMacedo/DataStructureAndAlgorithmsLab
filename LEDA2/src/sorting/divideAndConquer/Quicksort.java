/**
 * 
 */
package sorting.divideAndConquer;

import sorting.SortingImpl;
import sorting.Util;

public class Quicksort<T extends Comparable<T>> extends SortingImpl<T> {

	@Override
	protected void sort(T[] array, int leftIndex, int rightIndex) {
		if (rightIndex != 0 && leftIndex < rightIndex
				&& array.length > rightIndex && array.length != 0) {

			int pivo = quick(array, leftIndex, rightIndex);
			sort(array, leftIndex, pivo - 1);
			sort(array, pivo + 1, rightIndex);

		}
	}

	private int quick(T[] array, int left, int right) {
		int i = left + 1;
		int j = right;
		T q = array[left];

		while (i <= j) {
			if (array[i].compareTo(q) <= 0) {
				i++;
			} else if (array[j].compareTo(q) > 0) {
				j--;
			} else {
				Util.swap(array, i, j);
			}

		}
		Util.swap(array, left, j);
		return j;
	}
		// Vai percorrendo se o indice da esquerda+1 for <= que o pivot(esquerda) então está correto
		// e pode encrementar o i , mas se o indice da direita for  > que o da esquerda ,então
		// pode decrementar o j .. se não entrar em nenhum desses faz swap
}
