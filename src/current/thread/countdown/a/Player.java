package current.thread.countdown.a;

import java.util.concurrent.CountDownLatch;

public class Player implements Runnable {

	private String name;
	private CountDownLatch readyLatch;
	private CountDownLatch startLatch;
	private CountDownLatch endLatch;
	
	public Player(String name,CountDownLatch readyLatch,CountDownLatch startLatch,CountDownLatch endLatch){
		this.name = name;
		this.readyLatch = readyLatch;
		this.startLatch = startLatch;
		this.endLatch = endLatch;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		try {
			System.out.println(this.name+"准备完毕!");
			readyLatch.countDown();
			startLatch.await();
			System.out.println(this.getName()+"开始跑步..");
			Thread.sleep((long) (Math.random()*10000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName()+"到达重点，记录成绩！");
		endLatch.countDown();
	}

}
