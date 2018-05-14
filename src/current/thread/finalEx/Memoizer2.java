package current.thread.finalEx;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memoizer2<A, V> implements Computable<A, V> {
	
	private final Map<A,V> cache = new ConcurrentHashMap<A,V>();
	private final Computable<A, V> c;
	
	public Memoizer2(Memoizer2<A, V> c){
		this.c = c;
	}
	/**
	 * 可能导致多个线程计算多次f(27)
	 */
	@Override
	public V compute(A arg) throws InterruptedException {
		V result = cache.get(arg);
		if(result == null){
			result = c.compute(arg);
			cache.put(arg, result);
		}
		return result;
	}

}
