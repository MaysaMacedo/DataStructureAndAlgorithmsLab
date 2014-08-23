package adt.stack;

import adt.linkedList.DoubleLinkedList;
import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.DoubleLinkedListNode;
import adt.linkedList.SingleLinkedListNode;

public class StackDoubleLinkedListImpl<T> implements Stack<T> {
	
	protected DoubleLinkedList<T> list;
	private int tamanho;

	public StackDoubleLinkedListImpl(int tamanho){
		this.tamanho = tamanho;
		list = new DoubleLinkedListImpl<T>();
	}
	
	@Override
	public void push(T element) throws StackOverflowException {
		if(isFull())
			throw new StackOverflowException();
		if(element != null)
			list.insertFirst(element);
	}

	@Override
	public T pop() throws StackUnderflowException {
		T auxiliar;
		if(isEmpty())
			throw new StackUnderflowException();
		auxiliar = list.toArray()[0]; 
		list.removeFirst();
		return auxiliar;
	}

	@Override
	public T top() {
		if(!isEmpty())
			return list.toArray()[0];
		return null;
		
		
	}

	@Override
	public boolean isEmpty() {
		if(list.size() == 0)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		boolean isfull = false;
		if(list.size() == tamanho)
			isfull = true;
		return isfull;
	}

}
