package effectiveJava.e6;

public enum Operation {
	
	PLUS,MINUTE,TIMES,DIVIDE;
	
	 double apply(double x,double y){
		switch(this){
		case PLUS: return x+y;
		case MINUTE: return x-y;
		case TIMES: return x*y;
		case DIVIDE: return x/y;
		}
		throw new AssertionError("unkonw op:"+ this);
	}
	
}
