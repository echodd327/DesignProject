package com.xiu.decorate.template3;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		String name = "zhangsan";
		Person person = new Person(name);
		
		Tshirt tst = new Tshirt(name);
		Sneakers snk = new Sneakers(name);
		BigTrouser btr = new BigTrouser(name);
		
		snk.Decoration(person);
		btr.Decoration(snk);
		tst.Decoration(btr);
		
		tst.show();
		
	}
}
