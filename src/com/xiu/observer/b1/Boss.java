package com.xiu.observer.b1;

import java.util.ArrayList;
import java.util.List;

public class Boss  extends Subject{
	
	//同事列表
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	

	@Override
	public void notifyy() {
		for(Observer observer:observers){
			observer.update();
		}
	}
}
