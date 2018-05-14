package com.xiu.decorate.template3;

public class Tshirt extends Finery {

	public Tshirt(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println("穿T恤");
		super.show();
		
	}
	
	
	
}
