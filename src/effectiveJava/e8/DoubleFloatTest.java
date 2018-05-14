package effectiveJava.e8;

import java.math.BigDecimal;

public class DoubleFloatTest {
	
	public static void main(String[] args) {
		System.out.println(1.03-0.42); //0.6100000000000001
		System.out.println(1.00-9*0.10);  //0.09999999999999998
		
		main2();
		
	}
	
	public static void main1(){
		double funds = 1.00;
		int itemBounds = 0;
		for(double price = 0.10; funds>=price;price+=0.10){
			funds -=price;
			itemBounds++;
		}
		System.out.println("itemBounds:"+itemBounds); //3
		System.out.println("Change $:"+ funds); //0.3999999999999999 答案是错误的
	}
	
	public static void main2(){
		final BigDecimal TEN_CENTS = new BigDecimal("0.10");
		BigDecimal funds = new BigDecimal("1.00");
		int itemBounds = 0;
		for(BigDecimal price = TEN_CENTS; funds.compareTo(price)>=0;price=price.add(TEN_CENTS)){
			itemBounds++;
			funds = funds.subtract(price);
		}
		System.out.println("itemBounds:"+itemBounds);  //4
		System.out.println("Change $:"+ funds); //0.00
	}
}
