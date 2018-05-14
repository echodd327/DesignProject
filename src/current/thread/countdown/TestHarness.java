package current.thread.countdown;

import java.util.concurrent.CountDownLatch;

public class TestHarness {
	
	public long timeTasks(int nThreads, final Runnable task) throws InterruptedException{
		final CountDownLatch startGate = new CountDownLatch(1);
		final CountDownLatch endGate = new CountDownLatch(nThreads);
		for(int i = 0; i < nThreads; i++){
			Thread t = new Thread(){
				@Override
				public void run() {
				 try{
					 startGate.await();  //startGate 阻塞线程 1
					 try{
						 task.run();
						}finally{
							endGate.countDown();  //endGate 减1
						}
				 }catch(InterruptedException ignored){
					 
				 }
					
				}
			};
			t.start();
		}
		
		long start = System.nanoTime();
		startGate.countDown();  // startGate 减1
		endGate.await();  //endGate阻塞
		long end = System.nanoTime();
		return end -start;
	}
	
	public static void main(String[] args) {
		TestHarness t = new TestHarness();
		try {
			long n= t.timeTasks(10, new Runnable() {
				@Override
				public void run() {
				  System.out.println("run");	
				}
			});
			System.out.println(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
