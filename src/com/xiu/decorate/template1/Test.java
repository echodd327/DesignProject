package com.xiu.decorate.template1;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("张三");
		
		p.wearTshirt();
		p.wearBigTrouser();
		p.wearSneakers();
		
		p.show();
		
		
		Person p1 = new Person("李四");
		p1.wearSuit();
		p1.wearTie();
		p1.wearLeatherShoes();
		
		p1.show();
	}
}
