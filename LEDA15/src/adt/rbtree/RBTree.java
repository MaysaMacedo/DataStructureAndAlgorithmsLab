package adt.rbtree;

import adt.avltree.AVLTree;

/**
 * Represents a generic Red Black Tree. 
 */
public interface RBTree<T extends Comparable<T>> extends AVLTree<T>{
	public RBNode<T>[] extendedPreOrder();
}
