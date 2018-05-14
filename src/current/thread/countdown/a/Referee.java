package current.thread.countdown.a;

import java.util.concurrent.CountDownLatch;

public class Referee implements Runnable {
	
	private CountDownLatch readyLatch;
	private CountDownLatch startLatch;
	private CountDownLatch endLatch;
	
	
	public Referee(CountDownLatch readyLatch,CountDownLatch startLatch,CountDownLatch endLatch){
		this.readyLatch = readyLatch;
		this.startLatch = startLatch;
		this.endLatch = endLatch;
	}
	@Override
	public void run() {
		try {
			System.out.println("裁判说准备比赛!");
			readyLatch.await();
			System.out.println("--------裁判鸣枪------------");
			startLatch.countDown();
			
			endLatch.await();
			System.out.println("裁判说成绩记录完毕,比赛结束!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
