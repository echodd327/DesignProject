package suanfa.heap;

import suanfa.Util;


public class HeapTest {
	
	public static void main(String[] args) {
//		int a[] = {4,1,3,2,16,9,10,14,8,7};
		int a[] ={54,35,48,36,27,12,44,44,8,14,26,17,28};
		MaxHeap p = new MaxHeap(a);
		
//		MaxHeap p = new MaxHeap();
//		p.heapSort(a);
		p.toString();
	}
}
class MaxHeap{
	
	public int heapSize;
	public int[] a;
	
	public MaxHeap(){
		
	}
	public MaxHeap(int a[]){
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
		System.out.print(i+",");
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
	public void heapSort(int a[]){
		this.buildMaxHeap(a);
		
		for(int i= a.length-1; i>0; i--){
			int temp = a[i];
			a[i] = a[0];
			a[0] = temp;
			heapSize --;
//			System.out.println("step: "+ (step++) + Arrays.toString(a));
			maxHeapify(0);
		}
	}
	@Override
	public String toString() {
		Util.print(this.a);
		return super.toString();
	}
}
