package com.xiu.prototype.p3;

import com.xiu.prototype.p3.Resume;

public class Test {
	
	/**
	 * 深拷贝
	 */
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
