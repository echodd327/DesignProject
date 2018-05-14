package current.thread.test;

import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	static Test test = new Test();
	public static void main(String[] args) throws InterruptedException {
//		ConcurrentHashMap
		
		
		
	}
	
	public static void joinTest() throws InterruptedException{
		Thread t = new Thread(){
			public void run() {
				synchronized (this) {
					notifyAll();
					System.out.println("notify");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  	System.out.println("start");
			};
		};
		t.start();
		synchronized (t) {
			while(t.isAlive()){
				System.out.println("wait");
				t.wait(0);
				System.out.println(t.isAlive());
			}
		}
		System.out.println("main end");
	}
}
