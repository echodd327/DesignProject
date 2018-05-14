package com.xiu.prototype.p3;

public class Resume implements Cloneable{
	
	private String name;
	private String sex;
	private String age;
	
	private WorkExperience work;
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	//设置个人信息
	public void setPersonalInfo(String sex,String age){
		this.sex = sex;
		this.age = age;
	}
	//设置工作经历
	public void setWorkExpirence(String timeArea,String company){
		work.setTimeArea(timeArea);
		work.setCompany(company);
	}
	
	//显示
	public void display(){
		System.out.println(name+","+sex+","+age);
		System.out.println("工作经历:"+work.getTimeArea()+","+work.getCompany());
	}
	
	public Object clone() throws CloneNotSupportedException{
		Resume o = (Resume)super.clone();
		o.work = (WorkExperience)work.Clone();
		return o;
	}
	
}
