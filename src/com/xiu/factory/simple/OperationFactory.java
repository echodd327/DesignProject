package com.xiu.factory.simple;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationAdd;
import com.xiu.factory.common.OperationDiv;
import com.xiu.factory.common.OperationMul;
import com.xiu.factory.common.OperationSub;

public class OperationFactory {
	
	
	public static Operation createOperation(String operate){
		Operation oper = null;
		switch(operate){
		case "+": oper = new OperationAdd();
			break;
		case "-": oper = new OperationSub();
		   break;
		case "*": oper = new OperationMul();
		   break;
		case "/": oper = new OperationDiv();
		}
		return oper;
	}
}
