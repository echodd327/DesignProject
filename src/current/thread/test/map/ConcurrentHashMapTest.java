package current.thread.test.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	
	public static void main(String[] args) {
		ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
		 int concurrencyLevel = 9;
		 int sshift = 0;
	     int ssize = 1;
	     while (ssize < concurrencyLevel) {
	            ++sshift;
	            ssize <<= 1;
	     }
	     System.out.println(sshift);  //4
	     System.out.println(ssize); //16
//	     this.segmentShift = 32 - sshift;
//	     this.segmentMask = ssize - 1;
	     
	     int initialCapacity = 16;
	     int c = initialCapacity / ssize;
	     if (c * ssize < initialCapacity)
	            ++c;
	     int cap = 2; //2
	     while (cap < c)
	            cap <<= 1;
	     System.out.println(cap);

	}
}
