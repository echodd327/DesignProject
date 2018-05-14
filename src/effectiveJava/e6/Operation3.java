package effectiveJava.e6;

public enum Operation3 {
	PLUS("+"){
		double apply(double x, double y) {
			return x+y;
		}
	},
	MINUTE("-"){
		@Override
		double apply(double x, double y) {
			return x-y;
		}
	},
	TIMES("*"){
		@Override
		double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/"){
		@Override
		double apply(double x, double y) {
			return x/y;
		}
	};
	
	private final String symbol;
	Operation3(String symbol){
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return symbol;
	}
	
	abstract double apply(double x,double y);
}
