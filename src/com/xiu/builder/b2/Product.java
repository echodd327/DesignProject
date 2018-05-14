package com.xiu.builder.b2;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	List<String> parts = new ArrayList<String>();
	
	public void add(String part){  //添加产品部件
		parts.add(part);
	}
	
	public void show(){
		System.out.println("产品创建-------");
		for(String p: parts){
			System.out.println(p);
		}
	}
	
}
