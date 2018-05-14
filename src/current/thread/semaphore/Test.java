package current.thread.semaphore;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		BoundedHashSet<String> set = new BoundedHashSet<String>(2);
		set.add("zhangsan");
		set.add("lisi");
		set.remove("lisi");
		set.add("wangwu");
	}
}
