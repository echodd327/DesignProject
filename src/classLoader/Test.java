package classLoader;

import java.util.Hashtable;

public class Test {
	
	
	public static void main(String[] args) {
//        char a = 'a';
//        char b = 'b';
//        String ab = "ab";
//        System.out.println((int)a+","+(int)b);
//        System.out.println(ab.hashCode());
//        System.out.println(ab.hashCode()&15);
//        System.out.println(ab.hashCode()&31);
//        System.out.println(ab.hashCode()&63);
        
//        ThreadLocal<T>\
        Hello t = new Hello();
        Hello f = new Hello();
        System.out.println(t.o);
        System.out.println(f.o);
        
        Thread t1 = new Thread(){
        	public void run() {
        		ThreadLocal<String> t1 = new ThreadLocal<>();
        		t1.set("zhangsan");
        		System.out.println(Thread.currentThread().getName()+",,"+t1.get());
        		
        	};
        };
        

        Thread t2 = new Thread(){
        	public void run() {
        		ThreadLocal<String> t1 = new ThreadLocal<>();
        		t1.set("lisi");
        		t1.set("aa");
        		System.out.println(Thread.currentThread().getName()+","+t1.get());
        	};
        };
        t1.start();
        t2.start();
       
//        ArrayList
//        LinkedList
        
	}
	
	
	
	static int hash(Object k) {
        int h = 0;
        if (0 != h && k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }

        h ^= k.hashCode();

        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
	
	static class Hello{
		  int a ;
		  static int b;
		  Object o = new Object();
		  
		  static class world{
			  
			  static void haha(){
				  System.out.println( new Hello().a);
				  System.out.println(b);
			  }
		  }
	}

}
