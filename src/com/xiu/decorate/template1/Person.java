package com.xiu.decorate.template1;

public class Person {
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println("装扮的:"+ name);
	}
	
	public void wearTshirt(){
		System.out.println("穿T恤");
	}
	
	public void wearBigTrouser(){
		System.out.println("穿牛仔裤");
	}
	
	public void wearSneakers(){
		System.out.println("穿运动鞋");
	}
	
	
	public void wearSuit(){
		System.out.println("穿西装");
	}
	
	public void wearTie(){
		System.out.println("系领带");
	}
	
	public void wearLeatherShoes(){
		System.out.println("穿皮鞋");
	}
	
}
