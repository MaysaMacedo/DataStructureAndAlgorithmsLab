package adt.linkedList;

public class RecursiveDoubleLinkedListImpl<T> extends
		RecursiveSingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected RecursiveDoubleLinkedListImpl<T> previous;

	@Override
	public void insertFirst(T element) {
		if (!isEmpty()) {
			
			RecursiveDoubleLinkedListImpl<T> node = new RecursiveDoubleLinkedListImpl<T>();
			node.data = this.data;
			this.data = element;
			((RecursiveDoubleLinkedListImpl<T>) this.next).previous = node;
			node.previous = this;
			node.next = this.next;
			this.next = node;

		} else {
			previous = new RecursiveDoubleLinkedListImpl<T>();
			previous.next = this;
			this.next = new RecursiveDoubleLinkedListImpl<T>();
			((RecursiveDoubleLinkedListImpl<T>) next).previous = this;
			data = element;
		}
	}

	@Override
	public void removeFirst() {
		if (!isEmpty()) {
			if (this.next.isEmpty()) {
				this.data = this.next.data;
			} else {
				this.data = this.next.data;
				this.next = this.next.next;
				((RecursiveDoubleLinkedListImpl<T>) this.next).previous = this;
			}
		}
	}

	@Override
	public void removeLast() {
		if (!isEmpty()) {
			if (next.isEmpty()) 
				this.data = next.data;
			 else 
				((RecursiveDoubleLinkedListImpl<T>) next).removeLast();
		}
	}

}