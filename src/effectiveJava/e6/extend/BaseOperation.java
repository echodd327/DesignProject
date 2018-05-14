package effectiveJava.e6.extend;

public enum BaseOperation implements IOperation{
	PLUS("+"){
		public double apply(double x, double y) {
			return x+y;
		}
	},
	MINUTE("-"){
		@Override
		public double apply(double x, double y) {
			return x-y;
		}
	},
	TIMES("*"){
		@Override
		public double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/"){
		@Override
		public double apply(double x, double y) {
			return x/y;
		}
	};
	
	private final String symbol;
	BaseOperation(String symbol){
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return symbol;
	}
	
	
}
