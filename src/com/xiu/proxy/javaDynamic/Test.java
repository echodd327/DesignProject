package com.xiu.proxy.javaDynamic;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		BookFacadeProxy proxy = new BookFacadeProxy();
		
		BookFacade bookPorxy = (BookFacade)proxy.bind(new BookFacadeImpl());
		bookPorxy.addBook();
		System.out.println();
		bookPorxy.deleteBook();
		
		
		
	}
}
