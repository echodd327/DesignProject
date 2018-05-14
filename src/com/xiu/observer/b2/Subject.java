package com.xiu.observer.b2;

public abstract class Subject {
	
	private String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
	public abstract void notifyy();

}
