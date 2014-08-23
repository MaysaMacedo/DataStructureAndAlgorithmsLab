package adt.bst;

import java.util.ArrayList;
import java.util.List;

import adt.bt.BTNode;

public class BSTImpl<T extends Comparable<T>> implements BST<T> {

	protected BSTNode<T> root;

	public BSTImpl() {
		root = new BSTNode<T>();
	}

	public BSTNode<T> getRoot() {
		return this.root;
	}

	@Override
	public boolean isEmpty() {
		return root.isEmpty();
	}

	@Override
	public int height() {
		return heightAux(root, -1);
	}

	private int heightAux(BSTNode<T> node, int soma) {
		if (!node.isEmpty()){
			int direita = heightAux((BSTNode<T>) node.getRight(), soma + 1);
			int esquerda = heightAux((BSTNode<T>) node.getLeft(), soma + 1);
			soma = Math.max(direita,esquerda);
		}
		return soma;
	}

	@Override
	public BSTNode<T> search(T element) {
		BSTNode<T> aux = root;
		while (aux.getData() != null && !element.equals(aux.getData())) {
			if (element.compareTo(aux.getData()) < 0) {
				aux = (BSTNode<T>) aux.getLeft();
			} else {
				aux = (BSTNode<T>) aux.getRight();
			}
		}
		return aux;
	}

	@Override
	public void insert(T element) {
		insertAux(null, root, element);
	}

	private void insertAux(BSTNode<T> parent, BSTNode<T> node, T elem) {
		if (node.isEmpty()) {
			node.setData(elem);
			node.setLeft(new BSTNode<T>());
			node.setRight(new BSTNode<T>());
			node.setParent(parent);
		} else {
			if (elem.compareTo(node.getData()) < 0) {
				insertAux(node, (BSTNode<T>) node.getLeft(), elem);
			} else if (elem.compareTo(node.getData()) > 0) {
				insertAux(node, (BSTNode<T>) node.getRight(), elem);
			}
		}
	}

	@Override
	public BSTNode<T> maximum() {
		return maxAux(root);
	}

	private BSTNode<T> maxAux(BSTNode<T> elem) {
		if (isEmpty())
			return null;
		if (!elem.getRight().isEmpty())
			return maxAux((BSTNode<T>) elem.getRight());
		return elem;
	}

	@Override
	public BSTNode<T> minimum() {
		return minAux(root);
	}

	private BSTNode<T> minAux(BSTNode<T> elem) {
		if (isEmpty())
			return null;
		if (!elem.getLeft().isEmpty()) {
			return minAux((BSTNode<T>) elem.getLeft());
		}
		return elem;
	}

	@Override
	public BSTNode<T> sucessor(T element) {
		BSTNode<T> node = search(element);
		BSTNode<T> parent = (BSTNode<T>) node.getParent();
		if (node.isEmpty())
			return null;
		if (!node.getRight().isEmpty()) {
			return minAux((BSTNode<T>) node.getRight());
		}
		while (parent != null && node.equals(parent.getRight())) {
			node = parent;
			parent = (BSTNode<T>) parent.getParent();
		}
		return parent;
	}

	@Override
	public BSTNode<T> predecessor(T element) {
		BSTNode<T> node = search(element);
		BSTNode<T> parent = (BSTNode<T>) node.getParent();
		if (node.isEmpty())
			return null;
		if (!node.getLeft().isEmpty())
			return (BSTNode<T>) maxAux((BSTNode<T>) node.getLeft());
		while (parent != null && node.equals(parent.getLeft())) {
			node = parent;
			parent = (BSTNode<T>) parent.getParent();
		}
		return parent;
	}

	@Override
	public void remove(T element) {
		/*BSTNode<T> node = search(element);
		if(!node.isEmpty()){
			if(node.getLeft().isEmpty() && node.getRight().isEmpty())
				node.setData(null);
			else if (node != null && node.equals(root)) {
				if (!root.getLeft().isEmpty() && !root.getRight().isEmpty()) {
					root.setData(minAux((BSTNode<T>) node.getRight()).getData());
					minAux((BSTNode<T>) node.getRight()).setData(null);
				} else if (!root.getLeft().isEmpty()) {
					root = (BSTNode<T>) node.getLeft();
				} else {
					root = (BSTNode<T>) node.getRight();
				}
			}
			else if (node != null && !node.equals(root)) {
				if (node.getRight().isEmpty() && node.getLeft().isEmpty()) {
					node.setData(null);
				} else if (node.getLeft().isEmpty()) {
					node.getParent().setRight(node.getRight());
					node.getRight().setParent(node.getParent());
				} else if (node.getRight().isEmpty()) {
					node.getParent().setLeft(node.getLeft());
					node.getLeft().setParent(node.getParent());
				} else {
					T suc = minAux((BSTNode<T>) node.getRight()).getData();
					remove(suc);
					node.setData(suc);
				}
			} 
		}*/
		BSTNode<T> node = search(element);
		
		if(node.isEmpty()) {
			return;
		} else {
			if(node.getLeft().isEmpty() && node.getRight().isEmpty()) {
				node.setData(null);				
			}
			else if(node.getLeft().isEmpty() || node.getRight().isEmpty()) {
				if(node.getParent() != null) {
					if(!node.getParent().getLeft().equals(node)) {
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
					}
					else{
						root = (BSTNode<T>) node.getLeft();
					}
					root.setParent(null);					
				}
			} else {
				T suc = sucessor(node.getData()).getData();
				remove(suc);
				node.setData(suc);
			}
		}
	}

	@Override
	public T[] preOrder() {
		T[] result = (T[]) new Comparable[size()];
		List<T> list = new ArrayList<T>();
		preOrderAux(root, list);
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	private void visit(List<T> list, BSTNode<T> node) {
		list.add(node.getData());
	}

	private void preOrderAux(BSTNode<T> node, List<T> list) {
		if (node.getData() != null) {
			visit(list, node);
			preOrderAux((BSTNode<T>) node.getLeft(), list);
			preOrderAux((BSTNode<T>) node.getRight(), list);
		}
	}

	private void postOrderAux(BSTNode<T> node, List<T> list) {
		if (node.getData() != null) {

			postOrderAux((BSTNode<T>) node.getLeft(), list);
			postOrderAux((BSTNode<T>) node.getRight(), list);
			visit(list, node);
		}
	}

	@Override
	public T[] order() {
		T[] result = (T[]) new Comparable[size()];
		List<T> list = new ArrayList<T>();
		orderAux(root, list);
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	private void orderAux(BSTNode<T> node, List<T> list) {
		if (node.getData() != null) {
			orderAux((BSTNode<T>) node.getLeft(), list);
			visit(list, node);
			orderAux((BSTNode<T>) node.getRight(), list);
		}
	}

	@Override
	public T[] postOrder() {
		T[] result = (T[]) new Comparable[size()];
		List<T> list = new ArrayList<T>();
		postOrderAux(root, list);
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	@Override
	public int size() {
		return size(root);
	}

	private int size(BSTNode<T> node) {
		int result = 0;
		if (!node.isEmpty()) {
			result = 1 + size((BSTNode<T>) node.getLeft())
					+ size((BSTNode<T>) node.getRight());
		}
		return result;
	}

}
