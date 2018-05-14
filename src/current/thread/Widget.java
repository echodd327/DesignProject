package current.thread;


public class Widget {
	
	public synchronized void dosomething(){
		System.out.println("dosomething...");
	}
	
}
class LoggingWidget extends Widget implements  Runnable{
	
	public void run() {
		this.dosomething();
	}

	public synchronized void dosomething(){
		System.out.println("LoggingWidget->doSomething()");
		this.doAnotherThing();
		super.dosomething();
	}
	private synchronized void doAnotherThing(){
		System.out.println("LoggingWidget->doAnotherThing()");
	}
}