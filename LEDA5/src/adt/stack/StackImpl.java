package adt.stack;


public class StackImpl<T> implements Stack<T> {

	private T[] array;
	private int top;
	
	@SuppressWarnings("unchecked")
	public StackImpl(int size) {
		array = (T[])new Object[size];
		top = -1;
	}
	
	@Override
	public T top() {
		if(top != -1)
			return array[top];
		return null;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == array.length-1;
	}

	@Override
	public void push(T element) throws StackOverflowException {
		if(isFull())
			throw new StackOverflowException();
		if(element != null)
			array[++top] = element ;	
		
	}

	@Override
	public T pop() throws StackUnderflowException {
		if(isEmpty())
			throw new StackUnderflowException();
		
		T elem = array[top];
		top --;
		return elem;
	}


}
