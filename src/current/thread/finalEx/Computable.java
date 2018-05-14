package current.thread.finalEx;

public interface Computable<A, V> {
	
	V compute(A arg) throws InterruptedException;
}
