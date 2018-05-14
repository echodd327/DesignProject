package suanfa;



//获取最大子数组，用于股票
public class FindMaxSubArrTest {
	
	
	public static void main(String[] args) {
//		int a[] ={13,-3 ,-25, 20, -3, -16, -23, 18, 20, -7 ,12 , -5,  -22,  15,  -4,  7};
		int a[] ={13,-3 ,25, 20, -3, -16, -23, -18, 20, -7 ,12 , -5,  -22,  15,  -4,  7};
		
		int[] result = findMaxSubArr(a, 0, a.length-1);
		Util.print(result);
	}
	
	public static int[] findMaxSubArr(int[] a, int low, int high){
		if(low==high){
			return new int[]{low,high,a[low]};
		}else{
			 int mid = (high+low)/2;
			 int left[] = findMaxSubArr(a,low,mid);
			 int right[] =findMaxSubArr(a, mid+1, high);
			 int result[] = findMaxCrossingSubArr(a,low,mid,high);
			 
			 if(left[2] >= right[2] && left[2]>=result[2]){
				 Util.print2(left);
				 return left;
			 }else if(right[2] >= left[2] && right[2]>=result[2]){
				 Util.print2(right);
				 return right;
			 }else{
				 Util.print2(result);
				 return result;
			 }
		}
	}
	
	public static int[] findMaxCrossingSubArr(int[] a,int low,int mid,int high){
		int left_sum=Util.MINSIZE; //最小值
		int max_left = -1;
		int sum = 0;
		for(int i = mid; i>=low; i--){
			sum = sum+ a[i];
			if(sum>left_sum){
				left_sum = sum;
				max_left = i;
			}
		}
		int right_sum = Util.MINSIZE; //最小值
		int max_right = -1;
		sum = 0;
		for(int j = (mid+1); j<=high; j++){
			sum = sum+ a[j];
			if(sum>right_sum){
				right_sum = sum;
				max_right = j;
			}
		}
//		System.out.println(max_left+","+max_right+","+(left_sum+right_sum));
		return new int[]{max_left,max_right,(left_sum+right_sum)};
	}
}
