package current.thread.test.atomic;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
//  static  int i = 0;
    static AtomicInteger i = new AtomicInteger(0);

  public void run() {
      for (int m = 0; m < 100; m++) {
//    	  i++;
//    	  System.out.println(Thread.currentThread().getName()+","+m+ ","+i.getAndAdd(4));
    	  System.out.println(Thread.currentThread().getName()+","+m+ ","+i.addAndGet(1));
      }
     
  }
};

public class Test {
  public static void main(String[] args) throws InterruptedException {
      MyThread mt = new MyThread();

      Thread t1 = new Thread(mt);
      Thread t2 = new Thread(mt);
      t1.start();
      t2.start();
      Thread.sleep(500);
      System.out.println(MyThread.i);
  }
}