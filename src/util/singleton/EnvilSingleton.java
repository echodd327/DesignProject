package util.singleton;

import java.io.Serializable;

public class EnvilSingleton implements Serializable{
	private static final transient EnvilSingleton instance = new EnvilSingleton();
	private EnvilSingleton(){
	}
	public static  EnvilSingleton getInstance(){
		return instance;
	}
	public void leaveTheBuilding(){
		System.out.println("hello wolrd");
	}
}
