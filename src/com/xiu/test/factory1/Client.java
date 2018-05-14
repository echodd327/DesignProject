package com.xiu.test.factory1;

class Client {
	public static void main(String args[]) {
		LoggerFactory factory = new DatabaseLoggerFactory();
		factory.writeLog(); // 直接使用工厂对象来调用产品对象的业务方法
	}
}