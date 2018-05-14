package effectiveJava.e6;

import java.util.HashMap;
import java.util.Map;

public class EnumSet {
	private static final Map<String,Operation3> string2Enum = new HashMap<String,Operation3>();
	static{
		for(Operation3 op: Operation3.values()){
			string2Enum.put(op.toString(),op);
		}
	}
	public static Operation3 fromString(String symbol){
		return string2Enum.get(symbol);
	}
	
	public enum Ensemble{
		SOLO,DUE,TRIO,QUARTET,QUINTET,
		SEXTET,SEPTET,OCTET,NONET,DECTET;
		
		public int numberOfMusicians(){
			return ordinal() +1;
		}
	}
	
	public static void main(String[] args) {
//		double sum = Operation.PLUS.apply(10, 20);
//		System.out.println(sum);
//		
//		double a = 3;
//		double b = 2;
//		for(Operation3 op3: Operation3.values()){
//			System.out.printf("%f %s %f=%f%n",a,op3,b,op3.apply(a, b));
//		}
		System.out.println(Ensemble.SOLO.numberOfMusicians());
		System.out.println(Ensemble.DUE.numberOfMusicians());
		System.out.println(Ensemble.DECTET.numberOfMusicians());
	}
	
}
