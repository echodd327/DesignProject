package com.xiu.decorate.template3;

public class Sneakers extends Finery {

	public Sneakers(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println("穿运动鞋");
		super.show();
		
	}
	
	
}
