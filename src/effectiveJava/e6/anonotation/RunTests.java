package effectiveJava.e6.anonotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import effectiveJava.e6.anonotation2.ExceptionTest;

public class RunTests {
	
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class testClass = Class.forName(args[0]);
		for(Method m: testClass.getDeclaredMethods()){
			if(m.isAnnotationPresent(ExceptionTest.class)){
				tests++;
				try{
					m.invoke(null);
					passed++;
				}catch(InvocationTargetException warppedExec){
					Throwable exec = warppedExec.getCause();
					System.out.println(m+ "failed:" + exec);
				}catch(Exception e){
					System.out.println("invalid @Test");
				}
			}
		}
		System.out.printf("passed %d, Failed %d",passed, tests-passed);
	}
}
