package com.xiu.decorate.template2;

public class Decoration extends Component {

	private Component component;
	
	public Decoration(Component component){
		this.component = component;
	}
	@Override
	public void operation() {
		if(component != null)
			component.operation();
	}

}
