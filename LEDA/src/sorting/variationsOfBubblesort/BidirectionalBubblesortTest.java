package sorting.variationsOfBubblesort;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class BidirectionalBubblesortTest {

	@Test
	public void testSortTArray0() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		mySort.sort(array);

		for (int i = 0 ; i < 10 ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArray1() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		mySort.sort(array);

		for (int i = 0 ; i < 10 ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArray2() {
		Integer array[] = {1};
		Integer sorted[] = {1};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 0, rightIndex = 0;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	

	@Test
	public void testSortTArrayIntInt0() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 2, 3, 4, 5, 1, 1};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 4, rightIndex = 7;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt1() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 0, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt2() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 0, rightIndex = 0;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt3() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 9, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt4() {
		Integer array[] = {-10, 4, 6, 7, 3, -2, 5, 4, 1, 1};
		Integer sorted[] = {-10, -2, 1, 1, 3, 4, 4, 5, 6, 7};
		BidirectionalBubblesort<Integer> mySort = new BidirectionalBubblesort<Integer>();
		
		int leftIndex = 0, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
}
