package effectiveJava.e6.anonotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTest {
	
	public static void main(String[] args) throws Exception {
		int tests = 0;
		int passed = 0;
		Class testClass = Class.forName(args[0]);
		for(Method m: testClass.getDeclaredMethods()){
			if(m.isAnnotationPresent(ExceptionTest.class)){
				tests++;
				try{
					m.invoke(null);
					System.out.printf("test %s fail,no exception\n",m);
				}catch(InvocationTargetException warppedExec){
					Throwable exec = warppedExec.getCause();
					Class<? extends Exception> execType = m.getAnnotation(ExceptionTest.class).values();
					if(execType.isInstance(exec)){
						passed++;
					}else{
						System.out.printf("Test %s failed,expected %s,got %s%n",m,execType.getName(),exec);
					}
				}catch(Exception e){
					System.out.println("invalid @Test");
				}
			}
		}
		System.out.printf("passed %d, Failed %d",passed, tests-passed);
	}
}
