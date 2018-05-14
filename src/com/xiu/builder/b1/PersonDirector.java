package com.xiu.builder.b1;

public class PersonDirector {
	
	private PersonBuilder pb;
	public PersonDirector(PersonBuilder pb){
		this.pb = pb;
	}
	
	public void createPerson(){
		pb.buildHead();
		pb.buildBody();
		pb.buildArmLeft();
		pb.buildArmRight();
		pb.buildLegLeft();
		pb.buildArmRight();
	}
}
