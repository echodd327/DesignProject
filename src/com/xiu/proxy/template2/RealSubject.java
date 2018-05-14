package com.xiu.proxy.template2;

public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("真实对象");
	}

}
