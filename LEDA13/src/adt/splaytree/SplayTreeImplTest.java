package adt.splaytree;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class SplayTreeImplTest{


	private SplayTree<Integer> tree;

	@Before
	public void startUp(){
		tree = new SplayTreeImpl<Integer>(); 
	}

	@Test
	public void testSplay(){
		for(int i = 0; i < 50; i++){
			tree.remove(i);
			tree.search(i);
		}

//------------------------------------------------------------------------------------------------------------------------------------------------------
		tree.insert(40);
//      								40

		Assert.assertTrue(Arrays.equals(new Integer[]{40}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{40}, tree.postOrder()));

	
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(30);
//	 									30
//     							 			40

		Assert.assertTrue(Arrays.equals(new Integer[]{30,40}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{40,30}, tree.postOrder()));

//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(50);
//                                 		50
//	 								40		
//                           	30

		Assert.assertTrue(Arrays.equals(new Integer[]{50,40,30}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{30,40,50}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(60);

//   						   			60
//									50				
//								40		
//	                 		30
		
		Assert.assertTrue(Arrays.equals(new Integer[]{60,50,40,30}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{30,40,50,60}, tree.postOrder()));	
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(20);

//										20									   		
//											   50																
//										    30	  60										
//   							              40				              				
										
		Assert.assertTrue(Arrays.equals(new Integer[]{20,50,30,40,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{40,30,60,50,20}, tree.postOrder()));
		
		
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(25);									   		
//		  								25																
//	  						      20          30										
//    									   		  50	              				
//											    40  60

		Assert.assertTrue(Arrays.equals(new Integer[]{25,20,30,50,40,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,40,60,50,30,25}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(45);
//			 							45																
//		    					 30           50    										
//		   		      		  25    40	         60  	 	              				
//				     	    20			   						   			    	 	

		Assert.assertTrue(Arrays.equals(new Integer[]{45,30,25,20,40,50,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,40,30,60,50,45}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.insert(35);
//										35																
//  							 30            45    										
//	  			              25     	    40    50  	 	              				
//					        20	   	   			    60			    	 	 	
		
		Assert.assertTrue(Arrays.equals(new Integer[]{35,30,25,20,45,40,50,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,30,40,60,50,45,35}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.search(35);
//										35															
//  							 30            45    										      
//	  			              25     	    40    50  	 	              				          
//					        20	   	   			    60                                            		    	 	 	                                                                      
		
		Assert.assertTrue(Arrays.equals(new Integer[]{35,30,25,20,45,40,50,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,30,40,60,50,45,35}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------		
		tree.search(30);
//										30																
//  							 25            35    										
//	  			              20     	          45  	 	             				
//					         	   	   			40  50             
//			    	 	 	                         60             
		
		Assert.assertTrue(Arrays.equals(new Integer[]{30,25,20,35,45,40,50,60}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,40,60,50,45,35,30}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------
		tree.search(60);
//					 				    60																			
//  						  35         	      												
//	  			         30          50 	                	 	             						
//				 	   25          45	   	    		                                        
//			     	  20 	      40                                                           
		
		Assert.assertTrue(Arrays.equals(new Integer[]{60,35,30,25,20,50,45,40}, tree.preOrder()));                                          
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,30,40,45,50,35,60}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------	
		tree.search(28);
//								   	    25									
//  				   	 20                                60	  							
//	  			                    	 	   30 	                         	 	             	
//			          	    		   		      35	   			                  
//			    	        			             50
//		                     			            45  
//                            			           40    
		
		Assert.assertTrue(Arrays.equals(new Integer[]{25,20,60,30,35,50,45,40}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,40,45,50,35,30,60,25}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------	
		tree.search(42);
//								   	    40									     
//  				   	       25                 60	  					
//	  			           20     35      	   45                       	 
//			          	         30 		    50			             
		
		Assert.assertTrue(Arrays.equals(new Integer[]{40,25,20,35,30,60,45,50}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,30,35,25,50,45,60,40}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------	
		tree.remove(40);
//								   	    45							
//  				   	       25                 60	  			
//	  			           20     35      	   50                 
//			          	         30 		    		
	
		Assert.assertTrue(Arrays.equals(new Integer[]{45,25,20,35,30,60,50}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,30,35,25,50,60,45}, tree.postOrder()));
//------------------------------------------------------------------------------------------------------------------------------------------------------	
		tree.remove(28);                                              	
//								   	    30							   	
//  				   	       25                 45	  			   	
//	  			           20           	   35	 60                      	
//			          	         		    		50		               
		
		Assert.assertTrue(Arrays.equals(new Integer[]{30,25,20,45,35,60,50}, tree.preOrder()));
		Assert.assertTrue(Arrays.equals(new Integer[]{20,25,35,50,60,45,30}, tree.postOrder()));
		    		           

	}
	
	@Test
	public void testString(){
		String h = new String("casa");
		System.out.println(h.equals(null));
	}
	
}