package suanfa.test;


import suanfa.Util;

public class practiceTest1 {
	
    
	public static void main(String[] args) {
//		int a[] = {5,2,4,6,1,3,8,7};
		int a[] = {6,1,2,7,9,3,4,5,10,8,2,4};
		quicklySort(a,0,a.length-1);
//		int[] b = Arrays.copyOf(a, 4);
//		Util.print(b);
		Util.print(a);
		int z = binarySearch(a, 6);
		System.out.println();
		System.out.println(z);
		
	}
	
	public static void quicklySort(int a[],int left, int right){
		//TODO 参数判断
		if(left >= right){
			return;
		}
		int r = a[left];
		int i = left; 
		int j = right;
		while(i != j){
			
			while(j>i&&a[j] >= r){
				j--;   //会停在比r小的数停下来
			}
			
			while(j>i&&a[i] <= r){
				i++;//会停在比r大的数停下来
			}
			 
			if(i < j){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		a[left] = a[i];
		a[i] = r;
		
		quicklySort(a,left, i-1);
		quicklySort(a,i+1, right);
	}
	
	public static int binarySearch(int a[], int k){
		//TODO 
		int start = 0;
		int end = a.length-1;
		int mid =0;
		int overk = -1;
		while(start < end){
			mid = (end-start)/2 + start;
			if(k >= a[mid]){
				start = mid+1;
				overk = start; //这个值可能比k大
			}else if(k < a[mid]){
				end = mid-1;
				overk = mid;
			}
		}
		return overk;
	}
	 
	 
}
