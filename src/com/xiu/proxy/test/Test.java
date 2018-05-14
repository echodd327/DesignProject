package com.xiu.proxy.test;




public class Test {
	
	public static void main(String[] args) throws Exception {
		//静态代理
		SoperationProxy sproxy = new SoperationProxy("/");
		sproxy.setNumberA(2);
		sproxy.setNumberB(1);
		System.out.println(sproxy.getResult());
		
		//动态代理 
		DoperationProxy dproxy = new DoperationProxy();
		Oper oper = dproxy.bind("+");
		System.out.println(oper.getResult(1, 2));
	}
}
