package com.xiu.observer.b2;


public class Boss  extends Subject{
	
	private Eventhandler eventHandler;
	
	public Boss(Eventhandler eventHandler){
		this.eventHandler = eventHandler;
	}

	@Override
	public void notifyy() {
		eventHandler.update();
	}
}
