package current.thread.test.prodConsu;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExample {
  public static void main(String[] args) throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(5);
    Service1 task = new Service1(latch);
    

    for (int i = 0; i < 5; i++) {
      Thread thread = new Thread(task);
      thread.start();
    }

    System.out.println("main thread await. ");
    latch.await(); //
    latch.await();
    System.out.println("main thread finishes await. ");
  }
}
class Service1  implements Runnable{
	  private CountDownLatch latch;

	  public Service1(CountDownLatch latch) {
	    this.latch = latch;
	  }

	  public void exec() {
	    try {
	      System.out.println(Thread.currentThread().getName() + " execute task. ");
	      sleep(2);
	      System.out.println(Thread.currentThread().getName() + " finished task. ");
	    } finally {
	      latch.countDown(); //
	    }
	  }

	  private void sleep(int seconds) {
	    try {
	      TimeUnit.SECONDS.sleep(seconds);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }

	@Override
	public void run() {
		this.exec();
	}
	}

