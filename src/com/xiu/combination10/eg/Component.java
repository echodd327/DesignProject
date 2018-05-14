package com.xiu.combination10.eg;

public abstract class Component {
	
	protected String name;
	
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(Context context);
}
