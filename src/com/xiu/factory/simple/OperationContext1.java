package com.xiu.factory.simple;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationAdd;
import com.xiu.factory.common.OperationDiv;
import com.xiu.factory.common.OperationMul;
import com.xiu.factory.common.OperationSub;

public class OperationContext1 {
	
	
	Operation operation = null;
	
	public OperationContext1(Operation operation){
		 this.operation = operation;
	}
	public double GetResult(double number1,double number2) throws Exception{
		operation.setNumberA(number1);
		operation.setNumberB(number2);
		return operation.getResult();
	}
}
