package com.xiu.decorate.template2;

public class DecorationA extends Decoration {

	public DecorationA(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("DecorationA的具体操作!");
	}

}
