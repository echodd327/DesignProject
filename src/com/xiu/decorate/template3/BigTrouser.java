package com.xiu.decorate.template3;

public class BigTrouser extends Finery {

	public BigTrouser(String name) {
		super(name);
	}

	@Override
	public void show() {
		System.out.println("穿牛仔裤");
		super.show();
		
	}
	
	
	
}
