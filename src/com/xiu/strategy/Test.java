package com.xiu.strategy;

public class Test {
	
	public static void main(String[] args) {
		/*CashSuper cSuper = CashFactory.createCashAccept("打七折");
		System.out.println(cSuper.acceptCash(300));*/
		
//		CashContext context = new CashContext(new CashReturn(500, 100));
//		System.out.println(context.getResult(600));
		
		//客户端认识一个CashContext就可以，耦合度更低，
		CashContext ctx = new CashContext("打七折");
		System.out.println(ctx.getResult(100));
		
	}
}
