package classLoader;

import java.util.HashMap;

public class LocalTest2 implements Runnable{
  
	static ThreadLocal<HashMap<Integer,Integer>> local = new ThreadLocal<HashMap<Integer,Integer>>(){
		protected java.util.HashMap<Integer,Integer> initialValue() {
			return new HashMap<Integer,Integer>();
		};
	};
	
	private  HashMap<Integer,Integer> student = null;
	
	public HashMap<Integer,Integer> get(){
		student = local.get();
		return student;
	}
	 
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("【" + threadName + "】：is running !");
		HashMap<Integer,Integer> map = get();
		if("aa".equals(threadName)){
			map.put(1, 1);
		}else{
			map.put(1, 2);
		}
		System.out.println("【" + threadName + "】：" + map);
	}
	
	public static void main(String[] args) {
		LocalTest2 t = new LocalTest2();
		Thread t1 = new Thread(t,"aa");
		Thread t2 = new Thread(t,"bb");
		t1.start();
		t2.start();
	}
	
}
