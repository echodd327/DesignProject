package com.xiu.builder.b1;

public class Test {
	
	public static void main(String[] args) {
		Pen p = new Pen();
		Graphics g = new Graphics();
		PersonThinBuilder ptb = new PersonThinBuilder(g, p);
		PersonDirector pd = new PersonDirector(ptb);
		pd.createPerson();
		System.out.println("--------------------------");
		PersonFatBuilder pfb = new PersonFatBuilder(g, p);
		PersonDirector fpd = new PersonDirector(pfb);
		fpd.createPerson();
		
	}
}
