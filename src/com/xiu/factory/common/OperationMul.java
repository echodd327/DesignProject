package com.xiu.factory.common;


public class OperationMul extends Operation {


	@Override
	public double getResult() {
		return this.getNumberA() * this.getNumberB();
	}

}
