package com.xiu.proxy.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public class MyTest { 

	public static void main(String[] args) throws FileNotFoundException,
			IOException, InstantiationException, IllegalAccessException {
		File file = new File(".");
		InputStream input = new FileInputStream(file.getCanonicalPath()
				+ "\\bin\\com\\xiu\\proxy\\sample\\Programmer.class");
		byte[] result = new byte[1024];

		int count = input.read(result);
		MyClassLoader loader = new MyClassLoader();
		Class clazz = loader.defineMyClass(result, 0, count);
		System.out.println(clazz.getCanonicalName());
		// 实例化一个Programmer对象
	 	Object o = clazz.newInstance();
		try {
			// 调用Programmer的code方法
			clazz.getMethod("code", null).invoke(o, null);
		} catch (IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}
}
