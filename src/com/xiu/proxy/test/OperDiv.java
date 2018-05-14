package com.xiu.proxy.test;

public class OperDiv implements Oper {

	@Override
	public double getResult(double numberA, double numberB) throws Exception {
		if(numberB == 0){
			throw new Exception("除数不能为0");
		}
		return  numberA / numberB;
	}

}
