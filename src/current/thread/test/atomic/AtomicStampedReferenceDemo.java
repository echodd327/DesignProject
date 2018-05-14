package current.thread.test.atomic;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReferenceDemo {
    private static AtomicStampedReference atomicStampedReference = new AtomicStampedReference(100, 1);

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
            int stamp = atomicStampedReference.getStamp();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicStampedReference.compareAndSet(100, 110, stamp, stamp + 1));
            System.out.println(atomicStampedReference.compareAndSet(110, 100, stamp+1, stamp + 1));
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
            int stamp = atomicStampedReference.getStamp();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AtomicStampedReference compareAndSet : " + atomicStampedReference.compareAndSet(100, 120, stamp, stamp + 1));
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}