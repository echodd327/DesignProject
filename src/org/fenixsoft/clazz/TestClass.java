package org.fenixsoft.clazz;

public class TestClass {
	
	private int m;
	
	public int inc(){
		return m+1;
	}
	
	public int incc(){
		int x;
		try{
			x=1;
			return x;
		}catch(Exception e){
			x=2;
			return x;
		}finally{
			x=3;
		}
	}
	
	
	public static void main(String[] args) {
		int a;
//		System.out.println(a);
	}
} 
