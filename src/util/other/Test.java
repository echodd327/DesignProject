package util.other;

import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		/*Date start = new Date();
		Date end = new Date();
		end.setYear(1978);
		Period p = new Period(start, end);
		System.out.println(p.getStart() + "," + p.getEnd());*/
		
		//改造1,传值，不传引用
		/*Date start = new Date();
		Date end = new Date();
		end.setYear(78);
		Period1 p = new Period1(start, end);
		System.out.println(p.getStart() + "," + p.getEnd());
		*/
		
		String a = String.valueOf(null);
		System.out.println(a);
	}
}
