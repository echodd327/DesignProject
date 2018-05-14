package com.xiu.prototype.p4;

import java.io.IOException;

import com.xiu.prototype.p4.Resume;

public class Test {
	
	/**
	 * 深拷贝-将对象串行化
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws Exception {
		Resume a = new Resume("zhangsan");
		a.setPersonalInfo("男", "20");
		a.setWorkExpirence("2013-2015", "腾讯");
		
		Resume b = (Resume)a.deepCopy();
		b.setWorkExpirence("2015-2016", "百度");
		
		Resume c = (Resume)b.deepCopy();
		c.setPersonalInfo("男","39");
		
		a.display();
		b.display();
		c.display();
	}
}
