package other;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		  Map<String, String> map = new LinkedHashMap<String, String>(16,0.75f,true);
		  map.put("apple", "苹果"); 
		  map.put("watermelon", "西瓜");
		  map.put("banana", "香蕉"); 
		  map.put("peach", "桃子"); 
		  
		  map.get("banana");
		 
		 
		  Iterator iter = map.entrySet().iterator();
		  while(iter.hasNext()){
			  Map.Entry entry =(Map.Entry)iter.next();
			  System.out.println(entry.getKey()+"="+entry.getValue());
		  }

	}
}
