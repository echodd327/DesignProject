package com.xiu.proxy.template1;

public class Proxy implements GiveGift {

	private PerSuit ps;
	
	public Proxy(SchoolGirl girl){
		ps = new PerSuit(girl);
	}
	@Override
	public void giveDolls() {
	    if(ps != null){
	    	ps.giveDolls();
	    }

	}

	@Override
	public void giveFlowers() {
		 if(ps != null){
		    	ps.giveFlowers();
		    }
	}

	@Override
	public void giveChocolates() {
		if(ps != null){
			ps.giveChocolates();
		}

	}

}
