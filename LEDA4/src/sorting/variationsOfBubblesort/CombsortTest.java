package sorting.variationsOfBubblesort;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombsortTest {
		 
	@Test
	public void testSortTArray0() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		mySort.sort(array, 0, 9);

		for (int i = 0 ; i < 10 ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArray1() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		mySort.sort(array, 0, 9);

		for (int i = 0 ; i < 10 ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArray2() {
		Integer array[] = {1};
		Integer sorted[] = {1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 0;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	

	@Test
	public void testSortTArrayIntInt0() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 2, 3, 4, 5, 1, 1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 4, rightIndex = 7;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt1() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 2, 3, 4, 4, 5, 6, 7, 10};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt2() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 0;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt3() {
		Integer array[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Integer sorted[] = {10, 4, 6, 7, 3, 2, 5, 4, 1, 1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 9, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt4() {
		Integer array[] = {4, 6, 7, 3, 5, 4, 1, 1};
		Integer sorted[] = {1, 1, 3, 4, 4, 5, 6, 7};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 7;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt5() {
		Integer array[] = {10,9,8,7,6,5,4,3,2,1};
		Integer sorted[] = {1,2,3,4,5,6,7,8,9,10};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}
	
	@Test
	public void testSortTArrayIntInt6() {
		Integer array[] = {10,9,8,7,6,5,4,3,2,1};
		Integer sorted[] = {10,9,8,7,6,1,2,3,4,5};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 5, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}

	@Test
	public void testSortTArrayIntInt7() {
		Integer array[] = {10,9,8,7,6,5,4,3,2,1};
		Integer sorted[] = {6,7,8,9,10,5,4,3,2,1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 4;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}

	@Test
	public void testSortTArrayIntInt8() {
		Integer array[] = {10,9,8,7,6,5,4,3,2,1};
		Integer sorted[] = {10,9,3,4,5,6,7,8,2,1};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 2, rightIndex = 7;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}

	public void testSortTArrayIntInt9() {
		Integer array[] = {100,90,80,70,60,50,40,30,20,10};
		Integer sorted[] = {100,90,30,40,50,60,70,80,20,10};
		Combsort<Integer> mySort = new Combsort<Integer>();
		
		int leftIndex = 0, rightIndex = 9;
		mySort.sort(array, leftIndex, rightIndex);
	
		for (int i = leftIndex ; i < rightIndex ; i++)
			assertEquals(array[i], sorted[i]);
	}

}
