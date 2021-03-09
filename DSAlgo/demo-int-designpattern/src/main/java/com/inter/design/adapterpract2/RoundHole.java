package com.inter.design.adapterpract2;

public class RoundHole {

	int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	RoundHole(int radius){
		this.radius = radius;
	}
	
	boolean isFit(RoundPeg peg) {
		return radius >=peg.getRadius();
	}
}
