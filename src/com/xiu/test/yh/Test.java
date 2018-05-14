package com.xiu.test.yh;

public class Test {
	
	public static void main(String[] args) {
		AbstractChart chart = new PieChart();
		
		ChartDisplay dis = new ChartDisplay();
		dis.setChart(chart);
		dis.display();
	}
}
