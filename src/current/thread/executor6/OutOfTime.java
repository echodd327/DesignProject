package current.thread.executor6;

import java.util.Timer;
import java.util.TimerTask;

public class OutOfTime {
	
	public static void main(String[] args) throws InterruptedException {
		Timer timer = new Timer();
		timer.schedule(new ThrowTask(), 1);
		Thread.sleep(1);
		timer.schedule(new ThrowTask(), 1);
		Thread.sleep(5);
	}
	
	static class ThrowTask extends TimerTask{
		public void run(){
			throw new RuntimeException();
		}
	}
}
