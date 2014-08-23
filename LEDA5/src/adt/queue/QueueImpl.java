package adt.queue;

public class QueueImpl<T> implements Queue<T> {

	private T[] array;
	private int tail;
		
	
	@SuppressWarnings("unchecked")
	public QueueImpl(int size) {
		array = (T[])new Object[size];
		tail = -1;
	}

	@Override
	public T head() {
		if(!isEmpty())
			return array[0];
		return null;
	}

	@Override
	public boolean isEmpty() {
		return tail == -1;
	}

	@Override
	public boolean isFull() {
		return tail == array.length -1;
	}
	
	private void shiftLeft(){
		for(int i = 0; i < tail; i++){
			array[i] = array[i+1];
			
		}
	}

	@Override
	public void enqueue(T element) throws QueueOverflowException {
		if(isFull())
			throw new QueueOverflowException();
		if(element != null)
			array[++tail] = element;
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		T result;
		if(isEmpty())
			throw new QueueUnderflowException();
		result = array[0];
		shiftLeft();
		tail--;
		return result;
	}


}
