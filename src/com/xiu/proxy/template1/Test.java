package com.xiu.proxy.template1;

public class Test {
	 
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl("韩梅梅");
		
		Proxy proxy = new Proxy(girl);
		proxy.giveFlowers();
		proxy.giveDolls();
		proxy.giveChocolates();
	}
}
