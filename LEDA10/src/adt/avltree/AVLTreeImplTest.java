package adt.avltree;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

import adt.bst.BSTNode;

public class AVLTreeImplTest {
	AVLTreeImpl<Integer> myAVL;
	 
    @Before
    public void initialize() {
        myAVL = new AVLTreeImpl<Integer>();
    }
 
    @Test
    public void testGetRoot0() {
        assertNull(myAVL.getRoot().getData());
    }
 
    @Test
    public void testGetRoot1() {
        myAVL.insert(20);
        assertEquals(new Integer(20), myAVL.getRoot().getData());
    }
 
    @Test
    public void testIsEmpty0() {
        assertTrue(myAVL.isEmpty());
    }
 
    @Test
    public void testIsEmpty1() {
        myAVL.insert(20);
        assertFalse(myAVL.isEmpty());
    }
 
    @Test
    public void testHeight0() {
        assertEquals(-1, myAVL.height());
    }
 
    @Test
    public void testHeight1() {
        myAVL.insert(20);
        assertEquals(0, myAVL.height());
    }
 
    @Test
    public void testHeight2() {
        myAVL.insert(15);
        assertEquals(0, myAVL.height());
        myAVL.insert(6);
        assertEquals(1, myAVL.height());
        myAVL.insert(3);
        assertEquals(1, myAVL.height());
        myAVL.insert(2);
        assertEquals(2, myAVL.height());
        myAVL.insert(4);
        assertEquals(2, myAVL.height());
        myAVL.insert(7);
        assertEquals(2, myAVL.height());
        myAVL.insert(13);
        assertEquals(2, myAVL.height());
        myAVL.insert(9);
        assertEquals(3, myAVL.height());
        myAVL.insert(18);
        assertEquals(3, myAVL.height());
        myAVL.insert(17);
        assertEquals(3, myAVL.height());
        myAVL.insert(20);
        assertEquals(3, myAVL.height());
    }
 
    @Test
    public void testSearch0() {
        myAVL.insert(9);
        assertEquals(new Integer(9), myAVL.search(9).getData());
    }
 
    @Test
    public void testSearch1() {
        myAVL.insert(9);
        myAVL.insert(5);
        myAVL.insert(10);
 
        assertEquals(new Integer(5), myAVL.search(5).getData());
        assertEquals(new Integer(10), myAVL.search(10).getData());
    }
 
    @Test
    public void testSearch2() {
        myAVL.insert(9);
        myAVL.insert(5);
        myAVL.insert(10);
        myAVL.insert(2);
 
        assertEquals(new Integer(2), myAVL.search(5).getLeft().getData());
        assertEquals(new Integer(5), myAVL.search(2).getParent().getData());
        assertEquals(new Integer(10), myAVL.search(9).getRight().getData());
    }
 
    @Test
    public void testSearch3() {
        myAVL.insert(9);
        myAVL.insert(5);
        myAVL.insert(10);
        myAVL.insert(2);
        assertEquals(new BSTNode<Integer>(), myAVL.search(1));
 
    }
 
    @Test
    public void testInsert0() {
        myAVL.insert(15);
        assertEquals(0, myAVL.height());
        assertEquals(new Integer(15), myAVL.getRoot().getData());
    }
 
