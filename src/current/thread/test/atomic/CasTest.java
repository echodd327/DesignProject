package current.thread.test.atomic;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class CasTest implements Runnable{

	AtomicInteger i = new AtomicInteger(100);
	
	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName()+","+i.incrementAndGet());
//		System.out.println(Thread.currentThread().getName()+","+i.incrementAndGet());
//		System.out.println(Thread.currentThread().getName()+","+i.incrementAndGet());
//		ConcurrentLinkedDeque<E> 
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		CasTest cast = new CasTest();
		Thread t1 = new Thread(cast);
		Thread t2 = new Thread(cast);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cast.i);
	}
	
	
}
