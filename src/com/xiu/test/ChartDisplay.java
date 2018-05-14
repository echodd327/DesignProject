package com.xiu.test;

public class ChartDisplay {
	
	public void display(String type){
		if("pie".equals(type)){
			PieChart pie = new PieChart();
			pie.display();
		}else if("bar".equals(type)){
			BarChart bar = new BarChart();
			bar.dispaly();
		}
	}
}
