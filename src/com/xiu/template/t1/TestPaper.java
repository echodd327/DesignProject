package com.xiu.template.t1;

public abstract class TestPaper {
	
	public void testQuestion1(){
		System.out.println("第一题，08年奥运会在哪举行，A:北京， B:东京， C:里约");
		System.out.println("答案是: "+ answer1());
	}
	
	public void testQuestion2(){
		System.out.println("第二题，12年奥运会在哪举行，A:北京， B:东京， C:里约");
		System.out.println("答案是: "+ answer2());
		
	}
	
	public void testQuestion3(){
		System.out.println("第二题，16年奥运会在哪举行，A:北京， B:东京， C:里约");
		System.out.println("答案是: "+ answer3());
		
	}
	
	protected abstract String answer1();
	protected abstract String answer2();
	protected abstract String answer3();
}
