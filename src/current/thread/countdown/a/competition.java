package current.thread.countdown.a;

import java.util.concurrent.CountDownLatch;

public class competition {
	
	 public static void main(String[] args) {
		 CountDownLatch readyLatch = new CountDownLatch(3);
		 CountDownLatch startLatch = new CountDownLatch(1);
		 CountDownLatch endLatch = new CountDownLatch(3);
		 Referee rf = new Referee(readyLatch,startLatch,endLatch);
		 Thread rfthread = new Thread(rf);
		 rfthread.start();
				 
		 Player player1 = new Player("zhangsan", readyLatch,startLatch, endLatch);
		 Player player2 = new Player("lisi", readyLatch,startLatch, endLatch);
		 Player player3 = new Player("wangwu", readyLatch,startLatch, endLatch);
		 Thread t1 = new Thread(player1);
		 Thread t2 = new Thread(player2);
		 Thread t3 = new Thread(player3);
		 t1.start();
		 t2.start();
		 t3.start();
		 
	}
}
