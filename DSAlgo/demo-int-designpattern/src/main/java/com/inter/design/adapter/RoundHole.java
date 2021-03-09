package com.inter.design.adapter;

public class RoundHole {

	int radius;
	
	public RoundHole(int rad) {
		this.radius = rad;
	}

	public int getRadius() {
		return radius;
	}
	
	public boolean canAccomodate(RoundingPeg round) {
		return  this.radius>= round.getRadius();
	}
}

