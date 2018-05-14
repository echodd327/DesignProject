package com.xiu.decorate.template2;

public class DecorationB extends Decoration {

	public DecorationB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("DecorationB的具体操作!");
	}
	
	

}
