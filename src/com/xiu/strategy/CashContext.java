package com.xiu.strategy;

public class CashContext {
	
	private CashSuper csuper;
	public CashContext(String type){
		switch(type){
		case "正常收费": 
			this.csuper = new CashNormal();
			break;
		case "打七折":
			this.csuper = new CashRebate(0.7);
			break;
		case "买300减100":
			this.csuper = new CashReturn(300, 200);
			break;
		}
	}
	public double getResult(double price){
		return this.csuper.acceptCash(price);
	}
}
