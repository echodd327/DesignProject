package current.thread;

public class NotVisibility {
	
	private static boolean ready;
	private static int number;
	
	private static class ReadThread extends Thread{
		
		@Override
		public void run() {
			System.out.println("inner");
			while(!ready){
				Thread.yield();
			}
			System.out.println(number);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		new ReadThread().start();
		Thread.sleep(1000);
		number=42;
		ready = true;
		System.out.println("main");
	}
}
