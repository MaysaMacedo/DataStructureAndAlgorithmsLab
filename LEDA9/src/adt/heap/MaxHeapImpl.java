package adt.heap;

import java.util.Arrays;

public class MaxHeapImpl<T extends Comparable<T>> implements MaxHeap<T> {
	
	private static final int INITIAL_SIZE = 20;
	private static final int INCREASING_FACTOR = 10;
	private T[] heap;
	private int size;
	public MaxHeapImpl() {
		heap = (T[]) new Comparable[INITIAL_SIZE];
		size = 0;
	}
	private int parent(int i){
		return ((i+1)/2)-1;
	}
	
	private int left(int i){
		return (2*(i+1))-1;
	}

	private int right(int i){
		return ((2*(i+1))+1)-1;
	}

	
	@Override
	public void buildHeap(T[] array){
		heap = (T[]) new Comparable[INITIAL_SIZE];
		size = array.length;
		for(int i = 0; i < size ; i ++){
			heap[i] = array[i];
		}
		for(int k = size/2; k >= 0 ;k--) {
			heapify(k);
		}
	}
	
	
	private void heapify(int position){
		if(!isEmpty()){	
			int r = right(position);
			int l = left(position);
			int largest = position;
			if(l < size && heap[l] != null && heap[position] != null && heap[l].compareTo(heap[position]) > 0) {
				largest = l;
			}
			else {
				largest = position;
			}
			if(r < size && heap[r].compareTo(heap[largest]) > 0 && heap[largest] != null && heap[r] != null) {
				largest = r;
			}
			if(largest != position && heap[position] != null && heap[largest] != null) {
				Util.swap(heap, position, largest);
				heapify(largest);
			}
		}
	}
	
	@Override
	public boolean isEmpty(){
		if(heap[0] == null)
			return true;
		return false;
	}
	
	@Override
	public void insert(T element) {
		if(size == heap.length ){
			 heap = Arrays.copyOf(heap, heap.length + INCREASING_FACTOR);
		}
		int i = size;
		while(i > 0 && heap[parent(i)].compareTo(element) < 0) {
			heap[i] = heap[parent(i)];
			i = parent(i);
		}
		size ++;
		heap[i] = element;
	}

	@Override
	public T extractRootElement(){
		T root = null;
		if(!isEmpty()){
			root = heap[0];
			heap[0] = heap[size-1];
			heap[size-1] = null;
			heapify(0);
			size = size -1;
		}
		return root;
	}

	@Override
	public T rootElement() {
		T element = null;  
		if (!isEmpty()) {
			element = heap[0];
		}
       return element;
	}

	@Override
	public T[] heapsort(T[] array) {
		T[] newArray = heap;
		buildHeap(array);
		int tamanho = size;
		for(int i = size-1;i > 0 ; i--){
			Util.swap(heap, 0, i);
			size--;
			heapify(0);
		}
		size = tamanho;
		T[] result = toArray();
		heap = newArray;
		return result;
	}
	
	@Override
	public T[] toArray() {
		T[] result = (T[]) new Comparable[size];
		for (int i = 0 ; i < size ; i++) {
			result[i] = heap[i];
		}
		return result;
	}

}
