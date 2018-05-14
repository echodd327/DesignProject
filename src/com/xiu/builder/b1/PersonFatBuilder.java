package com.xiu.builder.b1;

public class PersonFatBuilder extends PersonBuilder {

	public PersonFatBuilder(Graphics g, Pen p) {
		super(g, p);
	}

	@Override
	public void buildHead() {
	   g.drawEllipse(p, 50, 20, 30, 30);
	}

	@Override
	public void buildBody() {
		g.drawRectangle(p, 50, 20, 30, 30);
	}

	@Override
	public void buildArmLeft() {
		g.drawLine(p, 50, 20, 30, 30);
	}

	@Override
	public void buildArmRight() {
		g.drawLine(p, 50, 20, 30, 30);
	}

	@Override
	public void buildLegLeft() {
		g.drawLine(p, 50, 20, 30, 30);
	}

	@Override
	public void buildLegRight() {
		g.drawLine(p, 50, 20, 30, 30);
	}

}