    @Test
    public void testInsert1() {
        Integer[] preOrder = { 15, 6 };
        Integer[] order = { 6, 15 };
        Integer[] postOrder = { 6, 15 };
 
        myAVL.insert(15);
        myAVL.insert(6);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert2() {
        Integer[] preOrder = { 6, 3, 15 };
        Integer[] order = { 3, 6, 15 };
        Integer[] postOrder = { 3, 15, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert3() {
        Integer[] preOrder = { 18, 15, 20 };
        Integer[] order = { 15, 18, 20 };
        Integer[] postOrder = { 15, 20, 18 };
 
        myAVL.insert(15);
        myAVL.insert(18);
        myAVL.insert(20);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert4() {
        Integer[] preOrder = { 6, 3, 2, 4, 15 };
        Integer[] order = { 2, 3, 4, 6, 15 };
        Integer[] postOrder = { 2, 4, 3, 15, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert5() {
        Integer[] preOrder = { 6, 3, 2, 4, 15, 7 };
        Integer[] order = { 2, 3, 4, 6, 7, 15 };
        Integer[] postOrder = { 2, 4, 3, 7, 15, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert6() {
        Integer[] preOrder = { 6, 3, 2, 4, 13, 7, 15 };
        Integer[] order = { 2, 3, 4, 6, 7, 13, 15 };
        Integer[] postOrder = { 2, 4, 3, 7, 15, 13, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert7() {
        Integer[] preOrder = { 6, 3, 2, 4, 13, 7, 9, 15, 18 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 13, 15, 18 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 18, 15, 13, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert8() {
        Integer[] preOrder = { 6, 3, 2, 4, 13, 7, 9, 17, 15, 18 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 13, 15, 17, 18 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 15, 18, 17, 13, 6 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testInsert9() {
        Integer[] preOrder = { 13, 6, 3, 2, 4, 7, 9, 17, 15, 18, 20 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 13, 15, 17, 18, 20 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 6, 15, 20, 18, 17, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove0() {
        Integer[] array = {};
        myAVL.remove(2);
        assertArrayEquals(array, myAVL.order());
    }
 
    @Test
    public void testRemove1() {
        Integer[] preOrder = { 13, 6, 3, 2, 4, 7, 17, 15, 18, 20 };
        Integer[] order = { 2, 3, 4, 6, 7, 13, 15, 17, 18, 20 };
        Integer[] postOrder = { 2, 4, 3, 7, 6, 15, 20, 18, 17, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        myAVL.remove(9);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove2() {
        Integer[] preOrder = { 13, 6, 3, 2, 4, 7, 9, 18, 17, 20 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 13, 17, 18, 20 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 6, 17, 20, 18, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        myAVL.remove(15);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove3() {
        Integer[] preOrder = { 13, 3, 2, 6, 4, 17, 15, 18, 20 };
        Integer[] order = { 2, 3, 4, 6, 13, 15, 17, 18, 20 };
        Integer[] postOrder = { 2, 4, 6, 3, 15, 20, 18, 17, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        myAVL.remove(9);
        myAVL.remove(7);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove4() {
        Integer[] preOrder = { 13, 4, 3, 6, 17, 15, 18, 20 };
        Integer[] order = { 3, 4, 6, 13, 15, 17, 18, 20 };
        Integer[] postOrder = { 3, 6, 4, 15, 20, 18, 17, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        myAVL.remove(2);
        myAVL.remove(9);
        myAVL.remove(7);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove5() {
        Integer[] preOrder = { 13, 6, 3, 2, 4, 7, 9, 19, 17, 20 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 13, 17, 19, 20 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 6, 17, 20, 19, 13 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(20);
        myAVL.insert(17);
        myAVL.insert(19);
 
        myAVL.remove(15);
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testRemove6() {
        Integer[] preOrder = { 15, 6, 3, 2, 4, 7, 9, 18, 17, 20 };
        Integer[] order = { 2, 3, 4, 6, 7, 9, 15, 17, 18, 20 };
        Integer[] postOrder = { 2, 4, 3, 9, 7, 6, 17, 20, 18, 15 };
 
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        myAVL.remove(13);
 
        System.out.println(Arrays.toString(myAVL.preOrder()));
        System.out.println(Arrays.toString(myAVL.order()));
        System.out.println(Arrays.toString(myAVL.postOrder()));
 
        assertArrayEquals(preOrder, myAVL.preOrder());
        assertArrayEquals(order, myAVL.order());
        assertArrayEquals(postOrder, myAVL.postOrder());
    }
 
    @Test
    public void testMaximum0() {
        myAVL.insert(12);
        assertEquals(new Integer(12), myAVL.maximum().getData());
    }
 
    @Test
    public void testMaximum1() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        assertEquals(new Integer(12), myAVL.maximum().getData());
    }
 
    @Test
    public void testMaximum2() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        assertEquals(new Integer(18), myAVL.maximum().getData());
    }
 
    @Test
    public void testMaximum3() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(19), myAVL.maximum().getData());
    }
 
    @Test
    public void testMaximum4() {
        assertNull(myAVL.maximum());
    }
 
    @Test
    public void testMinimum0() {
        myAVL.insert(12);
        assertEquals(new Integer(12), myAVL.minimum().getData());
    }
 
    @Test
    public void testMinimum1() {
        myAVL.insert(12);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(12), myAVL.minimum().getData());
    }
 
    @Test
    public void testMinimum2() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(5), myAVL.minimum().getData());
    }
 
    @Test
    public void testMinimum3() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(2);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(2), myAVL.minimum().getData());
    }
 
    @Test
    public void testMinimum4() {
        assertNull(myAVL.minimum());
    }
 
    @Test
    public void testSucessor0() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(5), myAVL.sucessor(2).getData());
    }
 
    @Test
    public void testSucessor1() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(9), myAVL.sucessor(5).getData());
    }
 
    @Test
    public void testSucessor2() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(12), myAVL.sucessor(9).getData());
    }
 
    @Test
    public void testSucessor3() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(13), myAVL.sucessor(12).getData());
    }
 
    @Test
    public void testSucessor4() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(18), myAVL.sucessor(17).getData());
    }
 
    @Test
    public void testSucessor5() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertNull(myAVL.sucessor(19));
    }
 
    @Test
    public void testSucessor6() {
        myAVL.insert(15);
        myAVL.insert(6);
        myAVL.insert(3);
        myAVL.insert(2);
        myAVL.insert(4);
        myAVL.insert(7);
        myAVL.insert(13);
        myAVL.insert(9);
        myAVL.insert(18);
        myAVL.insert(17);
        myAVL.insert(20);
 
        assertEquals(new Integer(15), myAVL.sucessor(13).getData());
    }
 
    @Test
    public void testPredecessor0() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertNull(myAVL.predecessor(2));
    }
 
    @Test
    public void testPredecessor1() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(2), myAVL.predecessor(5).getData());
    }
 
    @Test
    public void testPredecessor2() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(5), myAVL.predecessor(9).getData());
    }
 
    @Test
    public void testPredecessor3() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(9), myAVL.predecessor(12).getData());
    }
 
    @Test
    public void testPredecessor4() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(12), myAVL.predecessor(13).getData());
    }
 
    @Test
    public void testPredecessor5() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(new Integer(18), myAVL.predecessor(19).getData());
    }
 
    @Test
    public void testSize1() {
        myAVL.insert(19);
        assertEquals(1, myAVL.size());
    }
 
    @Test
    public void testSize2() {
        myAVL.insert(12);
        myAVL.insert(5);
        myAVL.insert(9);
        myAVL.insert(2);
        myAVL.insert(18);
        myAVL.insert(15);
        myAVL.insert(17);
        myAVL.insert(13);
        myAVL.insert(19);
        assertEquals(9, myAVL.size());
    }
