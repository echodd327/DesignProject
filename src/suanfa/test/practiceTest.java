package suanfa.test;

import suanfa.Util;

public class practiceTest {
	
    
	public static void main(String[] args) {
//		int a[] = {5,2,4,6,1,3,8,7};
		int a[] = {2,8,7,1,3,5,6,4};
//		insertSort(a);
//		BobbleSort(a);
//		quicksort2(a, 0, a.length-1);
		
		MergeSort(a);
		Util.print(a);
	}
	
	
	
	public static void MergeSort(int a[]){
		
		int length = a.length;  //left[min-max] right[min-max]
		int left_min,left_max,right_min,right_max;
		int next = 0;
		int temp[] = new int[length];
		for(int i = 1; i < length; i=i*2){  //1 2 4 8
			
			for(left_min=0; left_min < length-i; left_min=right_max){
				right_min=left_max = left_min+i;
				right_max= left_max+i;
				System.out.println(left_min+","+left_max+","+right_min+","+right_max);
				
				next = 0;
				while(left_min < left_max && right_min < right_max){
					temp[next++] = a[left_min] > a[right_min] ? a[right_min++]:a[left_min++];
				}
				
				while(left_min < left_max){
					a[--right_min] = a[--left_max];
				}
				while(next>0){
					a[--right_min] = temp[--next];
				}
			}
			
		}
	}
	
	public static void quicksort(int a[],int left,int right)
    {
	   if(left > right){
		   return;
	   }
	   int temp = a[left];
	   int i = left;
	   int j = right;
	   int t =  0;
	   
	   while(i != j){
		   while(temp <= a[j] && i<j){
			   j--;
		   }
		   while(temp >= a[i] && i<j){
			   i++;
		   }

		   if(i < j){
			   t = a[i];
			   a[i] = a[j];
			   a[j] = t;
		   }
	   }
	   a[left] = a[i];
	   a[i] = temp;
	   
	   quicksort(a,left,i-1);
	   quicksort(a,i+1, right);
    }
	
	public static void quicksort2(int a[],int left,int right)
    {
		if( left > right){
			return;
		}
		int temp = a[right];
		int i = left -1;
		for(int j = left; j <= right-1; j++){
			
			if(a[j] <= temp){
				i=i+1;
				int z = a[i];
				a[i] = a[j];
				a[j] = z;
			}
		}
		a[right] = a[i+1];
		a[i+1]  = temp;

		quicksort2(a, left, i);
		quicksort2(a, i+2, right);
    }
	
	/**
	 * 冒泡排序
	 */
	public static void BobbleSort(int a[]){
		if(a==null && a.length == 0){
			return;
		}
		int len = a.length;
		for(int i = len-1; i>=0; i--){
			for(int j = 0; j < i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
	}
	
	
	/**
	 * 插入排序
	 */
	public static void insertSort(int a[]){
		if(a==null && a.length == 0){
			return;
		}
		int k = 0; 
		int i = 0;
		for(int j = 1; j < a.length; j++){
			 k = a[j];
			 i = j -1;
			 while(i>=0 && k < a[i]){
				 a[i+1] = a[i];
				 i--;
			 }
			 a[i+1]=k;
		}
	}
	 
}
