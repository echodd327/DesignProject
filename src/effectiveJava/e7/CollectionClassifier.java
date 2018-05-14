package effectiveJava.e7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionClassifier {
	
	//重载方法名一样，方法类型和个数可以不一样
	public static String classify(Set<?> s){
		return "set";
	}
	public static String classify(List<?> s){
		return "list";
	}
	public static String classify(Collection<?> s){
		return "collection";
	}
	public static void main(String[] args) {
		Collection<?> collections[] = {
				new HashSet<String>(),
				new ArrayList<String>(),
				new HashMap<String,String>().values()
		};
		for(Collection<?> cl: collections){
			System.out.println(classify(cl));
		}
		//打印collection三次，并不会打印set list collection,调用哪个重载是编译器作出决定的。
	}
}
