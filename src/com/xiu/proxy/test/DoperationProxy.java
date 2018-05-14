package com.xiu.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.xiu.factory.common.Operation;
import com.xiu.factory.common.OperationAdd;
import com.xiu.factory.common.OperationDiv;
import com.xiu.factory.common.OperationMul;
import com.xiu.factory.common.OperationSub;

public class DoperationProxy implements InvocationHandler {
	
	private Oper oper;
	
	 
	public Oper bind(String type){
		switch(type){
		case "+":
			oper = new OperAdd();
			break;
		case "-":
			oper = new OperSub();
			break;
		case "*":
			oper = new OperMul();
			break;
		case "/":
			oper = new OperDiv();
			break;
		}
		return (Oper)Proxy.newProxyInstance(oper.getClass().getClassLoader(), 
				oper.getClass().getInterfaces(), 
				this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		result = method.invoke(oper, args);
		return result;
	}

}
