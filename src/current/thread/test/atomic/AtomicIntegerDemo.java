package current.thread.test.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
	
    private static AtomicInteger atomicInteger = new AtomicInteger(100);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("1"+atomicInteger.compareAndSet(100, 110)); //先修改成B
                System.out.println("2"+atomicInteger.compareAndSet(110, 100));; //再修改成A
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("AtomicInteger compareAndSet : " + atomicInteger.compareAndSet(100, 120));
                System.out.println("AtomicInteger value : " + atomicInteger.get());
            }
        });

        thread1.start();
//        thread2.start();

        thread1.join();
//        thread2.join();
    }
}