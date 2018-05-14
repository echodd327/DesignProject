package effectiveJava.e6.anonotation2;

public class Sample2 {
	
	
	@ExceptionTest(values = ArithmeticException.class)
	public static void m1(){
		int i = 0;
		i = i /i;   //success
	}
	@ExceptionTest(values=ArithmeticException.class)
	public static void m2(){
		int[] a = new int[0];
		int i = a[1];  //fail wrong exception
	}
	@ExceptionTest(values=ArithmeticException.class)
	public static void m3(){
		 //fail no exception
	}
}
