package suanfa;

//快速排序
public class QuicklySortTest {
	
	public static void main(String[] args) {
		QuicklySortTest t = new QuicklySortTest();
		int a[] = {2,8,7,1,3,5,6,4};
		t.quickSort(a, 0, a.length-1);
		Util.print(a);
	}
	
	
	public int parition(int a[], int p, int r){
		int x = a[r];
		int i = p-1;
		for(int j = p; j<= r-1; j++){
			if(a[j] <= x){
				i=i+1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int z = a[i+1];
		a[i+1] = a[r];
		a[r] = z;
		return i+1;
	}
	
	public void quickSort(int a[], int p, int r){
		System.out.println(p+","+r); 
		Util.print2(a);
		if(p < r){
		    int	q = parition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
}

