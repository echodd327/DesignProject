package current.thread.track2;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static Map<Long,Object> map = new HashMap<Long,Object>();
	
	public static void main(String[] args) {
		
		map.put(new Long(1), "aaa");
		map.put(new Long(2), "bbb");
		map.put(new Long(3), "ccc");
		
		Map<Long,Object> map1 = map;
		map1.remove("1");
		
		System.out.println(map1);
		System.out.println(map);
		
		
	}
}
