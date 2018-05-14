package com.xiu.prototype.p1;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume a = new Resume("zhangsan");
		a.setPersonalInfo("男", "20");
		a.setWorkExpirence("2013-2015", "腾讯");
		
		Resume b = (Resume)a.clone();
		b.setWorkExpirence("2015-2016", "百度");
		
		Resume c = (Resume)b.clone();
		c.setPersonalInfo("男","39");
		
		a.display();
		b.display();
		c.display();
	}
}
