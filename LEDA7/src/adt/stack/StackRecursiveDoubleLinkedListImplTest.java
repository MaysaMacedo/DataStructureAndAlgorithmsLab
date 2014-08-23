package adt.stack;

import static org.junit.Assert.*;

import org.junit.Test;

	public class StackRecursiveDoubleLinkedListImplTest {

		@Test
		public void testPush0() throws StackOverflowException {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			stack.push("Uian");
			assertEquals("Uian", stack.top());
		
			stack.push("Sol");
			assertEquals("Sol", stack.top());
		}

		@Test
		public void testPush1() {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			try {
				stack.push("Uian");
				stack.push("Victor");
				stack.push("Letícia");
				stack.push("Fábio");
				fail("Deveria lancar excecao");
			} catch (Exception e) {
				assertEquals(StackOverflowException.class, e.getClass());
			}
			
		}
		
		@Test
		public void testPop0() throws StackOverflowException, StackUnderflowException {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			stack.push("Uian");
			assertEquals("Uian", stack.pop());
		}
		
		@Test
		public void testPop1() throws StackOverflowException, StackUnderflowException {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			stack.push("Uian");
			stack.push("Sol");
			assertEquals("Sol", stack.pop());
		}

		@Test
		public void testFailPop0() throws StackUnderflowException {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			try {
				stack.pop();
				fail("Deveria ser implementado.");
			} catch (Exception e) {
				assertEquals(StackUnderflowException.class, e.getClass());
			}
		}
		
		@Test
		public void testTop0() {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			assertEquals(null, stack.top());
		}

		@Test
		public void testIsEmpty0() {
			StackRecursiveDoubleLinkedListImpl<String> stack = new StackRecursiveDoubleLinkedListImpl<String>(3);
			
			assertTrue(stack.isEmpty());
		}

		@Test
		public void testIsEmpty1() throws StackOverflowException {
			StackRecursiveDoubleLinkedListImpl<Integer> stack = new StackRecursiveDoubleLinkedListImpl<Integer>(3);
			
			stack.push(1);
			
			assertFalse(stack.isEmpty());
		}
		
		@Test
		public void testIsFull0() throws StackOverflowException {
			StackRecursiveDoubleLinkedListImpl<Integer> stack = new StackRecursiveDoubleLinkedListImpl<Integer>(3);
			
			stack.push(1);
			stack.push(2);
			stack.push(3);
			
			assertTrue(stack.isFull());
		}
		
		@Test
		public void testIsFull1() throws StackOverflowException {
			StackRecursiveDoubleLinkedListImpl<Integer> stack = new StackRecursiveDoubleLinkedListImpl<Integer>(3);
			
			stack.push(1);
			stack.push(2);
			
			assertFalse(stack.isFull());
		}


	}



