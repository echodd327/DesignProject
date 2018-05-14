package com.xiu.combination10.common;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("叶子节点不能增加!");
	}

	@Override
	public void remove(Component c) {
		System.out.println("叶子节点不能删除!");
	}

	@Override
	public void display(int depth) {
		for(int i = 0; i < depth; i++){
			System.out.print("-");
		}
		System.out.println(""+name);
	}


	
}
