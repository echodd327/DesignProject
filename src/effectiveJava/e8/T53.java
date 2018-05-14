package effectiveJava.e8;

import java.util.Arrays;
import java.util.Set;


public class T53 {
	
	public static void main(String[] args) {
		Class<?> t1 = null;
		try {
			t1 = Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Set<String> s1 = null;
		try {
			s1 = (Set<String>) t1.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		s1.addAll(Arrays.asList(args).subList(1, args.length));
		System.out.println(s1);
	}
}
