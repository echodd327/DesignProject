package com.xiu.factory.simple;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationDiv;

public class Test {
	
	public static void main(String[] args) throws Exception {
		//工厂模式
		double numberA = 2;
		double numberB = 1;
		Operation oper = OperationFactory.createOperation("/");
		oper.setNumberA(numberA);
		oper.setNumberB(numberB);
		System.out.println(oper.getResult());
		
		//策略模式
		OperationContext1 context1 = new OperationContext1(new OperationDiv());
		System.out.println(context1.GetResult(numberA, numberB));
		
		//策略模式+工厂模式
		OperationContext context = new OperationContext("/"); //工厂模式
		System.out.println(context.GetResult(numberA,numberB)); //策略模式
		
		
	}
}
