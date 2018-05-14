package effectiveJava.e8;

import java.util.Comparator;

public class Zdzxcx {
	
	public static void main(String[] args) {
		Comparator<Integer> natualOrder = new Comparator<Integer>() {

			@Override
			public int compare(Integer first, Integer second) {
				int f = first;
				int s = second;
				return f < s ? -1: (f==s ? 0:1);
			}
		};
		System.out.println(natualOrder.compare(new Integer(42), new Integer(42))); //则返回0
		Integer a = new Integer(42);
		Integer b = new Integer(42);
		System.out.println(a==b); //false
	}
	
}
