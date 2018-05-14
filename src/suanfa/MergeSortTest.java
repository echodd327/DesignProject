package suanfa;

//归并排序
public class MergeSortTest {
	
	public static void main(String[] args) {
		int a[] = {5,2,4,7,1,3,2,6};
		mergeSort(a,0,7);
		Util.print(a);
	}
	
	public static void mergeSort(int a[],int p,int r){
		System.out.println(p+","+r);
		if(p < r){
			int q = (p+r)/2;
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
	}
	
	public static void merge(int a[],int p,int q,int r){
		System.out.println("----------"+p+","+q+","+r);
		int n1 = q-p+1;
		int n2 = r-q;
		int L[] = new int[n1+1];
		int R[] = new int[n2+1];
		for(int i = 0; i < n1; i++){
			L[i] = a[p+i];
		}
		for(int j = 0; j< n2; j++){
			R[j] = a[q+j+1];
		}
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		int i=0,j=0;
		for(int k =p; k<=r;k++){
			if(L[i] <= R[j]){
				a[k]=L[i];
				i++;
			}else{
				a[k]=R[j];
				j++;
			}
		}
	}
	
	public static void mergeSortOpt(int a[],int p,int q,int r){
		int n1 = q-p+1;
		int n2 = r-q;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int i = 0; i < n1; i++){
			L[i] = a[p+i];
		}
		for(int j = 0; j< n2; j++){
			R[j] = a[q+1+j];
		}
		int i=0,j =0;
		for(int k = p; k<=r; k++){
			if(i==n1){
				a[k] = R[j++];
				continue;
			}
			if(j == n2){
			    a[k] = L[i++];	
			    continue;
			}
			if(L[i] <= R[j]){
				a[k] = L[i++];
			}else{
				a[k]=R[j++];
			}
		}
	}
}
