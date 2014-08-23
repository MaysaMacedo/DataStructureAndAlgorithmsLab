package adt.linkedList;

public class RecursiveSingleLinkedListImpl<T> implements LinkedList<T> {

	protected T data;
	protected RecursiveSingleLinkedListImpl<T> next;
	
	@Override
	public boolean isEmpty() {
		boolean empty = false;
		if(data == null)
			empty = true;
		return empty;
	}

	@Override
	public int size() {
		if(isEmpty())
			return 0;
		return 1 + next.size();
	}

	@Override
	public T search(T element) {
		if(isEmpty())
			return null;
		else{
			if(data == element)
				return data;
			else
				return next.search(element);
		}
	}

	@Override
	public void insert(T element) {
		if(isEmpty()){
			data = element;
			next = new RecursiveSingleLinkedListImpl<T>();
		} else {
			next.insert(element);
		}
			
	}

	@Override
	public void remove(T element) {
		if(!isEmpty()) {
			if(data == element) {
				data = next.data;
				next = next.next;
			} else {
				next.remove(element);
			}
			
		}
	}
	@Override
	public T[] toArray(){
		int n = 1;
		T[] r;
		r = (T[]) new Object[size()];
		if(!isEmpty()) {
			r[0] = data;
		}
		array(r, next, n);
		return r;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public RecursiveSingleLinkedListImpl<T> getNext() {
		return next;
	}

	public void setNext(RecursiveSingleLinkedListImpl<T> next) {
		this.next = next;
	}
	
	private void array(T[] r , RecursiveSingleLinkedListImpl<T> node , int n) {
		if(n < size()) {
			r[n] = node.data;
			n++;
			array(r, node.next, n);
		}
			
	}

}
