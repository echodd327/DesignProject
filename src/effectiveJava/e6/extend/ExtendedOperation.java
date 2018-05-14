package effectiveJava.e6.extend;

import java.util.Arrays;
import java.util.Collection;

public enum ExtendedOperation implements IOperation {
	
	EXP("^"){
		@Override
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	REMAINDER("%"){
		@Override
		public double apply(double x, double y) {
			return x % y;
		}
	};
	
	private final String symbol;
	ExtendedOperation(String symbol){
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return symbol;
	}
	
	private static <T extends Enum<T> & IOperation> void test(Class<T> opSet,double x,double y){
		for(IOperation op: opSet.getEnumConstants()){
			System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x, y));
		}
	}
	private static void test2(Collection<? extends IOperation> opSet, double x,double y){
		for(IOperation op:opSet){
			System.out.printf("%f %s %f = %f%n",x,op,y,op.apply(x, y));
		}
	}
	public static void main(String[] args) {
		double a = 3;
		double b = 2;
//		test(BaseOperation.class,a,b);
		test2(Arrays.asList(BaseOperation.values()),a,b);
	}
}
