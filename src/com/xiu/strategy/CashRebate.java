package com.xiu.strategy;

public class CashRebate extends CashSuper {
	
	private double moneyRebate = 0.0d;
	
	public CashRebate(double moneyRebate){
		this.moneyRebate = moneyRebate;
	}
	
	
	@Override
	public double acceptCash(double price) {
		return price*moneyRebate;
	}
	

}
