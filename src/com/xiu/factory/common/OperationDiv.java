package com.xiu.factory.common;

public class OperationDiv extends Operation{

	@Override
	public double getResult() throws Exception {
		if(this.getNumberB() == 0){
			throw new Exception("除数不能为0");
		}
		return this.getNumberA() / this.getNumberB();
	}

}
