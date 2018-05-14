package current.thread.test.prodConsu;
/**
 * 生产者线程
 * 
 * @author tangj
 *
 */
public class MyThreadProduce implements Runnable {

    private Service service;

    public MyThreadProduce(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (;;) {
            service.produce();
        }
    }

}