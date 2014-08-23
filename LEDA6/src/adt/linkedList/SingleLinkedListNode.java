package adt.linkedList;

public class SingleLinkedListNode<T> {
	protected T data;
	public T getData() {
		return data;
	}
	public SingleLinkedListNode<T> getNext() {
		return next;
	}
	protected SingleLinkedListNode<T> next;
	
	/**
	 * Constructor of an empty (NIL) node
	 */
	public SingleLinkedListNode() {
	}
	public SingleLinkedListNode(T data, SingleLinkedListNode<T> next) {
		this.data = data;
		this.next = next;
	}
	public boolean isNIL(){
		return (this.data == null);
	}
	@Override
	public String toString(){
		String resp = null;
		if(!isNIL()){
			resp = this.data.toString();
		}else{
			resp = "NIL";
		}
		return resp;
	}
	@Override
	public boolean equals(Object obj){
		boolean resp = false;
		if(obj instanceof SingleLinkedListNode){
			return this.data.equals(((SingleLinkedListNode) obj).data);
		}
		return resp;
	}
}
