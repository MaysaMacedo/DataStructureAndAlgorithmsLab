package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements
		DoubleLinkedList<T> {

	DoubleLinkedListNode<T> last;
	
	public DoubleLinkedListImpl() {
		last = new DoubleLinkedListNode<T>();
		head = new DoubleLinkedListNode<T>();
	}

	@Override
	public void insertFirst(T element) {
		
		DoubleLinkedListNode<T> newHead = new DoubleLinkedListNode<T>(element,new DoubleLinkedListNode<T>(),new DoubleLinkedListNode<T>());
		newHead.next = head;
		((DoubleLinkedListNode<T>)head).previous = newHead;
		if(head.isNIL())
			last = newHead;
		head = newHead;
	
	}

	@Override
	public void removeFirst() {
		if(!isEmpty()){
		if(!head.isNIL()){
			head = head.next;
			if(head.isNIL()){
				last = (DoubleLinkedListNode<T>) head;
			}
			((DoubleLinkedListNode<T>)head).previous = new DoubleLinkedListNode<>();
		}}
			
	}

	@Override
	public void removeLast() {
		if(!last.isNIL()){
			last = last.previous;
			if(last.isNIL()){
				head = last;
			}
			last.next = new DoubleLinkedListNode<>();
		}
			
	}

}
