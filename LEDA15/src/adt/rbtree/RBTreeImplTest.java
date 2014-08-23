package adt.rbtree;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import adt.rbtree.RBNode.Colour;

public class RBTreeImplTest {

	public RBTreeImpl<Integer> myRB;
	
	@Before
	public void initialize() {
		myRB = new RBTreeImpl<Integer>();
	}
	
	@Test
	public void testInsert0() {
		Integer[] preOrder = {11};
		Colour[] preOrderColour = {Colour.BLACK};
		
		myRB.insert(11);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert1() {
		Integer[] preOrder = {11, 2};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED};
		
		myRB.insert(11);
		myRB.insert(2);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert2() {
		Integer[] preOrder = {11, 2, 14};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.RED};
		
		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert3() {
		Integer[] preOrder = {11, 2, 1, 14};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert4() {
		Integer[] preOrder = {11, 2, 1, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert5() {
		Integer[] preOrder = {11, 2, 1, 7, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert6() {
		Integer[] preOrder = {11, 2, 1, 7, 5, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert7() {
		Integer[] preOrder = {11, 2, 1, 5, 4, 7, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED,
									Colour.RED,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(4);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert8() {
		Integer[] preOrder = {11, 2, 1, 6, 5, 7, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED,
									Colour.RED,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(6);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert9() {
		Integer[] preOrder = {11, 2, 1, 7, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(8);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
	}
	
	@Test
	public void testInsert10() {
		Integer[] preOrder = {11, 2, 1, 9, 7, 10, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED,
									Colour.RED,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(9);
		myRB.insert(10);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
	}
	
	@Test
	public void testInsert11() {
		Integer[] preOrder = {11, 2, 1, 8, 7, 9, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED,
									Colour.RED,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(9);
		myRB.insert(8);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
	}
	
	@Test
	public void testInsert12() {
		Integer[] preOrder = {11, 2, 1, 7, 5, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK, 
									Colour.RED,
									Colour.RED, 
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testInsert13() {
		Integer[] preOrder = {7, 2, 1, 5, 4, 11, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED, 
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	/*@Test
	public void testRemove0() {
		myRB.insert(11);
		myRB.remove(11);
		assertTrue(myRB.isEmpty());
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove1() {
		Integer[] preOrder = {7, 2, 1, 5, 11, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(4);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove2() {
		Integer[] preOrder = {7, 2, 1, 5, 4, 11, 8, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(14);

		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove3() {
		Integer[] preOrder = {7, 2, 1, 4, 11, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);

		myRB.remove(5);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove4() {
		Integer[] preOrder = {7, 4, 1, 5, 11, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(2);

		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove5() {
		Integer[] preOrder = {7, 2, 1, 5, 4, 14, 8, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);

		myRB.remove(11);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove6() {
		Integer[] preOrder = {7, 4, 2, 5, 11, 8, 14, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK, 
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(1);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove7() {
		Integer[] preOrder = {7, 2, 1, 5, 4, 14, 11, 15};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.RED,
									Colour.BLACK,
									Colour.BLACK};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(8);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}
	
	@Test
	public void testRemove8() {
		Integer[] preOrder = {8, 2, 1, 5, 4, 11, 14};
		Colour[] preOrderColour = {	Colour.BLACK, 
									Colour.RED, 
									Colour.BLACK, 
									Colour.BLACK,
									Colour.RED,
									Colour.BLACK,
									Colour.RED};

		myRB.insert(11);
		myRB.insert(2);
		myRB.insert(14);
		myRB.insert(1);
		myRB.insert(15);
		myRB.insert(7);
		myRB.insert(5);
		myRB.insert(8);
		myRB.insert(4);
		
		myRB.remove(15);
		myRB.remove(7);
		
		int len = myRB.size();
		RBNode<Integer>[] result = myRB.extendedPreOrder();
		for (int i = 0 ; i < len ; i++) {
			assertEquals(preOrder[i], result[i].getData());
			assertEquals(preOrderColour[i], result[i].getColour());
		}
		assertTrue(myRB.verifyProperties());
	}*/
	
}