/*
		protected AVLTree<Integer> tree1;
		protected AVLTree<Integer> tree2;
		protected AVLTree<Integer> tree3;
		protected AVLTree<Integer> tree4;
		protected AVLTree<Integer> tree5;
		protected AVLTree<Integer> tree6;
		protected Integer[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		protected static final int SIZE = 10;
		
		@Before
		public void setUp() throws Exception {
			tree1 = new AVLTreeImpl<Integer>();
			tree1.insert(1);
			tree1.insert(4);
			tree1.insert(7);
			tree1.insert(10);
			tree1.insert(13);
			tree1.insert(2);
			tree1.insert(5);
			tree1.insert(8);
			tree1.insert(11);
			tree1.insert(14);
			tree1.insert(3);
			tree1.insert(15);
			tree1.insert(6);
			tree1.insert(12);
			tree1.insert(9);


			tree2 = new AVLTreeImpl<Integer>();
		}
		
		@Test
		public void testInsert() {
			Integer[] preOrder1 = {10,4,2,1,3,7,5,6,8,9,13,11,12,14,15};
			assertEquals(Arrays.toString(preOrder1), Arrays.toString(tree1.preOrder()));
			
			assertEquals("[]", Arrays.toString(tree2.preOrder()));
			
			Integer[] preOrder2 = {10,4,2,1,3,7,5,6,8,9,13,11,12,15,14,20,18,22};
			tree1.insert(22);
			tree1.insert(18);
			tree1.insert(20);
			assertEquals(Arrays.toString(preOrder2), Arrays.toString(tree1.preOrder()));
		}
		
		@Test
		public void testRemove() {
			//removendo uma folha sem causar rebalanceamento
			tree1.remove(6);
			Integer[] preOrder1 = {10,4,2,1,3,7,5,8,9,13,11,12,14,15};
			assertEquals(Arrays.toString(preOrder1), Arrays.toString(tree1.preOrder()));
			
			//removendo no com um filho apenas sem causar rebaleanceamento
			tree1.remove(11);
			Integer[] preOrder2 = {10,4,2,1,3,7,5,8,9,13,12,14,15};
			assertEquals(Arrays.toString(preOrder2), Arrays.toString(tree1.preOrder()));
			
			
			//removendo um no com dois filhos que causa um rebalanceamento
			tree1.remove(13);
			Integer[] preOrder3 = {7,4,2,1,3,5,10,8,9,14,12,15};
			assertEquals(Arrays.toString(preOrder3), Arrays.toString(tree1.preOrder()));
			
			tree2.remove(10);
			assertEquals("[]", Arrays.toString(tree2.preOrder()));

		}
		
		@Test
		public void testHeight(){
			assertEquals(4,tree1.height());
			assertEquals(-1,tree2.height());
			tree1.insert(22);
			assertEquals(4,tree1.height());
			tree1.insert(18);
			assertEquals(4,tree1.height());
			tree1.insert(20);
			assertEquals(4,tree1.height());
			tree1.insert(17);
			assertEquals(4,tree1.height());
			tree1.insert(16);
			assertEquals(4,tree1.height());
			tree1.insert(19);
			assertEquals(4,tree1.height());
			tree1.insert(21);
			assertEquals(5,tree1.height());
		}*/
	
}
