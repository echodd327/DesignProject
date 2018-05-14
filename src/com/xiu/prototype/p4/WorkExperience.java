package com.xiu.prototype.p4;

import java.io.Serializable;

public class WorkExperience implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9027257375211679693L;
	private String timeArea;
	private String company;
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
