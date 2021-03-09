package com.inter.design.adapterpract2;

public class SquareAdapter extends RoundPeg {

	SquarePeg sqPeg;
	
	SquareAdapter(SquarePeg sqPeg) {
		this.sqPeg = sqPeg;
	}

	public int getRadius() {
		return sqPeg.width;
	}

}
