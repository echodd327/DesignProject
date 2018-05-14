package com.xiu.template.t2;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractClass c ;
		c = new ConcreateClassA();
		c.templateMethod();
		
		c = new ConcreateClassB();
		c.templateMethod();
	}
}
