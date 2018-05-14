package com.xiu.proxy.template1;

public class PerSuit implements GiveGift {

	private SchoolGirl girl;
	
	public PerSuit(SchoolGirl girl){
		this.girl = girl;
	}
	
	@Override
	public void giveDolls() {
        System.out.println(girl.name + " 送你洋娃娃");
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl.name + " 送你花");
	}

	@Override
	public void giveChocolates() {
		System.out.println(girl.name + " 送你巧克力");
	}

}
