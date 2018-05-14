package com.xiu.prototype.p4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 759259051609221715L;
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
	
	public Object deepCopy() throws IOException, ClassNotFoundException{
		//将对象写进流里
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream bos = new ObjectOutputStream(bo);
		bos.writeObject(this);
		
		//从流里读出来
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream bis = new ObjectInputStream(bi);
		return bis.readObject();
	}
	
}
