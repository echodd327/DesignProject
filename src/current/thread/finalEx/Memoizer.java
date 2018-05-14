package current.thread.finalEx;

import java.util.HashMap;
import java.util.Map;

public class Memoizer<A, V> implements Computable<A, V> {
	
	private final Map<A,V> cache = new HashMap<A,V>();
	private final Computable<A, V> c;
	
	public Memoizer(Memoizer<A, V> c){
		this.c = c;
	}
	/**
	 * 每次只有一个线程执行compute。
	 * 如果另外一个线程正在执行compute,那么其他线程就要等待很长时间。
	 */
	@Override
	public synchronized V compute(A arg) throws InterruptedException {
		V result = cache.get(arg);
		if(result == null){
			result = c.compute(arg);
			cache.put(arg, result);
		}
		return result;
	}

}
