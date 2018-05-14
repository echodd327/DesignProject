package com.xiu.factory.template;

public class ConcreateFactory implements IFactory {

	@Override
	public Product createProduct() {
		return new ConcreateProduct();
	}

}
