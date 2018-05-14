package current.thread.test;

public class Singleton {
	
	public static Singleton singleton = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
