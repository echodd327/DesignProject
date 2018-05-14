package effectiveJava.e8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForeachTest {
	
	public static void main(String[] args) {
		List<String> famous = new ArrayList<String>();
	    famous.add("liudehua");
	    famous.add("madehua");
	    famous.add("liushishi");
	    famous.add("tangwei");
//	    for (String s : famous) {
//	        if (s.equals("madehua")) {
//	            famous.remove(s);  //java.util.ConcurrentModificationException
//	        }  
//	    }
	    
	    for(Iterator<String> it = famous.iterator();it.hasNext();){
	         String s = it.next();
	         if(s.equals("madehua")){
	            it.remove(); //删除成功
	         }
	     }
	    System.out.println(famous);
	}
}
