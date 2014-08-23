package adt.rbtree;

import java.util.ArrayList;

import adt.avltree.AVLTreeImpl;
import adt.bst.BSTNode;
import adt.rbtree.RBNode.Colour;

public class RBTreeImpl<T extends Comparable<T>> extends AVLTreeImpl<T> 
	implements RBTree<T> {

	public RBTreeImpl() {
		this.root = new RBNode<T>();
	}
	
	protected int blackHeight() {
		return blackHeight((RBNode<T>) root);
	}

	private int blackHeight(RBNode<T> node) {
		int count = 0;
		if (!node.isEmpty()) {
			if (node.getColour().equals(Colour.BLACK)) {
				count = 1 + maximum(blackHeight((RBNode<T>) node.getLeft()),blackHeight((RBNode<T>) node.getRight()));
			} else {
				count = maximum(blackHeight((RBNode<T>) node.getLeft()),blackHeight((RBNode<T>) node.getRight()));
			}
		}
		return count;
	}
	
	public int maximum(int heightLeft, int heightRight) {
		int maximum;
		if(heightLeft >= heightRight) {
			maximum = heightLeft;
		}
		else {
			maximum = heightRight;
		}
		return maximum;
	}

	protected boolean verifyProperties(){
		boolean resp = verifyNodesColour()
						&& verifyNILNodeColour()
						&& verifyRootColour()
						&& verifyChildrenOfRedNodes()
						&& verifyBlackHeight();
		
		return resp;
	}
	/**
	 * The colour of each node of a RB tree is black or red. This is guaranteed by the type Colour.
	 */
	private boolean verifyNodesColour(){
		return true; //already implemented
	}
	/**
	 * The colour of the root must be black.
	 */
	private boolean verifyRootColour(){
		return ((RBNode<T>)root).getColour() == Colour.BLACK; //already implemented
	}
	
	/**
	 * This is guaranteed by the constructor.
	 */
	private boolean verifyNILNodeColour(){
		return true; //already implemented
	}
	
	/**
	 * Verifies the property for all RED nodes: the children of a red node must be BLACK.
	 */
	private boolean verifyChildrenOfRedNodes(){
		if(!this.isEmpty()) {
			return  verifyChildrenOfRed((RBNode<T>) this.root);
		}
		return true;
	}
	
	private boolean verifyChildrenOfRed(RBNode<T> node) {
		boolean correct = true;
		if (!node.isEmpty()) {
			if (node.getColour().equals(Colour.RED)) {
				if (((RBNode<T>) node.getRight()).getColour().equals(Colour.BLACK) && ((RBNode<T>) node.getLeft()).getColour().equals(Colour.BLACK)) {
					correct = verifyChildrenOfRed((RBNode<T>) node.getLeft()) && verifyChildrenOfRed((RBNode<T>) node.getRight());
				}
			} else {
				correct = verifyChildrenOfRed((RBNode<T>) node.getLeft()) && verifyChildrenOfRed((RBNode<T>) node.getRight());
			}
		}		
		return correct;
	}
	
	
	/**
	 * Verifies the black-height property from the root. The method blackHeight returns an exception if the black heights are different.  
	 */
	private boolean verifyBlackHeight(){
		return blackHeight((RBNode<T>) root.getLeft()) == blackHeight((RBNode<T>) root.getRight());
	}

	
	@Override
	public void insert(T value) {
		RBNode<T> node = new RBNode<T>();
		if (this.isEmpty()) {
			node.setColour(Colour.BLACK);
			node.setData(value);
			node.setLeft(new RBNode<T>());
			node.setParent(null);
			node.setRight(new RBNode<T>());
			node.getLeft().setParent(node);
			node.getRight().setParent(node);
			this.root = node;
		}
		else {
		insertAux(((RBNode<T>) root), value); 
		}
		
	}
	protected void insertAux( RBNode<T> node, T elem) {
		if (node.isEmpty()) {
			node.setData(elem);
			node.setLeft(new RBNode<T>());
			node.setRight(new RBNode<T>());
			node.getLeft().setParent(node);
			node.getRight().setParent(node);
			((RBNode<T>) node).setColour(Colour.RED);
			fixUpOne((RBNode<T>) node);
		} else {
			if (elem.compareTo(node.getData()) < 0) {
				insertAux((RBNode<T>) node.getLeft(), elem);
			} else if (elem.compareTo(node.getData()) > 0) {
				insertAux( (RBNode<T>) node.getRight(), elem);
			}
		}
	}
	private void fixUpOne(RBNode<T> node) {
		if(node.equals(root)) {
			node.setColour(Colour.BLACK);
		} else {
			fixUpTwo(node);
		}
	}
	private void fixUpTwo(RBNode<T> node) {
		if(!((RBNode<T>) node.getParent()).getColour().equals(Colour.BLACK)) {
			RBNode<T> uncle;
			if( node.getParent().getData() != null && node.getParent().getParent().getRight().getData() != null  && 
					node.getParent().getParent().getRight()
					.equals(node.getParent())) {
				uncle = (RBNode<T>) node.getParent().getParent().getLeft();
			}
			else {
				uncle = (RBNode<T>) node.getParent().getParent().getRight();
			}
			fixUpThree(node,uncle);
		}
	}

	private void fixUpThree(RBNode<T> node,RBNode<T> uncle) {
		if(uncle.getColour().equals(Colour.RED)) {
			((RBNode<T>)node.getParent()).setColour(Colour.BLACK);
			if(node.getParent().getParent().getLeft().getData() != null && node.getParent().getParent().getLeft().equals(node.getParent())){
				((RBNode<T>)node.getParent().getParent().getRight()).setColour(Colour.BLACK);
			}
			else{
				((RBNode<T>)node.getParent().getParent().getLeft()).setColour(Colour.BLACK);
			}
			((RBNode<T>)node.getParent().getParent()).setColour(Colour.RED);
			fixUpOne((RBNode<T>)node.getParent().getParent()); 
		}
		else {
			fixUpFour(node);
		} 
	}
	
	private void fixUpFour(RBNode<T> node) {
		RBNode<T> next = node;
		if(node.getParent().getParent().getLeft().getData() != null && node.getParent().getRight().getData() != null 
				&& node.equals(node.getParent().getRight()) && node.getParent().equals(node.getParent().getParent().getLeft())) {
			leftRotation((BSTNode<T>) node.getParent());
			next = (RBNode<T>) node.getLeft();
		}
		else if(node.getParent().getParent().getRight().getData() != null && node.getParent().getLeft().getData() != null 
				&& node.equals(node.getParent().getLeft()) && node.getParent().equals(node.getParent().getParent().getRight())) {
			rightRotation((BSTNode<T>) node.getParent());
			next = (RBNode<T>) node.getRight();
		}
		fixUpFive(next);
	}
	
	private void fixUpFive(RBNode<T> node) {
		((RBNode<T>)node.getParent()).setColour(Colour.BLACK);
		((RBNode<T>)node.getParent().getParent()).setColour(Colour.RED);
		
		if(node.getParent().getLeft().getData() != null && node.equals(node.getParent().getLeft())) {
			rightRotation((BSTNode<T>) node.getParent().getParent());
		}
		else {
			leftRotation((BSTNode<T>) node.getParent().getParent());
		}
	}
	
	@Override
	public RBNode<T>[] extendedPreOrder(){
		ArrayList<RBNode<T>> lista = new ArrayList<RBNode<T>>();
		extendedPreOrderAux(root, lista);
		RBNode<T>[] array = new RBNode[size()];
		
		for (int i = 0; i < array.length; i++) array[i] = lista.get(i);
			return array;
	}

	private void extendedPreOrderAux(BSTNode<T> node, ArrayList<RBNode<T>> lista) {
		if (!node.isEmpty()){
			lista.add((RBNode<T>) node);
			extendedPreOrderAux((BSTNode<T>) node.getLeft(), lista);
			extendedPreOrderAux((BSTNode<T>) node.getRight(), lista);
		}
	}
}
