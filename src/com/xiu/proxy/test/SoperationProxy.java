package com.xiu.proxy.test;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationAdd;
import com.xiu.factory.common.OperationDiv;
import com.xiu.factory.common.OperationMul;
import com.xiu.factory.common.OperationSub;

public class SoperationProxy extends Operation {

    private Operation operation;
	public SoperationProxy(String type){
		switch(type){
		case "+":
			operation = new OperationAdd();
			break;
		case "-":
			operation = new OperationSub();
			break;
		case "*":
			operation = new OperationMul();
			break;
		case "/":
			operation = new OperationDiv();
			break;
		}
		 
	}
	@Override
	public double getResult() throws Exception {
		 if(operation != null){
			 operation.setNumberA(this.getNumberA());
			 operation.setNumberB(this.getNumberB());
			 return operation.getResult();
		 }
		 return 0;
	}

}
