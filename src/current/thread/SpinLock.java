package current.thread;

import java.util.concurrent.atomic.AtomicReference;

public class SpinLock {
	
	private AtomicReference<Thread> owner = new AtomicReference<>();
	
	public void lock(){
		Thread current = Thread.currentThread();
		boolean flag = owner.compareAndSet(null, current);
		boolean flag1 = owner.compareAndSet(null, current);
		System.out.println(flag);
		System.out.println(flag1);
		/*while(!owner.compareAndSet(null, current)){
			System.out.println("set");
		}*/
	}
	
	public void unlock(){
		Thread current = Thread.currentThread();
		owner.compareAndSet(current, null);
	}
	
	public static void main(String[] args) {
		SpinLock s = new SpinLock();
		s.lock();
//		s.lock();
	}
}
