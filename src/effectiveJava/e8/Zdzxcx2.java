package effectiveJava.e8;

public class Zdzxcx2 {
	static Integer i;
	public static void main(String[] args) {
//		if(i == 42){   //java.lang.NullPointerException
//			System.out.println("unbievable");
//		}
		
		main2();
	}
	
	public static void main2(){
		long s = System.currentTimeMillis();
		Long sum = 0L;
//		long sum = 0L;
		for(long i = 0;i< Integer.MAX_VALUE;i++){
			sum+=i;
		}
		System.out.println(sum);
		long e = System.currentTimeMillis();
		System.out.println(e-s);  //13154  只需 1172
	}
	
	

}
