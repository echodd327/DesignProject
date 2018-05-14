package suanfa;

//插入排序
public class InsertSortTest {
	
	public static void main(String[] args) {
		int a[] = {5,2,4,6,1,3};
		insertSort(a);
		Util.print(a);
		
	}
	public static void insertSort(int[] a){
		int key = 0;
		int i = 0;
		for(int j = 1; j < a.length; j++){
			key = a[j];
			i = j-1;
			while(i>=0 && a[i] > key){
				a[i+1] = a[i];
				i = i-1;
			}
			a[i+1] = key;
		}
	}
	
}
