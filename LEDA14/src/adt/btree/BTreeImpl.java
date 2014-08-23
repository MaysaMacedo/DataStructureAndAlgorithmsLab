package adt.btree;

import java.util.Arrays;
import java.util.LinkedList;


public class BTreeImpl<T extends Comparable<T>> implements
		BTree<T> {

	protected BNode<T> root;
	protected int order;
	
	public BTreeImpl(int order) {
		this.order = order;
		this.root = new BNode<T>(order);
	}
	
	@Override
	public BNode<T> getRoot() {
		return this.root;
	}

	@Override
	public boolean isEmpty() {
		return this.root.isEmpty();
	}

	@Override
	public int height() {
		return height(this.root);
	}
	private int height(BNode<T> node){
		int resp = -1;
		if(!node.isEmpty()){
			if(node.isLeaf()){
				resp = 0;
			}else{
				resp = 1 + height(node.children.get(0));
				//a idéia é pegar a algura do primeiro filho apenas e somar com 1.
				//Se voce usar array vai ter que ajustar o codigo aqui.
			}
		}
		return resp;
	}
	@Override
	public BNode<T>[] depthLeftOrder() {
		
		LinkedList<BNode<T>> linked = new LinkedList<>();
		BNode[] tmp = new BNode[linked.size()];
		linked = depthLeftOrder(root, linked);
		
		return linked.toArray(tmp);
	}
	
	public LinkedList<BNode<T>> depthLeftOrder(BNode<T> node, LinkedList<BNode<T>> list){
		if(!node.isEmpty()){
			list.add(node);
			for(int i = 0; i < node.getChildren().size(); i++){
				depthLeftOrder(node.getChildren().get(i), list);				
			}			
		}
		return list;
	}
	
	@Override
	public int size() {
		return sizeAux(root);
	}
	
	private int sizeAux(BNode<T> node) {
		int size = 0;
		if(!node.isEmpty()) {
			if(node.isLeaf()){
				size = node.size();
			} else {
				size = node.size();
				for(int i = 0; i < node.getChildren().size(); i++) {
					size += sizeAux(node.getChildren().get(i));
				}
			}
		}
		return size;
	}

	@Override
	public BNodePosition<T> search(T element) {
		return searchAux(root,element);
	}
	
	private BNodePosition<T> searchAux(BNode<T> node , T element) {
		int i = 0;
		BNodePosition<T> nodPosition = new BNodePosition<T>();
		while(i <= node.elements.size() && element.compareTo(node.elements.get(i)) > 0) {
			i ++;
		}
		if(i <= node.elements.size() && element.equals(node.elements.get(i))) {
			nodPosition.position = i;
			nodPosition.node = node;
			return nodPosition;
		}
		if(node.isLeaf()) {
			return new BNodePosition<T>();
		}
		return searchAux(node.children.get(i), element);
	}

	@Override
	public void insert(T element) {
		insertAux(root, element);
	}
	
	private void insertAux(BNode<T> node , T element) {
		if(node.isLeaf()) {
				node.addElement(element);
				if(node.elements.size() > node.maxKeys) {
					node.split();
				}
		} else {
			int position = searchPositionInParent(node.getElements(), element);
			insertAux(node.getChildren().get(position),element);
		}
	}
	
	private int searchPositionInParent(LinkedList<T> list , T mediana) {
		int i = 0;
		while(i < list.size()) {
			if( list.get(i).compareTo(mediana) > 0 ) {
				return i;
			} i++;
		}
		return list.size();
	}

	//NAO PRECISA IMPLEMENTAR OS METODOS ABAIXO
	@Override
	public BNode<T> maximum(BNode<T> node) {
		//NAO PRECISA IMPLEMENTAR
		return null;
	}
	@Override
	public BNode<T> minimum(BNode<T> node) {
		//NAO PRECISA IMPLEMENTAR
		return null;
	}
	@Override
	public void remove(T element) {
		//NAO PRECISA IMPLEMENTAR

	}

	

}
