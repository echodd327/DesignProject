package com.xiu.observer.b1;

public abstract class Subject {
	
	private String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
	public abstract void attach(Observer observer);
	
	public abstract void detach(Observer observer);
	
	public abstract void notifyy();

}
