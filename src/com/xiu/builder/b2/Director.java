package com.xiu.builder.b2;

public class Director {
	
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
