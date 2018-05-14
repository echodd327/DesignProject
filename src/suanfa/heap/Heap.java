package suanfa.heap;

import suanfa.Util;

public abstract class Heap {
	protected int heapSize;
	protected int[] a;
	
	public Heap(int  a[]){
		this.buildMaxHeap(a);
	}
	
	public void buildMaxHeap(int[] a){
		this.heapSize = a.length;
		this.a = a;
		for(int i = parent(this.heapSize - 1); i>=0; i--){
			this.maxHeapify(i);
		}
	}
	
	protected int parent(int i){
		return (i-1)/2;
	}
	protected int left(int i){
		return 2*i + 1;
	}
	protected int right(int i){
		return 2*i + 2;
	}
	public void maxHeapify(int i){
		int l = left(i);
		int r = right(i);
		int largest = i;
		if(l<=heapSize-1 && a[l]>a[i]){
			largest = l;
		}
		if(r<=heapSize-1 && a[r]>a[largest]){
			largest = r;
		}
		if(largest != i){
			int temp = a[i]; 
			a[i] = a[largest];
			a[largest]=temp;
//			Util.print2(a);
			this.maxHeapify(largest);
		}
	}
	
	@Override
	public String toString() {
		Util.print(this.a);
		return super.toString();
	}
}
