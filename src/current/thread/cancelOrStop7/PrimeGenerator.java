package current.thread.cancelOrStop7;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements Runnable {
	
	private final List<BigInteger> primes = new ArrayList<BigInteger>();
	private volatile boolean cancelled;
	
	@Override
	public void run() {
		BigInteger p = BigInteger.ONE;
		while(!cancelled){
			p = p.nextProbablePrime();
			synchronized (this) {
				p.add(p);
			}
		}
	}
	public void cancelled(){
		cancelled = true;
	}
	
	public synchronized List<BigInteger> get(){
		return new ArrayList<BigInteger>(primes);
	}
	

}
