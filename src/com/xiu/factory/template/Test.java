package com.xiu.factory.template;

public class Test {
	
	public static void main(String[] args) {
		IFactory factory = new ConcreateFactory();
		Product product = factory.createProduct();
		product.operation();
	}
}
