package adt.stack;

import adt.linkedList.DoubleLinkedList;
import adt.linkedList.RecursiveDoubleLinkedListImpl;

public class StackRecursiveDoubleLinkedListImpl<T> implements Stack<T> {

	protected DoubleLinkedList<T> list;
	protected int size;
	
	public StackRecursiveDoubleLinkedListImpl(int size) {
		this.size = size;
		list = new RecursiveDoubleLinkedListImpl<T>();
	}
	
	@Override
	public void push(T element) throws StackOverflowException {
		if(isFull())
			throw new StackOverflowException();
		if(element != null)
			list.insert(element);
	}

	@Override
	public T pop() throws StackUnderflowException {
		T auxiliar;
		if(isEmpty())
			throw new StackUnderflowException();
		auxiliar = list.toArray()[list.size()-1]; 
		list.removeLast();
		return auxiliar;
		}

	@Override
	public T top() {
		T[] array = list.toArray();
		if(list.isEmpty())
			return null;
		return array[array.length - 1];
	}

	@Override
	public boolean isEmpty() {
		boolean empty = false;
		if(list.isEmpty())
			empty = true;
		return empty;
	}

	@Override
	public boolean isFull() {
		boolean full = false;
		if(list.size() == size)
			full = true;
		return full;
	}

}
