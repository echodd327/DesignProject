package com.xiu.strategy;

public class CashFactory {
	
	public static CashSuper createCashAccept(String type){
		CashSuper cashSuper = null;
		switch(type)
		{
			case "正常收费":
				cashSuper = new CashNormal();
				break;
			case "打七折":
				cashSuper = new CashRebate(0.7);
			    break;
			case "满300返100":
				cashSuper = new CashReturn(300, 100);
				break;
		}
		return cashSuper;
	}
}
