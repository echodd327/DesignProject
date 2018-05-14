package effectiveJava.e6;

public enum Operation1 {
	
	PLUS{
		double apply(double x, double y) {
			return x+y;
		}
	},
	MINUTE{
		@Override
		double apply(double x, double y) {
			return x-y;
		}
	},
	TIMES{
		@Override
		double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE{
		@Override
		double apply(double x, double y) {
			return x/y;
		}
	};
	abstract double apply(double x,double y);
}
