package effectiveJava.e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static <T extends Comparable<T>> T max(List<T> list){
		Iterator<T> i = list.iterator();
		T result = i.next();
		while(i.hasNext()){
			T now = i.next();
			if(now.compareTo(result)>0){
				result = now;
			}
		}
		return result;
	}
	
	public static <T extends Comparable<? super T>> T max2(List<? extends T> list){
		Iterator<? extends T> i = list.iterator();
		T result = i.next();
		while(i.hasNext()){
			T now = i.next();
			if(now.compareTo(result)>0){
				result = now;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
//		List<String> list = new LinkedList<String>();
//		list.add("aa"); //97
//		list.add("bb");  // 98
//		list.add("AA"); //65
//		String max = max(list);
//		System.out.println(max); //bb
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(3);
		
		Number max = max2(list);
		System.out.println(max);
		
		
	}
	
	
}
