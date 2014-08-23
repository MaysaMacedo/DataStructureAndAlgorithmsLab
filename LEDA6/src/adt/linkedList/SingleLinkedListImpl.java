package adt.linkedList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleLinkedListImpl<T> implements LinkedList<T> {

	protected SingleLinkedListNode<T> head;
	
	public SingleLinkedListImpl() {
		head = new SingleLinkedListNode<>();
	}
	@Override
	public boolean isEmpty() {
		return head.isNIL();
	}

	@Override
	public int size() {
		int size = 0;
		SingleLinkedListNode<T> aux = head;
		while(!aux.isNIL()){
			size ++;
			aux = aux.next;
		}
		return size;
	}

	@Override
	public T search(T element) {
		SingleLinkedListNode<T> x = head;
		while((!x.isNIL()) && (!x.getData().equals(element))){
			x = x.next;
		}
		return x.getData();
	}

	@Override
	public void insert(T element) {
		SingleLinkedListNode<T> auxHead = head;
		SingleLinkedListNode<T> newHead;
		if (head.isNIL()) {
			newHead = new SingleLinkedListNode<>(element, head);
			newHead.next = head;
			head = newHead;
		} else {
			while (!auxHead.next.isNIL()) 
				auxHead = auxHead.next;

			SingleLinkedListNode<T> newNode = new SingleLinkedListNode<>(
					element, new SingleLinkedListNode<T>());
			newNode.next = auxHead.next;
			auxHead.next = newNode;
		}
	}

	@Override
	public void remove(T element) {
		SingleLinkedListNode<T> aux;
		
		if(head.data == element)
			head = head.next;
		else {
			SingleLinkedListNode<T> previous = null;
			aux = head;
			while(!aux.isNIL() && aux.data != element){
				 previous = aux;
				 aux = aux.next;
			}
			if(!aux.isNIL())
				previous.next = aux.next;
		}
		
	}
	@Override
	public T[] toArray(){
		T[] r;
		r = (T[]) new Object[size()];
		SingleLinkedListNode<T> aux = head;
		int count = 0;
		while (!aux.isNIL()) {
			r[count] = aux.getData();
			aux = aux.next;
			count++;
		}
		return r;
	}

}
