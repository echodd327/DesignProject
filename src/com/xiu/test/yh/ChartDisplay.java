package com.xiu.test.yh;

public class ChartDisplay {
	
	public AbstractChart chart;

	public void setChart(AbstractChart chart) {
		this.chart = chart;
	}
		
	public void display(){
		this.chart.display();
	}
}
