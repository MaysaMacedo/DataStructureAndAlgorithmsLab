package adt.heap;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.Before;

public class MaxHeapImplTest {

	public MaxHeapImpl<Integer> myHeap;
	
	@Before
	public void initialize() {
		myHeap = new MaxHeapImpl<Integer> ();
	}

	@Test
	public void testIsEmpty0() {
		assertTrue(myHeap.isEmpty());
	}

	@Test
	public void testIsEmpty1() {
		myHeap.insert(16);
		assertFalse(myHeap.isEmpty());
	}

	@Test
	public void testIsEmpty2() {
		myHeap.insert(16);
		myHeap.extractRootElement();
		assertTrue(myHeap.isEmpty());
	}
	
	@Test
	public void testIsEmpty3() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		myHeap.buildHeap(array);
		assertFalse(myHeap.isEmpty());
	}

	@Test
	public void testBuildHeap0() {
		Integer[] array = {};
		Integer[] expecteds = {};
		myHeap.buildHeap(array);
	
		assertArrayEquals(expecteds, myHeap.toArray());
	}

	@Test
	public void testBuildHeap1() {
		Integer[] array = {4};
		Integer[] expecteds = {4};
		myHeap.buildHeap(array);

		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap2() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		Integer[] expecteds = {16, 14, 10, 8, 7, 9, 3, 2, 4, 1};
		myHeap.buildHeap(array);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap3() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8};
		Integer[] expecteds = {16, 14, 10, 8, 1, 9, 3, 2, 4};
		myHeap.buildHeap(array);

		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap4() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14};
		Integer[] expecteds = {16, 14, 10, 4, 1, 9, 3, 2};
		myHeap.buildHeap(array);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap5() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10};
		Integer[] expecteds = {16, 4, 10, 2, 1, 9, 3};
		myHeap.buildHeap(array);

		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap6() {
		Integer[] array = {4, 1, 3, 2, 16, 9};
		Integer[] expecteds = {16, 4, 9, 2, 1, 3};
		myHeap.buildHeap(array);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testBuildHeap7() {
		Integer[] array = {4, 1, 3, 2, 16};
		Integer[] expecteds = {16, 4, 3, 2, 1};
		myHeap.buildHeap(array);
		
		System.out.println(Arrays.toString(myHeap.toArray()));
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testInsert0() {
		Integer[] expecteds = {4};
		myHeap.insert(4);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}

	@Test
	public void testInsert1() {
		Integer[] expecteds = {4, 1};
		
		myHeap.insert(4);
		myHeap.insert(1);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testInsert2() {
		Integer[] expecteds = {4, 1, 3};
		
		myHeap.insert(1);
		myHeap.insert(4);
		myHeap.insert(3);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testInsert3() {
		Integer[] expecteds = {16, 14, 10, 8, 7, 3, 9, 1, 4, 2};
		
		myHeap.insert(4);
		myHeap.insert(1);
		myHeap.insert(3);
		myHeap.insert(2);
		myHeap.insert(16);
		myHeap.insert(9);
		myHeap.insert(10);
		myHeap.insert(14);
		myHeap.insert(8);
		myHeap.insert(7);
		
		assertArrayEquals(expecteds, myHeap.toArray());
	}

	@Test
	public void testExtractRootElement0() {
		assertNull(myHeap.extractRootElement());
	}

	@Test
	public void testExtractRootElement1() {
		myHeap.insert(16);
		assertEquals(new Integer(16), myHeap.extractRootElement());
	}
	
	@Test
	public void testExtractRootElement2() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		Integer[] expecteds = {14, 8, 10, 4, 7, 9, 3, 2, 1};
		myHeap.buildHeap(array);
		
		assertEquals(new Integer(16), myHeap.extractRootElement());
		assertArrayEquals(expecteds, myHeap.toArray());
	}
	
	@Test
	public void testExtractRootElement3() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		Integer[] expecteds = {10, 8, 9, 4, 7, 1, 3, 2};
		myHeap.buildHeap(array);
		
		assertEquals(new Integer(16), myHeap.extractRootElement());
		assertEquals(new Integer(14), myHeap.extractRootElement());
		assertArrayEquals(expecteds, myHeap.toArray());
	}

	@Test
	public void testRootElement0() {
		assertNull(myHeap.rootElement());
	}

	@Test
	public void testRootElement1() {
		myHeap.insert(4);
		assertEquals(new Integer(4), myHeap.rootElement());
	}
	
	@Test
	public void testRootElement3() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		myHeap.buildHeap(array);
		
		assertEquals(new Integer(16), myHeap.rootElement());
	}
	
	@Test
	public void testHeapsort0() {
		Integer[] array = {};
		Integer[] expecteds = {};
		assertArrayEquals(expecteds, myHeap.heapsort(array));
	}
	
	@Test
	public void testHeapsort1() {
		Integer[] array = {4};
		Integer[] expecteds = {4};
		assertArrayEquals(expecteds, myHeap.heapsort(array));
	}
	
	@Test
	public void testHeapsort2() {
		Integer[] array = {4, 1};
		Integer[] expecteds = {1, 4};
		assertArrayEquals(expecteds, myHeap.heapsort(array));
	}
	
	@Test
	public void testHeapsort3() {
		Integer[] array = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		Integer[] expecteds = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16};
		assertArrayEquals(expecteds, myHeap.heapsort(array));
	}
	
	@Test
	public void testHeapsort4() {
		Integer[] array = {16, 14, 10, 9, 8, 7, 4, 3, 2, 1};
		Integer[] expecteds = {1, 2, 3, 4, 7, 8, 9, 10, 14, 16};
		assertArrayEquals(expecteds, myHeap.heapsort(array));
	}
	
}
