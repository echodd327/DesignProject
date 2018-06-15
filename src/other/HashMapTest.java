package other;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapTest {
	
	
	transient int hashSeed = 0;
	
	
	  final int hash(Object k) {
	        int h = hashSeed;
	        if (0 != h && k instanceof String) {
//	            return sun.misc.Hashing.stringHash32((String) k);
	        }

	        h ^= k.hashCode();

	        // This function ensures that hashCodes that differ only by
	        // constant multiples at each bit position have a bounded
	        // number of collisions (approximately 8 at default load factor).
	        h ^= (h >>> 20) ^ (h >>> 12);
	        return h ^ (h >>> 7) ^ (h >>> 4);
	    }
	  
	  static int indexFor(int h, int length) {
	        // assert Integer.bitCount(length) == 1 : "length must be a non-zero power of 2";
	        return h & (length-1);
	    }

	public static void main(String[] args) {
		HashMapTest t = new HashMapTest();
		t.testHashIndex();
//		t.testHashMap(); 
		
	}
	  
	public void testHashIndex(){
		  for(int i = 0; i < 16; i++){
			   String obj = String.valueOf((char)(97+i));
			   int hash = hash(obj);
//			   System.out.println(hash + "," + hash%15);
			   int index = indexFor(hash, 16);
			   System.out.println(obj+","+index);
		  }
//		  System.out.println(Integer.valueOf(8).hashCode());
//		  System.out.println( 1 << 30);
		  
		 
	}
	
	public void testHashMap(){
		Map<String,String> map = new HashMap<String,String>();
		for(int i = 0; i < 12; i++){
			   String obj = String.valueOf((char)(97+i));
			   map.put(obj, obj);
		  }
		Iterator iter = map.entrySet().iterator();
		
		while(iter.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>)iter.next();
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}
}
