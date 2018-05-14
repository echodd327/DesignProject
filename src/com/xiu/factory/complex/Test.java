package com.xiu.factory.complex;

import com.xiu.factory.common.Operation;

public class Test {
	
	public static void main(String[] args) throws Exception {
		double numberA = 1;
		double numberB = 2;
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.setNumberA(numberA);
		oper.setNumberB(numberB);
		System.out.println(oper.getResult());
	}
}
