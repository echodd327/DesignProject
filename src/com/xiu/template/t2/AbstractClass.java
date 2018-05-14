package com.xiu.template.t2;

public abstract class AbstractClass {
	
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	public void templateMethod(){
		primitiveOperation1();
		primitiveOperation2();
	}
}
