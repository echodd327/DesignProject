package com.xiu.builder.b1;

public abstract class PersonBuilder {
	
	
	protected Graphics g;
	protected Pen p;
	
	public PersonBuilder(Graphics g, Pen p){
		this.g= g;
		this.p = p;
	}
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArmLeft();
	public abstract void buildArmRight();
	public abstract void buildLegLeft();
	public abstract void buildLegRight();
	
}
