package com.xiu.factory.common;


public class OperationSub extends Operation{


	@Override
	public double getResult() {
		return this.getNumberA() - this.getNumberB();
	}

}
