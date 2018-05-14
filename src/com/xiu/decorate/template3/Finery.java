package com.xiu.decorate.template3;

public class Finery extends Person {

	private Person component;
	
	public Finery(String name) {
		super(name);
	}
	
	public void Decoration(Person component){
		this.component = component;
	}
	

	@Override
	public void show() {
		if(component != null){
			component.show();
		}
	}
	
}
