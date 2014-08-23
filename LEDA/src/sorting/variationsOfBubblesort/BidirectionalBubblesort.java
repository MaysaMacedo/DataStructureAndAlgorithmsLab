package sorting.variationsOfBubblesort;


import sorting.SortingImpl;
import sorting.Util;

/**
 * This bubblesort variation pushes the greatest element to the right and (walking from left to right), 
 * after that, it pushes the smallest element to the left (walking from right to left). This happens 
 * in a same iteration. The following iterations do the same until the array is completely ordered. 
 * The algorithm must sort the elements from leftIndex to rightIndex (inclusive).  
 */
public class BidirectionalBubblesort<T extends Comparable<T>> extends SortingImpl<T> {

	@Override
	protected void sort(T[] array, int leftIndex, int rightIndex) {

		if (leftIndex >= 0 && leftIndex < rightIndex && rightIndex <= array.length) {
			
			boolean changed = true;
			int begin = leftIndex,end = rightIndex;
			while (changed) {
				changed = false;
				for (int i = leftIndex; i < end; i++) {
					if (array[i].compareTo(array[i + 1]) > 0) {
						Util.swap(array, i, i + 1);
						changed = true;
					}
				}

				for (int j = rightIndex; j > begin; j--) {
					if (array[j].compareTo(array[j - 1]) < 0) {
						Util.swap(array, j, j - 1);
						changed = true;
					}
				}
				begin ++;
				end --;
			}
		}

	}

}
	


