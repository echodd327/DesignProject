package com.xiu.combination10.common;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);

	}

	@Override
	public void display(int depth) {
		for(int i = 0; i < depth; i++){
			System.out.print("-");
		}
		System.out.println(""+name);
		for(Component c: children){
			c.display(depth+2);
		}

	}

}
