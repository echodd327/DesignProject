package com.xiu.combination10.common;

public class Test {
	
	public static void main(String[] args) {
		
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		root.add(comp);
		
		Composite comp1 = new Composite("Composite Y");
		comp1.add(new Leaf("Leaf YA"));
		comp1.add(new Leaf("Leaf YB"));
		comp.add(comp1);
		
		root.add(new Leaf("Leaf C"));
		
		root.display(1);
	}
}
