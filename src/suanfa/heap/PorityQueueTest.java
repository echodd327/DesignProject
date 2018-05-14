package suanfa.heap;


public class PorityQueueTest {
	
	public static void main(String[] args) {
		int a[] = {4,1,3,2,16,9,10,14,8,7};
		PorityQueue q = new PorityQueue(a);
//		System.out.println(q.heapMaximum());
//		System.out.println(q.heapExpectMax());
		q.heapIncrementKey(8, 15);
		q.toString();
	}
}

class PorityQueue extends Heap{

	public PorityQueue(int[] a) {
		super(a);
	}
	 
	public int heapMaximum(){
		return a[0];
	}
	public int heapExpectMax(){
		if(this.heapSize <1){
			System.err.println("heap underflow");
		}
		int max = a[0];
		a[0] = a[this.heapSize-1];
		this.heapSize --;
		maxHeapify(0);
		return max;
	}
	public void heapIncrementKey(int i,int key){
		if(key < a[i]){
			System.err.println("new key is smaller than current key");
		}
		a[i] = key;
		while(i>0 && a[parent(i)] < a[i]){
			int temp = a[parent(i)];
			a[parent(i)] = a[i];
			a[i] = temp;
			i = parent(i);
		}
	}
	
	public void maxHeapInsert(int key){
		this.heapSize++;
		heapIncrementKey(this.heapSize, key);
	}
	
}
