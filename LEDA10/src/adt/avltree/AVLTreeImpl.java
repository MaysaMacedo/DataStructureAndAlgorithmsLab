package adt.avltree;

import adt.bst.BSTImpl;
import adt.bst.BSTNode;

public class AVLTreeImpl<T extends Comparable<T>> 
    extends BSTImpl<T> implements AVLTree<T> {

	//TODO Do not forget: you must override the methods insert and remove conveniently.

	@Override
	public void remove(T element) {
		BSTNode<T> procura = search(element);
		auxRemove(procura);
	}
	private void auxRemove(BSTNode<T> node) {
		if(!node.isEmpty()) {
			if(node.getRight().isEmpty() && node.getLeft().isEmpty()) {
				node.setData(null);
				rebalanceUp(node);
			}
			else if(node.getRight().isEmpty() || node.getLeft().isEmpty()) {
				if(!node.equals(root)) {
					if(node.getParent().getLeft().equals(node)) {
						if(!node.getLeft().isEmpty()) {
							node.getParent().setLeft(node.getLeft());
							node.getLeft().setParent(node.getParent());
						} else {
							node.getParent().setLeft(node.getRight());
							node.getLeft().setParent(node.getParent());
						}
					} else {
						if(!node.getLeft().isEmpty()) {
							node.getParent().setRight(node.getLeft());
							node.getRight().setParent(node.getParent());
						} else {
							node.getParent().setRight(node.getRight());
							node.getRight().setParent(node.getParent());
						}
					}
				} else {
					root.setData(null);
					if (!node.getRight().isEmpty()) {
						root = (BSTNode<T>) node.getRight();
					} else {
						root = (BSTNode<T>) node.getLeft();
					}
				}rebalanceUp(node);
				
			}else {
				BSTNode<T> sucessor = sucessor(node.getData());
				node.setData(sucessor.getData());
				auxRemove(sucessor);
			}
		}
	}

	@Override
	protected void insertAux(BSTNode<T> parent, BSTNode<T> node, T elem) {
		if (node.isEmpty()) {
			node.setData(elem);
			node.setLeft(new BSTNode<T>());
			node.setRight(new BSTNode<T>());
			node.getLeft().setParent(node);
			node.getRight().setParent(node);
			node.setParent(parent);

		} else {
			if (elem.compareTo(node.getData()) < 0) {
				insertAux(node, (BSTNode<T>) node.getLeft(), elem);
			} else if (elem.compareTo(node.getData()) > 0) {
				insertAux(node, (BSTNode<T>) node.getRight(), elem);
			}rebalance(node);
		}
	}
	
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
