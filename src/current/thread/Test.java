package current.thread;

public class Test {
	
	public static void main(String[] args) {
		LoggingWidget log = new LoggingWidget();
		Thread t1 = new Thread(log);
		Thread t2 = new Thread(log);
		t1.start();
		t2.start();
		
	}
}
