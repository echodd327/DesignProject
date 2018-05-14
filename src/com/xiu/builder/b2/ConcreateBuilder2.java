package com.xiu.builder.b2;

public class ConcreateBuilder2 extends Builder {
	
	private Product p = new Product();
	@Override
	public void buildPartA() {
		p.add("部件X");
	}

	@Override
	public void buildPartB() {
		p.add("部件Y");
	}

	@Override
	public Product getResult() {
		return p;
	}

}
