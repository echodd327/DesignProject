package current.thread.test.prodConsu;
public class Application {

    public static void main(String[] args) {
        Service service = new Service();
        Runnable produce = new MyThreadProduce(service);
        Runnable consume = new MyThreadConsume(service);
        new Thread(produce, "生产者  ").start();
        new Thread(consume, "消费者  ").start();
    }

}