package com.xiu.test.factory;

import java.util.Arrays;
import java.util.Calendar;

class Client {
	public static void main(String args[]) {
		LoggerFactory factory;
		Logger logger;
//		factory = new DatabaseLoggerFactory(); // 可引入配置文件实现
		factory = (LoggerFactory)XMLUtil.getBean(); //getBean()的返回类型为Object，需要进行强制类型转换  
		logger = factory.createLogger();
		logger.writeLog();
		
		Calendar cal = Calendar.getInstance(); //静态工厂方法,根据不同地区生成不同日历,中国是java.util.GregorianCalendar，
	   
		
	}
}