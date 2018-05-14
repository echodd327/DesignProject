package effectiveJava.e7;

import java.util.Arrays;
import java.util.List;


public class Test {
	
	public static void main(String[] args) {
		List<String> homphones = Arrays.asList("to","too","two");
		String[] myarray = {"to","too","two"};
		System.out.println(myarray); //[Ljava.lang.String;@689d6d87
		System.out.println(homphones); //[to, too, two]
		System.out.println(Arrays.toString(myarray)); //[to, too, two]
	}
}
