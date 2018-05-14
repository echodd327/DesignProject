package effectiveJava.e5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
	
	public static <E> Set<E> union(Set<? extends E> e1,Set<? extends E> e2){
		Set<E> result = new HashSet<E>(e1);
		result.addAll(e2);
		return result;
	}
	
	private static <E> void swap(List<E> list,int i, int j){
	    list.set(i, list.set(j, list.get(i)));
	}
	
	public static void main(String[] args) {
//		Stack<Integer> numberStack = new Stack<Integer>();
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		numberStack.pushAll(list);
//		System.out.println(numberStack.size());
		
//		Collection<Number> dist = new ArrayList<Number>();
//		numberStack.popAll(dist);
//		for(Number n:dist){
//			System.out.println(n);
//		}
		
		//
//		Set<Integer> set1 =  new HashSet<Integer>();
//		set1.add(1);
//		Set<Double> set2 = new HashSet<Double>();
//		set2.add(2.3d);
//		Set<Number> result = Test2.<Number>union(set1,set2);
//		for(Number n:result){
//			System.out.println(n);
//		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		swap(list, 0, 1);
		for(Integer n:list){
			System.out.println(n);
		}
		
	}
}
