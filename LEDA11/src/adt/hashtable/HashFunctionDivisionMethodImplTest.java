package adt.hashtable;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HashFunctionDivisionMethodImplTest {

	public Hashtable<Integer> myHash;
	
	@Before
	public void initialize() {
		myHash = new HashtableClosedAddressImpl<Integer>(4, HashFunctionClosedAddressMethod.DIVISION);
	}

	@Test
	public void testIsEmpty0() {
		assertTrue(myHash.isEmpty());
	}

	@Test
	public void testIsEmpty1() {
		myHash.insert(1);
		assertFalse(myHash.isEmpty());
	}
	
	@Test
	public void testSize0() {
		assertEquals(0, myHash.size());
	}

	@Test
	public void testSize1() {
		myHash.insert(1);
		assertEquals(1, myHash.size());
	}

	@Test
	public void testSize2() {
		myHash.insert(1);
		myHash.insert(2);
		myHash.insert(3);
		myHash.insert(4);
		myHash.insert(5);
		assertEquals(5, myHash.size());
	}
	
	@Test
	public void testCapacity0() {
		assertEquals(5, myHash.capacity());
	}
	
	@Test
	public void testInsert0() {
		myHash.insert(1);
		assertNull(myHash.search(2));
	}
	
	@Test
	public void testInsert1() {
		myHash.insert(1);
		assertEquals(new Integer(1), myHash.search(1));
	}
	
	@Test
	public void testInsert2() {
		myHash.insert(1);
		myHash.insert(2);
		myHash.insert(3);
		myHash.insert(4);
		myHash.insert(5);
		assertEquals(new Integer(5), myHash.search(5));
		assertEquals(new Integer(4), myHash.search(4));
		assertEquals(new Integer(3), myHash.search(3));
		assertEquals(new Integer(2), myHash.search(2));
		assertEquals(new Integer(1), myHash.search(1));
	}
	
	@Test
	public void testInsert3() {
		myHash.insert(1);
		myHash.insert(6);
		myHash.insert(2);
		myHash.insert(7);
		myHash.insert(11);
		assertEquals(new Integer(11), myHash.search(11));
		assertEquals(new Integer(7), myHash.search(7));
		assertEquals(new Integer(6), myHash.search(6));
		assertEquals(new Integer(2), myHash.search(2));
		assertEquals(new Integer(1), myHash.search(1));
	}
	
	@Test
	public void testRemove0() {
		myHash.insert(1);
		myHash.remove(1);
		
		assertNull(myHash.search(1));
	}

	@Test
	public void testRemove1() {
		myHash.insert(1);
		myHash.remove(2);
		
		assertEquals(new Integer(1), myHash.search(1));
	}
	
	@Test
	public void testRemove2() {
		myHash.insert(1);
		myHash.insert(2);
		myHash.insert(3);
		
		myHash.remove(2);
		
		assertEquals(new Integer(1), myHash.search(1));
		assertEquals(new Integer(3), myHash.search(3));
		assertNull(myHash.search(2));
	}

	@Test
	public void testIndexOf0() {
		assertEquals(-1, myHash.indexOf(1));
	}

	@Test
	public void testIndexOf1() {
		myHash.insert(1);
		assertEquals(1, myHash.indexOf(1));
	}

	@Test
	public void testIndexOf2() {
		myHash.insert(7);
		assertEquals(2, myHash.indexOf(7));
	}
	
	@Test
	public void testIndexOf3() {
		myHash.insert(2);
		myHash.insert(7);
		assertEquals(2, myHash.indexOf(2));
		assertEquals(2, myHash.indexOf(7));
	}
	
	@Test
	public void testIndexOf4() {
		myHash.insert(3);
		myHash.insert(4);
		myHash.insert(8);
		assertEquals(3, myHash.indexOf(3));
		assertEquals(4, myHash.indexOf(4));
		assertEquals(3, myHash.indexOf(8));
	}
	
}
