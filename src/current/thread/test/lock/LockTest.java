package current.thread.test.lock;

import java.util.concurrent.atomic.AtomicInteger;

public class LockTest implements Runnable{
	
	MyLock lock = new MyLock();
	
	public static void main(String[] args) {
		LockTest lockt = new LockTest();
		
		Thread t1 = new Thread(lockt);
		Thread t2 = new Thread(lockt);
		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		lock.lock();
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName()+","+i);
		}
		lock.unlock();
		
	}
}

class MyLock{
	
	private volatile AtomicInteger state = new AtomicInteger(0);
	
	public void lock(){
		while(!state.compareAndSet(0, 1));
	}
	public void unlock(){
		state.compareAndSet(1, 0);
	}
}
