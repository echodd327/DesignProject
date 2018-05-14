package effectiveJava.e7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = -3; i < list.size(); i++){
			set.add(i);
			list.add(i);
		}
		// -2  0  2 
		for(int i = 0; i < 3; i++){
			set.remove(i);  //remove(object)
			list.remove(i);  //remove(object),remove(i)
		}
		
		System.out.println("set:"+set); //-3 -2 -1 
		System.out.println("list:"+list); //-2  0  2 
	}
}
