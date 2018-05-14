package suanfa;

public class BubbleSortTest {
	
	public static void main(String[] args) {
		int a[] = {12,35,99,18,76};
		bubbleSort(a);
		Util.print(a);
	}
	
	public static void bubbleSort(int a[]){
		int n = a.length-1; //5
		for(int i =0; i < n; i++){
			
			for(int j = 0; j < n-i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
	}
}
