package classLoader;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class LocalTest1 implements Runnable {

	private static ThreadLocal<Student> localStudent = new ThreadLocal<Student>(){
			
		@Override
		protected Student initialValue() {
		     return new Student();
		}
		
	};
	private Student student = null;
	
	public Student getStudent() {
		 student = localStudent.get();
		 return student;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println("【" + threadName + "】：is running !");
		Random ramdom = new Random();
		int age = ramdom.nextInt(100);
		System.out.println("【" + threadName + "】：set age to :" + age);
		Student stu = getStudent();
		stu.setAge(age);
		System.out.println("【" + threadName + "】：" + stu);
		
		System.out.println("【" + threadName + "】：第一次读到的age值为 :" + stu.getAge());
		 try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("【" + threadName + "】：第二次读到的age值为 :" + stu.getAge());
	}
	
	public static void main(String[] args) {
		 LocalTest1 ll = new LocalTest1();
		 Thread t1 = new Thread(ll, "线程1");
		 Thread t2 = new Thread(ll, "线程2");
		 
		 t1.start();
		 t2.start();
	}

}
