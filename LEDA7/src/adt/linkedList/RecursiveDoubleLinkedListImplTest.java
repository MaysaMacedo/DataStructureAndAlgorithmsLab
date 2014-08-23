package adt.linkedList;

import static org.junit.Assert.*;

import org.junit.Test;

	public class RecursiveDoubleLinkedListImplTest {
		@Test
		public void testSearch0() {
			DoubleLinkedList<Integer> myList = new RecursiveDoubleLinkedListImpl<Integer>();
			
			assertEquals(null, myList.search(1));
		}
		
		@Test
		public void testInsert0() {
			DoubleLinkedList<Integer> myList = new RecursiveDoubleLinkedListImpl<Integer>();
			
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
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {"Uian", "Fábio", "Letícia"};
			
			myList.insert("Uian");
			myList.insert("Fábio");
			myList.insert("Letícia");
			
			assertArrayEquals(result, myList.toArray());
		}

		@Test
		public void testInsertFirst0() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {"Letícia", "Fábio", "Uian"};
			
			myList.insertFirst("Uian");
			myList.insertFirst("Fábio");
			myList.insertFirst("Letícia");
			
			assertArrayEquals(result, myList.toArray());
		}
		
		@Test
		public void testRemove0() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {"Letícia", "Uian"};
			
			myList.insertFirst("Uian");
			myList.insertFirst("Fábio");
			myList.insertFirst("Letícia");
			myList.remove("Fábio");
					
			assertArrayEquals(result, myList.toArray());
		}
		
		@Test
		public void testRemove1() {
			DoubleLinkedList<Integer> myList = new RecursiveDoubleLinkedListImpl<Integer>();
			Integer[] result = {1, 2, 3, 5, 6};
			
			myList.insert(1);
			myList.insert(2);
			myList.insert(3);
			myList.insert(4);
			myList.insert(5);
			myList.insert(6);
			myList.remove(4);
					
			assertArrayEquals(result, myList.toArray());
		}

		@Test
		public void testRemoveFirst0() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {"Fábio", "Uian"};
			
			myList.insertFirst("Uian");
			myList.insertFirst("Fábio");
			myList.insertFirst("Letícia");
			myList.removeFirst();
			
			assertArrayEquals(result, myList.toArray());
		}

		@Test
		public void testRemoveFirst1() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {};

			myList.removeFirst();
			
			assertArrayEquals(result, myList.toArray());
		}
		
		@Test
		public void testRemoveLast() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {"Letícia", "Fábio"};
			
			myList.insertFirst("Uian");
			myList.insertFirst("Fábio");
			myList.insertFirst("Letícia");
			myList.removeLast();
			
			assertArrayEquals(result, myList.toArray());
		}
		
		@Test
		public void testRemoveLast1() {
			DoubleLinkedList<String> myList = new RecursiveDoubleLinkedListImpl<String>();
			String[] result = {};

			myList.removeLast();
			
			assertArrayEquals(result, myList.toArray());
		}

	}


