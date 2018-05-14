package com.xiu.decorate.template2;

public class Test {
	 
	public static void main(String[] args) {
		Component cp = new ConcreateComponent();
		Decoration d = new DecorationB(new DecorationA(cp));
		d.operation();
		
	}
}
