package com.xiu.proxy.javaDynamic;

public class BookFacadeImpl implements BookFacade {

	@Override
	public void addBook() {
		System.out.println("增加图书方法...");
	}

	@Override
	public void deleteBook() {
		System.out.println("删除图书方法...");
		
	}

}
