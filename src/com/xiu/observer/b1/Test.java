package com.xiu.observer.b1;

public class Test {
	
	public static void main(String[] args) {
		
		Subject boss = new Boss();
		
		StockObserver observer1 = new StockObserver("zhangsan", boss);
		StockObserver observer2 = new StockObserver("lisi", boss);
		
		boss.attach(observer1);
		boss.attach(observer2);
		
		boss.setSubjectState("I am come back");
		boss.notifyy();
		
	}
	
}
