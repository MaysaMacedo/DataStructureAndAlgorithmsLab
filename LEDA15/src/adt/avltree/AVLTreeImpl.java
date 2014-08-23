package adt.avltree;

import adt.bst.BSTImpl;
import adt.bst.BSTNode;

public class AVLTreeImpl<T extends Comparable<T>> 
    extends BSTImpl<T> implements AVLTree<T> {

	//AUXILIARY
	protected int calculateBalance(BSTNode<T> node){
		if(!node.isEmpty())
			return heightAux((BSTNode<T>)node.getLeft(),-1) - heightAux((BSTNode<T>) node.getRight(),-1);
		return 0;
	}
	
	//AUXILIARY
	protected void rebalance(BSTNode<T> node){
		if (calculateBalance(node) > 1) {
			if (calculateBalance((BSTNode<T>) node.getLeft()) <= -1) {
				leftRotation((BSTNode<T>) node.getLeft());
			}
			rightRotation(node);
		}else if (calculateBalance(node) <-1) {
			if (calculateBalance((BSTNode<T>) node.getRight()) >= 1) {
				rightRotation((BSTNode<T>) node.getRight());
			}
			leftRotation(node);
		}	 
	}
	
	//AUXILIARY
	protected void rebalanceUp(BSTNode<T> node){
		if (!node.isEmpty()) {
			BSTNode<T> parent = (BSTNode<T>) node.getParent();
			while (!parent.isEmpty()) {
				rebalance(parent);
				parent = (BSTNode<T>) parent.getParent();
				if (parent == null) {
					break;
				}
			}
		}
	}
	
	//AUXILIARY
	protected void leftRotation(BSTNode<T> node){
		BSTNode<T> pivot = (BSTNode<T>) node.getRight();
		node.setRight(pivot.getLeft());
		pivot.getLeft().setParent(node);
		pivot.setLeft(node);
		pivot.setParent(node.getParent());
		node.setParent(pivot);
		if (node.equals(root)) {
			root = pivot;
		} else {
			if (pivot.getData().compareTo(pivot.getParent().getData()) < 0) 
				pivot.getParent().setLeft(pivot);
			else 
				pivot.getParent().setRight(pivot);
		}
	}
	
	//AUXILIARY
	protected void rightRotation(BSTNode<T> node){
		BSTNode<T> pivot = (BSTNode<T>) node.getLeft();
		node.setLeft(pivot.getRight());
		pivot.getRight().setParent(node);
		pivot.setRight(node);
		pivot.setParent(node.getParent());
		node.setParent(pivot);
		
		if (node.equals(root)) {
			root = pivot;
		}else {
			if (pivot.getData().compareTo(pivot.getParent().getData()) > 0) 
				pivot.getParent().setRight(pivot);
			else 
				pivot.getParent().setLeft(pivot);
		}
	}
	
}
