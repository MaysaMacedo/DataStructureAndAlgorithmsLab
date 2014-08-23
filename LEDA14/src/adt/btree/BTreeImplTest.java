package adt.btree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BTreeImplTest {
//BTreeImpl<Integer>  treeOrd3, treeOrd5;
//	
//	
//	@Before
//	public void setShitUp(){
//		treeOrd3 = new BTreeImpl<Integer>(3);
//		treeOrd5 = new BTreeImpl<Integer>(5);
//		
//	}
//
//	
//	public void testEveryShit() {
//		for(int i = 0; i < 300 ; i++){
//			assertTrue(new BNodePosition<Integer>().node == treeOrd3.search(i).node);		
//			assertTrue(new BNodePosition<Integer>().position == treeOrd3.search(i).position);		
//			assertEquals(-1, treeOrd3.height());
//		}
//		
//		
//		treeOrd3.insert(100);
//		
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.size());
//		assertEquals(0, treeOrd3.height());
//		
//		treeOrd3.insert(200);
//		
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(2, treeOrd3.search(200).position);
//		assertEquals(2, treeOrd3.size());
//		assertEquals(0, treeOrd3.height());
//
//		treeOrd3.insert(300);
//
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		
//		assertEquals(3, treeOrd3.size());
//		assertEquals(1, treeOrd3.height());
//
//		treeOrd3.insert(50);// 50,100|200|300
//
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(2, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		
//		assertEquals(4, treeOrd3.size());
//		assertEquals(1, treeOrd3.height());
//
//		treeOrd3.insert(150); // 50,100,150|200|300
//		// 50|100|150,200|300
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(2, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		
//		assertEquals(5, treeOrd3.size());
//		assertEquals(1, treeOrd3.height());
//
//		treeOrd3.insert(250);
//		// 50|100|150,200|250,300
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(2, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(2, treeOrd3.search(300).position);
//		
//		assertEquals(6, treeOrd3.size());
//		assertEquals(1, treeOrd3.height());
//
//
//		treeOrd3.insert(350);
//		// 50|100|150,200|250,300,350
//		// 50|100|150,200,300|250|350
//		// 50|100|150*300|250|350 // 200
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(350).position);
//		
//		assertEquals(7, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//
//
//		treeOrd3.insert(25);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(2, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(350).position);
//		
//		assertEquals(8, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//
//
//		treeOrd3.insert(125);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(2, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(2, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(350).position);
//		
//		assertEquals(9, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(225);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(2, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(2, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(2, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(350).position);
//		
//		assertEquals(10, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(325);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(2, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(2, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(2, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(325).position);
//		assertEquals(2, treeOrd3.search(350).position);
//		
//		assertEquals(11, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(75);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(75).position);
//		assertEquals(2, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(2, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(2, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(325).position);
//		assertEquals(2, treeOrd3.search(350).position);
//		
//		assertEquals(12, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(175);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(75).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(175).position);
//		assertEquals(2, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(2, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(325).position);
//		assertEquals(2, treeOrd3.search(350).position);
//		
//		assertEquals(13, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(275);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(75).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(175).position);
//		assertEquals(2, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(275).position);
//		assertEquals(2, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(325).position);
//		assertEquals(2, treeOrd3.search(350).position);
//		
//		assertEquals(14, treeOrd3.size());
//		assertEquals(2, treeOrd3.height());
//		
//		treeOrd3.insert(375);
//
//		assertEquals(1, treeOrd3.search(25).position);
//		assertEquals(1, treeOrd3.search(50).position);
//		assertEquals(1, treeOrd3.search(75).position);
//		assertEquals(1, treeOrd3.search(100).position);
//		assertEquals(1, treeOrd3.search(125).position);
//		assertEquals(1, treeOrd3.search(150).position);
//		assertEquals(1, treeOrd3.search(175).position);
//		assertEquals(1, treeOrd3.search(200).position);
//		assertEquals(1, treeOrd3.search(225).position);
//		assertEquals(1, treeOrd3.search(250).position);
//		assertEquals(1, treeOrd3.search(275).position);
//		assertEquals(1, treeOrd3.search(300).position);
//		assertEquals(1, treeOrd3.search(325).position);
//		assertEquals(1, treeOrd3.search(350).position);
//		assertEquals(1, treeOrd3.search(375).position);
//		
//		assertEquals(15, treeOrd3.size());
//		assertEquals(3, treeOrd3.height());
//		
//		
//		
//		// ------------------------------------------ ORDER 4 ------------------------------------------------------------------
//		
//		
//		
//		for(int i = 0; i < 300 ; i++){
//			assertTrue(new BNodePosition<Integer>().node == treeOrd5.search(i).node);
//			assertTrue(new BNodePosition<Integer>().position == treeOrd5.search(i).position);
//			assertTrue(Arrays.equals(new BNode[0],treeOrd5.depthLeftOrder()));
//			assertEquals(-1, treeOrd5.height());
//		}
//		
//		
//		treeOrd5.insert(100);
//		
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(1, treeOrd5.size());
//		assertEquals(0, treeOrd5.height());
//		
//		treeOrd5.insert(200);
//		
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		
//		assertEquals(2, treeOrd5.size());
//		assertEquals(0, treeOrd5.height());
//
//		treeOrd5.insert(300);
//
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		assertEquals(3, treeOrd5.search(300).position);
//		
//		assertEquals(3, treeOrd5.size());
//		assertEquals(0, treeOrd5.height());
//
//		treeOrd5.insert(50);
//
//		assertEquals(1, treeOrd5.search(50).position);
//		assertEquals(2, treeOrd5.search(100).position);
//		assertEquals(3, treeOrd5.search(200).position);
//		assertEquals(4, treeOrd5.search(300).position);
//		
//		assertEquals(4, treeOrd5.size());
//		assertEquals(0, treeOrd5.height());
//
//		treeOrd5.insert(150);
//
//		assertEquals(1, treeOrd5.search(50).position);
//		assertEquals(2, treeOrd5.search(100).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(300).position);
//		
//		assertEquals(5, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//
//		treeOrd5.insert(250);
//
//		assertEquals(1, treeOrd5.search(50).position);
//		assertEquals(2, treeOrd5.search(100).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(3, treeOrd5.search(300).position);
//		
//		assertEquals(6, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//
//
//		treeOrd5.insert(350);
//
//		assertEquals(1, treeOrd5.search(50).position);
//		assertEquals(2, treeOrd5.search(100).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(3, treeOrd5.search(300).position);
//		assertEquals(4, treeOrd5.search(350).position);
//		
//		assertEquals(7, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//
//
//		treeOrd5.insert(25);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(3, treeOrd5.search(100).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(3, treeOrd5.search(300).position);
//		assertEquals(4, treeOrd5.search(350).position);
//		
//		assertEquals(8, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//
//
//		treeOrd5.insert(125);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(3, treeOrd5.search(100).position);
//		assertEquals(4, treeOrd5.search(125).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(3, treeOrd5.search(300).position);
//		assertEquals(4, treeOrd5.search(350).position);
//		
//		assertEquals(9, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(225);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(3, treeOrd5.search(100).position);
//		assertEquals(4, treeOrd5.search(125).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(225).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(300).position);
//		assertEquals(2, treeOrd5.search(350).position);
//		
//		assertEquals(10, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(325);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(3, treeOrd5.search(100).position);
//		assertEquals(4, treeOrd5.search(125).position);
//		assertEquals(1, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(225).position);
//		assertEquals(2, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(300).position);
//		assertEquals(2, treeOrd5.search(325).position);
//		assertEquals(3, treeOrd5.search(350).position);
//	
//		
//		assertEquals(11, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(75);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(2, treeOrd5.search(225).position);
//		assertEquals(3, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(300).position);
//		assertEquals(2, treeOrd5.search(325).position);
//		assertEquals(3, treeOrd5.search(350).position);
//		
//		assertEquals(12, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(175);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(175).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		assertEquals(3, treeOrd5.search(225).position);
//		assertEquals(3, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(300).position);
//		assertEquals(2, treeOrd5.search(325).position);
//		assertEquals(3, treeOrd5.search(350).position);
//		
//		assertEquals(13, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(275);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(175).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		assertEquals(3, treeOrd5.search(225).position);
//		assertEquals(3, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(275).position);
//		assertEquals(2, treeOrd5.search(300).position);
//		assertEquals(3, treeOrd5.search(325).position);
//		assertEquals(4, treeOrd5.search(350).position);
//		
//		assertEquals(14, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(375);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(175).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		assertEquals(3, treeOrd5.search(225).position);
//		assertEquals(3, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(275).position);
//		assertEquals(2, treeOrd5.search(300).position);
//		assertEquals(4, treeOrd5.search(325).position);
//		assertEquals(1, treeOrd5.search(350).position);
//		assertEquals(2, treeOrd5.search(375).position);
//		
//		assertEquals(15, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//		treeOrd5.insert(205);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(175).position);
//		assertEquals(2, treeOrd5.search(200).position);
//		assertEquals(3, treeOrd5.search(205).position);
//		assertEquals(4, treeOrd5.search(225).position);
//		assertEquals(3, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(275).position);
//		assertEquals(2, treeOrd5.search(300).position);
//		assertEquals(4, treeOrd5.search(325).position);
//		assertEquals(1, treeOrd5.search(350).position);
//		assertEquals(2, treeOrd5.search(375).position);
//		
//		assertEquals(16, treeOrd5.size());
//		assertEquals(1, treeOrd5.height());
//		
//
//		treeOrd5.insert(195);
//
//		assertEquals(1, treeOrd5.search(25).position);
//		assertEquals(2, treeOrd5.search(50).position);
//		assertEquals(1, treeOrd5.search(75).position);
//		assertEquals(1, treeOrd5.search(100).position);
//		assertEquals(2, treeOrd5.search(125).position);
//		assertEquals(2, treeOrd5.search(150).position);
//		assertEquals(1, treeOrd5.search(175).position);
//		assertEquals(2, treeOrd5.search(195).position);
//		assertEquals(1, treeOrd5.search(200).position);
//		assertEquals(1, treeOrd5.search(205).position);
//		assertEquals(2, treeOrd5.search(225).position);
//		assertEquals(1, treeOrd5.search(250).position);
//		assertEquals(1, treeOrd5.search(275).position);
//		assertEquals(2, treeOrd5.search(300).position);
//		assertEquals(2, treeOrd5.search(325).position);
//		assertEquals(1, treeOrd5.search(350).position);
//		assertEquals(2, treeOrd5.search(375).position);
//		
//		assertEquals(17, treeOrd5.size());
//		assertEquals(2, treeOrd5.height());
//
//	}
//	
//	
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Test
//	public void testDepthLeftOrder(){
////		
//// 													 								[50]
////														[20]  												    	[80]
////										[10]						[30 , 40]				    	 [65,70] 						[90]
////									[5]		 [15]			    [25]   [35]   [45]				 [55] [60] [75] 				[85] 	[95]
////
////		
//// Ordem de inserção dos elementos: 50, 80, 30, 75, 95, 90, 70, 5, 10, 45, 20, 60, 85, 25, 55, 15, 40, 35, 65
//		
//		BNode node_50 = new BNode<Integer>(3), 
//				node_20 = new BNode<Integer>(3), 
//				node_80 = new BNode<Integer>(3), 
//				node_10 = new BNode<Integer>(3), 
//				node_30_40 = new BNode<Integer>(3),
//				node_65_70 = new BNode<Integer>(3),
//				node_90 = new BNode<Integer>(3),
//				node_5 = new BNode<Integer>(3),
//				node_15 = new BNode<Integer>(3),
//				node_25 = new BNode<Integer>(3), 
//				node_35 = new BNode<Integer>(3),
//				node_45 = new BNode<Integer>(3), 
//				node_55 = new BNode<Integer>(3),
//				node_60 = new BNode<Integer>(3),
//				node_75 = new BNode<Integer>(3), 
//				node_85 = new BNode<Integer>(3), 
//				node_95 = new BNode<Integer>(3);
//		
//			
//				
//				LinkedList<BNode> height_0 = new LinkedList<>(); height_0.addLast(node_20); height_0.addLast(node_80);
//				LinkedList<BNode> height_1_1 = new LinkedList<>(); height_1_1.addLast(node_10); height_1_1.addLast(node_30_40);
//				LinkedList<BNode> height_1_2 = new LinkedList<>(); height_1_2.addLast(node_65_70); height_1_2.addLast(node_90);
//				LinkedList<BNode> height_2_1 = new LinkedList<>(); height_2_1.addLast(node_5); height_2_1.addLast(node_15);
//				LinkedList<BNode> height_2_2 = new LinkedList<>(); height_2_2.addLast(node_25); height_2_2.addLast(node_35); height_2_2.addLast(node_45);
//				LinkedList<BNode> height_2_3 = new LinkedList<>(); height_2_3.addLast(node_55); height_2_3.addLast(node_60); height_2_3.addLast(node_75);
//				LinkedList<BNode> height_2_4 = new LinkedList<>(); height_2_4.addLast(node_85); height_2_4.addLast(node_95);
//				
//				node_50.setChildren(height_0);
//				node_20.setChildren(height_1_1);
//				node_80.setChildren(height_1_2);
//				node_10.setChildren(height_2_1);
//				node_30_40.setChildren(height_2_2);
//				node_65_70.setChildren(height_2_3);
//				node_90.setChildren(height_2_4);
//				
//				node_50.addElement(50); 
//				node_20.addElement(20);  
//				node_80.addElement(80);   
//				node_10.addElement(10);  
//				node_30_40.addElement(30); node_30_40.addElement(40);   
//				node_65_70.addElement(65); node_65_70.addElement(70);    
//				node_90.addElement(90); 
//				node_5.addElement(5); 
//				node_15.addElement(15);  
//				node_25.addElement(25);  
//				node_35.addElement(35);  
//				node_45.addElement(45);  
//				node_55.addElement(55);  
//				node_60.addElement(60);  
//				node_75.addElement(75); 
//				node_85.addElement(85); 
//				node_95.addElement(95); 
//
//				BNode[] DepthLeftOrder = {node_50, 
//						node_20, 
//						node_10,
//						node_5,
//						node_15,
//						node_30_40,
//						node_25,
//						node_35,
//						node_45,
//						node_80,
//						node_65_70,
//						node_55,
//						node_60,
//						node_75,
//						node_90,
//						node_85,
//						node_95};
//				
//				treeOrd3.root = node_50;
//				
//				BNode[] DepthLeftOrderBTree = treeOrd3.depthLeftOrder();
//				
//				assertTrue(Arrays.equals(DepthLeftOrder, DepthLeftOrderBTree));
//				}
	
	
//	---------------------------------------------------------------------------------------------------------
	
	BTree<Integer> myBTree;
	
	@Before
	public void initialize() {
		myBTree = new BTreeImpl<Integer>(6);
	}

	/*@Test
	public void testGetRoot0() {
		BNode<Integer> ROOT = new BNode<Integer>(6);
		assertEquals(ROOT, myBTree.getRoot());
	}
	
	@Test
	public void testGetRoot1() {
		BNode<Integer> ROOT = new BNode<Integer>(6);
		ROOT.addElement(10);
		myBTree.insert(10);
		assertEquals(ROOT, myBTree.getRoot());
	}

	@Test
	public void testIsEmpty0() {
		assertTrue(myBTree.isEmpty());
	}

	@Test
	public void testIsEmpty1() {
		myBTree.insert(20);
		assertFalse(myBTree.isEmpty());
	}
	
	@Test
	public void testHeight0() {
		assertEquals(-1, myBTree.height());
	}
	
	@Test
	public void testHeight1() {
		myBTree.insert(20);
		assertEquals(0, myBTree.height());
	}
	
	@Test
	public void testHeight2() {
		myBTree.insert(0);
		myBTree.insert(5);
		myBTree.insert(10);
		myBTree.insert(15);
		myBTree.insert(20);
		assertEquals(0, myBTree.height());
	}
	
	@Test
	public void testHeight3() {
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(5);
		myBTree.insert(6);
		assertEquals(1, myBTree.height());
	}
	
	@Test
	public void testHeight4() {
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(0);		myBTree.insert(0);
		myBTree.insert(0);		myBTree.insert(0);		myBTree.insert(0);
		assertEquals(2, myBTree.height());
	}

	@Test
	public void testSize0() {
		assertEquals(0, myBTree.size());
	}

	@Test
	public void testSize1() {
		myBTree.insert(1);
		assertEquals(1, myBTree.size());
	}
	
	@Test
	public void testSize2() {
		myBTree.insert(1);		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(5);		myBTree.insert(6);		myBTree.insert(7);		myBTree.insert(8);
		myBTree.insert(9);		myBTree.insert(10);		myBTree.insert(11);		myBTree.insert(12);
		myBTree.insert(13);		myBTree.insert(14);		myBTree.insert(15);		myBTree.insert(16);
		myBTree.insert(17);		myBTree.insert(18);		myBTree.insert(19);		myBTree.insert(20);
		myBTree.insert(21);		myBTree.insert(22);		myBTree.insert(23);		myBTree.insert(24);
		myBTree.insert(25);		myBTree.insert(26);		myBTree.insert(27);		myBTree.insert(28);
		myBTree.insert(29);		myBTree.insert(30);		myBTree.insert(31);		myBTree.insert(32);
		myBTree.insert(33);		myBTree.insert(34);		myBTree.insert(35);		myBTree.insert(36);
		assertEquals(36, myBTree.size());
	}
	
	@Test
	public void testSearch0() {
		myBTree.insert(1);
		assertNull(myBTree.search(2).node);
		assertEquals(0, myBTree.search(2).position);
	}

	@Test
	public void testSearch1() {
		myBTree.insert(1);
		assertEquals(new Integer(1), myBTree.search(1).node.getElementAt(0));
		assertEquals(0, myBTree.search(1).position);
	}
	
	@Test
	public void testSearch2() {
		myBTree.insert(2);
		myBTree.insert(1);
		assertEquals(new Integer(2), myBTree.search(2).node.getElementAt(1));
		assertEquals(1, myBTree.search(2).position);
	}
	
	@Test
	public void testSearch3() {
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(5);
		myBTree.insert(6);
		
		assertEquals(myBTree.getRoot(), myBTree.search(3).node);
		assertEquals(0, myBTree.search(3).position);
	}*/
	
	public Integer[] makeIntegerArray(int [] array) {
		Integer[] no = new Integer[array.length];
		for (int i = 0 ; i < array.length ; i++)
			no[i] = new Integer(array[0]);
		return no;
	}
	
	@Test
	public void testInsert0() {
		int[] res1 = {1, 2, 3, 4, 5};
		Integer[] no1 = makeIntegerArray(res1);
		
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(5);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
	}
	
	@Test
	public void testInsert1() {
		int[] res1 = {4};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 2, 3};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {5, 6};
		Integer[] no3 = makeIntegerArray(res3);
		
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(5);
		myBTree.insert(6);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
	}
	
	@Test
	public void testInsert2() {
		int[] res1 = {3};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 1, 2};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {4, 5};
		Integer[] no3 = makeIntegerArray(res3);
		
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(5);
		myBTree.insert(1);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
	}
	
	@Test
	public void testInsert3() {
		int[] res1 = {3};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 1, 2};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {4, 6, 7};
		Integer[] no3 = makeIntegerArray(res3);
		
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(7);
		myBTree.insert(1);
		myBTree.insert(6);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
	}
	
	@Test
	public void testInsert4() {
		int[] res1 = {4, 15};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 2 , 3};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {5, 10};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {20, 25};
		Integer[] no4 = makeIntegerArray(res4);
		
		myBTree.insert(5);
		myBTree.insert(10);
		myBTree.insert(15);
		myBTree.insert(20);//1,2,5,10,15,20,25
		myBTree.insert(25);
		myBTree.insert(1); // inseri 1                 inseri 2                  inseri 3             inseri 4
		myBTree.insert(2); // 1,5,10/15*,20,25 - 15 - 1,2,5,10/20,25 - 15 - 1,2,3,5,10/20,25 -15- 1,2,3/4*,5,10/20,25 - 4,15 - 1,2,3|5,10|20,25
		myBTree.insert(3);
		myBTree.insert(4);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
	}
	
	@Test
	public void testInsert5() {
		int[] res1 = {2, 4, 15};
		Integer[] no1 = makeIntegerArray(res1);
		//0,1,1/2,3/5,10/20,25/2,4,15
		int[] res2 = {0, 1, 1,1};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {2, 3};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {5, 10};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {20, 25};
		Integer[] no5 = makeIntegerArray(res5);
		
		myBTree.insert(5);
		myBTree.insert(10);
		myBTree.insert(15);
		myBTree.insert(20);
		myBTree.insert(25);
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(0);
		myBTree.insert(1);// 1,5,10,15*,20,25 - 1,5,10/20,25/15 - 1,2,5,10/20,25/15 - 1,2,3,5,10/20,25/15
		myBTree.insert(2);// 1,2,3,4*,5,10/20,25/15 - 1,2,3/5,10/20,25/4,15 - 0,1,2,3/5,10/20,25/4,15
		myBTree.insert(1);// 0,1,1,2,3/5,10/20,25/4,15 - 0,1,1,2*,2,3/5,10/20,25/4,15 -  0,1,1,1/2,3/5,10/20,25/2,4,15
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
	}
	
	@Test
	public void testInsert6() {
		int[] res1 = {/*1, 3, 6, 15*/2,4,15};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {/*0, 1, 1*/0,1,1,1};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {2, 3};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {/*4, 5*/5,6,7,8,10};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {/*7, 8, 10*/};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {20, 25};
		Integer[] no6 = makeIntegerArray(res6);
		
		myBTree.insert(5); // 1,5,10,15,20,25 - 1,5,10,15*,20,25 - 1,5,10/20,25/15
		myBTree.insert(10);// 1,2,3,4*,5,10/20,25/15 - 0,1,1,2*,2,3/5,10/20,25/4,15
		myBTree.insert(15);//0,1,1,1/2,3/5,6,7,8,10/20,25/2,4,15
		myBTree.insert(20);
		myBTree.insert(25);
		myBTree.insert(1);
		myBTree.insert(2);
		myBTree.insert(3);
		myBTree.insert(4);
		myBTree.insert(0);
		myBTree.insert(1);//1,5,10/20,25/15 - 0,1,1,1/2,3/5,6,7,8,10/20,25/2,4,15
		myBTree.insert(2);;
		myBTree.insert(1);
		myBTree.insert(6);
		myBTree.insert(7);
		myBTree.insert(8);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
	//	assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, 
				myBTree.depthLeftOrder()[4].getElements().toArray(no6));
	}
	
	@Test
	public void testInsert7() {
		int[] res1 = {/*1, 3, 6, 15, 30*/2,4,15,35};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {0, 1, 1,1};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {2, 3};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {/*4, 5*/5,6,7,8,10};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {/*7, 8, 10*/20,25,30};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {/*20, 25*/40,45};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {35, 40, 45};
		Integer[] no7 = makeIntegerArray(res7);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
	//	assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
	}
	
	@Test
	public void testInsert8() {
		int[] res1 = {6};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {2,4,15,35};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1, 1,1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {2,3};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {5,6,7,8,10};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {20,25,30};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {40,45,50,55,60};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55, 60};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		//assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[0].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[1].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[2].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[3].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[4].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[5].getElements().toArray(no7));
	//	assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
	//	assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
	//	assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
	}
	
	/*@Test
	public void testMaximum0() {
		assertNull(myBTree.maximum(myBTree.getRoot()));
	}
	
	@Test
	public void testMaximum1() {
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		assertEquals(new Integer(25), myBTree.maximum(myBTree.getRoot()).getElements().getLast());
	}
	
	@Test
	public void testMaximum2() {
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		assertEquals(new Integer(60), myBTree.maximum(myBTree.getRoot()).getElements().getLast());
	}

	@Test
	public void testMinimum0() {
		assertNull(myBTree.minimum(myBTree.getRoot()));
	}

	@Test
	public void testMinimum1() {
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		assertEquals(new Integer(1), myBTree.minimum(myBTree.getRoot()).getElements().getFirst());
	}
	
	@Test
	public void testMinimum2() {
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		assertEquals(new Integer(0), myBTree.minimum(myBTree.getRoot()).getElements().getFirst());
	}*/
	
	/*@Test
	public void testRemove0() {
		int[] res1 = {6};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 3};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {2, 2};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {4, 5};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {15, 30, 45};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {7, 8, 10};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55, 60};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(13);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
		assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
	}

	@Test
	public void testRemove1() {
		int[] res1 = {15};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 3, 6};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {1, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {2, 2};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {4, 5};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {7, 8, 10};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {30, 45};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55, 60};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(0);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
		assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
		
	}
	
	@Test
	public void testRemove2() {
		int[] res1 = {6};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 3};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {2, 2};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {4, 5};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {15, 30, 42};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {7, 8, 10};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(42);
		
		myBTree.remove(45);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
		assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
	}
	
	@Test
	public void testRemove3() {
		int[] res1 = {15};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 6};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {1, 2, 4, 5};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {7, 8, 10};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {30, 45};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {20, 25};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {35, 40};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {50, 55, 60};
		Integer[] no9 = makeIntegerArray(res9);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(2);
		myBTree.remove(3);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
	}
	
	@Test
	public void testRemove4() {
		int[] res1 = {1, 6, 15, 30, 45};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {0, 1};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {1, 4, 5};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {7, 8, 10};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {20, 25};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {35, 40};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {50, 55, 60};
		Integer[] no7 = makeIntegerArray(res7);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(2);
		myBTree.remove(3);
		myBTree.remove(2);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
	}
	
	@Test
	public void testRemove5() {
		int[] res1 = {5, 10, 20, 25};
		Integer[] no1 = makeIntegerArray(res1);

		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(30);
		
		myBTree.remove(30);
		myBTree.remove(15);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
	}
	
	@Test
	public void testRemove6() {
		int[] res1 = {7};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 3};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {2, 2};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {4, 5};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {15, 30, 45};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {8, 10};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55, 60};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(6);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
		assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
	}
	
	@Test
	public void testRemove7() {
		int[] res1 = {15};
		Integer[] no1 = makeIntegerArray(res1);
		
		int[] res2 = {1, 3, 6};
		Integer[] no2 = makeIntegerArray(res2);
		
		int[] res3 = {0, 1};
		Integer[] no3 = makeIntegerArray(res3);
		
		int[] res4 = {1, 2};
		Integer[] no4 = makeIntegerArray(res4);
		
		int[] res5 = {4, 5};
		Integer[] no5 = makeIntegerArray(res5);
		
		int[] res6 = {7, 8, 10};
		Integer[] no6 = makeIntegerArray(res6);
		
		int[] res7 = {30, 45};
		Integer[] no7 = makeIntegerArray(res7);
		
		int[] res8 = {20, 25};
		Integer[] no8 = makeIntegerArray(res8);
		
		int[] res9 = {35, 40};
		Integer[] no9 = makeIntegerArray(res9);
		
		int[] res10 = {50, 55, 60};
		Integer[] no10 = makeIntegerArray(res10);
		
		myBTree.insert(5);		myBTree.insert(10);		myBTree.insert(15);
		myBTree.insert(20);		myBTree.insert(25);		myBTree.insert(1);
		myBTree.insert(2);		myBTree.insert(3);		myBTree.insert(4);
		myBTree.insert(0);		myBTree.insert(1);		myBTree.insert(2);
		myBTree.insert(1);		myBTree.insert(6);		myBTree.insert(7);
		myBTree.insert(8);		myBTree.insert(30);		myBTree.insert(35);
		myBTree.insert(40);		myBTree.insert(45);		myBTree.insert(50);
		myBTree.insert(55);		myBTree.insert(60);
		
		myBTree.remove(2);
		
		assertArrayEquals(no1, myBTree.depthLeftOrder()[0].getElements().toArray(no1));
		assertArrayEquals(no2, myBTree.depthLeftOrder()[1].getElements().toArray(no2));
		assertArrayEquals(no3, myBTree.depthLeftOrder()[2].getElements().toArray(no3));
		assertArrayEquals(no4, myBTree.depthLeftOrder()[3].getElements().toArray(no4));
		assertArrayEquals(no5, myBTree.depthLeftOrder()[4].getElements().toArray(no5));
		assertArrayEquals(no6, myBTree.depthLeftOrder()[5].getElements().toArray(no6));
		assertArrayEquals(no7, myBTree.depthLeftOrder()[6].getElements().toArray(no7));
		assertArrayEquals(no8, myBTree.depthLeftOrder()[7].getElements().toArray(no8));
		assertArrayEquals(no9, myBTree.depthLeftOrder()[8].getElements().toArray(no9));
		assertArrayEquals(no10, myBTree.depthLeftOrder()[9].getElements().toArray(no10));
	}*/
	
}
