package current.thread.test.prodConsu;
/**
 * 消费者线程
 * 
 * @author tangj
 *
 */
public class MyThreadConsume implements Runnable {

    private Service service;

    public MyThreadConsume(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        for (;;) {
            service.consume();
        }
    }

}