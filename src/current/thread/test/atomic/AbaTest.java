package current.thread.test.atomic;

import java.util.ArrayList;
import java.util.List;

public class AbaTest{
	
	static List<String> list = new ArrayList<String>();
	
	public static void main(String[] args) {
		list.add("a");
		
		Thread t1 = new Thread(){
			public void run() {
				 
			};
		};
	}

	 
}
