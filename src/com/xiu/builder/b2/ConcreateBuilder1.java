package com.xiu.builder.b2;

public class ConcreateBuilder1 extends Builder {
	
	private Product p = new Product();
	@Override
	public void buildPartA() {
		p.add("部件A");
	}

	@Override
	public void buildPartB() {
		p.add("部件B");
	}

	@Override
	public Product getResult() {
		return p;
	}

}
