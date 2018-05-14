package com.xiu.observer.b2;


public class StockObserver {
	
	private String name;
	private Subject subject;
	public StockObserver(String name,Subject subject){
		this.name = name;
		this.subject = subject;
	}

	public void closeStockWindows() {
		System.out.println(this.subject.getSubjectState()+","+name+" close stock");
	}

	
}
