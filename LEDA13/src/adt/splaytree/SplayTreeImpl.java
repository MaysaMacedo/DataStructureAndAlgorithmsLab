package adt.splaytree;

import adt.avltree.AVLTreeImpl;
import adt.bst.BSTNode;

public class SplayTreeImpl<T extends Comparable<T>> extends AVLTreeImpl<T> implements
		SplayTree<T> {

	
	private void splay(BSTNode<T> node) {
		if(node == null || node.isEmpty() || node.equals(root)) {
			return;
		}
		else if(node.getParent().equals(root)) {
			if(node.equals(node.getParent().getRight())) {
				leftRotation(root);
			}
			else if(node.equals(node.getParent().getLeft())) {
				rightRotation(root);
			}
		
		}
		else if(node.getParent().equals(node.getParent().getParent().getRight())) {
				if(node.equals(node.getParent().getLeft())) {
					rightRotation((BSTNode<T>) node.getParent());
					leftRotation((BSTNode<T>) node.getParent());
				}
				else if(node.equals(node.getParent().getRight())) {
					leftRotation((BSTNode<T>)node.getParent().getParent());
					leftRotation((BSTNode<T>)node.getParent());	
				}
			
		}
		else if(node.getParent().equals(node.getParent().getParent().getLeft())) {
				if(node.equals(node.getParent().getRight())) {
					leftRotation((BSTNode<T>)node.getParent());
					rightRotation((BSTNode<T>) node.getParent());
				}
				if(node.equals(node.getParent().getLeft())) {
					rightRotation((BSTNode<T>) node.getParent().getParent());
					rightRotation((BSTNode<T>) node.getParent());
				}
			}
			splay(node);
		}
	
	
	@Override
	public void remove(T element) {
		BSTNode<T> node = super.search(element);
		if(!node.isEmpty()){
			auxRemove(element);
			splay((BSTNode<T>)node.getParent());
		}
			splay((BSTNode<T>)node.getParent());
	}
	
	public void auxRemove(T element) {
		BSTNode<T> node = super.search(element);
	
		if(node.isEmpty()) {
			return;
		} else {
			if(node.getLeft().isEmpty() && node.getRight().isEmpty()) {
				node.setData(null);				
			}
			else if(node.getLeft().isEmpty() || node.getRight().isEmpty()) {
				if(node.getParent() != null) {
					if(!node.getParent().getRight().isEmpty() && !node.getParent().getLeft().equals(node)) {
						if(!node.getLeft().isEmpty()){
							node.getParent().setRight(node.getLeft());
							node.getLeft().setParent(node.getParent());
						}
						else{
							node.getParent().setRight(node.getRight());
							node.getRight().setParent(node.getParent());
						}
					}
					else{
						if(!node.getLeft().isEmpty()){
							node.getParent().setLeft(node.getLeft());
							node.getLeft().setParent(node.getParent());
						}
						else{
							node.getParent().setLeft(node.getRight());
							node.getRight().setParent(node.getParent());
						}
					}
				}
				else{
					if(node.getLeft().isEmpty()){
						root = (BSTNode<T>) node.getRight();
						root.setParent(null);		
					}
					else{
						root = (BSTNode<T>) node.getLeft();
						root.setParent(null);		
					}
				}
			} else {
				T suc = sucessor(node.getData()).getData();
				auxRemove(suc);
				node.setData(suc);
			}
		}
	}
	
	@Override
	protected void insertAux(BSTNode<T> parent, BSTNode<T> node, T elem) {
		if (node.isEmpty()) {
			node.setData(elem);
			node.setLeft(new BSTNode<T>());
			node.setRight(new BSTNode<T>());
			node.setParent(parent);
			splay(node);
		} else {
			if (elem.compareTo(node.getData()) < 0) {
				insertAux(node, (BSTNode<T>) node.getLeft(), elem);
			} else if (elem.compareTo(node.getData()) > 0) {
				insertAux(node, (BSTNode<T>) node.getRight(), elem);
			}
		}
	}
	
	@Override
	public BSTNode<T> search(T element) {
		BSTNode<T> node = super.search(element);
		if(node.isEmpty()) {
			splay((BSTNode<T>) node.getParent());
		}
		else {
			splay(node);
		}
		return node;
	}
}
