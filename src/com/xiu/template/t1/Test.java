package com.xiu.template.t1;

public class Test {
	
	public static void main(String[] args) {
		TestPaper student1 = new TestPaper1();
		student1.testQuestion1();
		student1.testQuestion2();
		student1.testQuestion3();
		System.out.println();
		TestPaper student2 = new TestPaper2();
		student2.testQuestion1();
		student2.testQuestion2();
		student2.testQuestion3();
	}
}
