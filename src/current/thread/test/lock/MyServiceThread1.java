package current.thread.test.lock;
public class MyServiceThread1 implements Runnable {

    private MyService service;

    public MyServiceThread1(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }

}