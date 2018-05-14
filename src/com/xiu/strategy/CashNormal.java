package com.xiu.strategy;

public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double price) {
		return price;
	}

}
