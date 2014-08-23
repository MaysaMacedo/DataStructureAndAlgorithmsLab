package adt.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;



	import static org.junit.Assert.*;

	import org.junit.Test;

	public class RecursiveRecursiveSingleLinkedListImplTest {


		@Test
		public void testIsEmpty0() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			assertTrue(myList.isEmpty());
		}
		
		@Test
		public void testIsEmpty1() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			myList.insert(1);
			
			assertFalse(myList.isEmpty());
		}
		
		@Test
		public void testIsEmpty2() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			myList.insert(1);
			myList.remove(1);
			
			assertTrue(myList.isEmpty());
		}


		@Test
		public void testSize0() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			assertEquals(0, myList.size());
		}
		
		@Test
		public void testSize1() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			myList.insert(1);
			myList.insert(2);
			
			assertEquals(2, myList.size());
		}

		@Test
		public void testInsert0() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			myList.insert(1);
			myList.insert(2);
			myList.insert(3);
			
			Integer ret = 1;
			assertEquals(ret, myList.search(1));
			ret = 2;
			assertEquals(ret, myList.search(2));
			ret = 3;
			assertEquals(ret, myList.search(3));
		}
		
		@Test
		public void testInsert1() {
			LinkedList<String> myList = new RecursiveSingleLinkedListImpl<String>();

			myList.insert("Uian");
			myList.insert("Fábio");
			myList.insert("Letícia");
			
			assertEquals("Uian", myList.search("Uian"));
			assertEquals("Fábio", myList.search("Fábio"));
			assertEquals("Letícia", myList.search("Letícia"));
		}

		@Test
		public void testRemove() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();

			myList.insert(1);
			myList.insert(2);
			myList.insert(3);
			myList.remove(1);
			
			assertEquals(null, myList.search(1));
			
			myList.remove(3);
			assertEquals(null, myList.search(3));
		}

		@Test
		public void testToArray0() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();
			Integer[] result = {1, 2, 3};
			
			myList.insert(1);
			myList.insert(2);
			myList.insert(3);
			
			assertArrayEquals(result, myList.toArray());
		}
		
		@Test
		public void testToArray1() {
			LinkedList<Integer> myList = new RecursiveSingleLinkedListImpl<Integer>();
			Integer[] result = {};
			
			assertArrayEquals(result, myList.toArray());
		}



		}





