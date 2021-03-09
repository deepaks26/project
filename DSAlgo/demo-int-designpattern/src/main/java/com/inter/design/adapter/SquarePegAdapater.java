package com.inter.design.adapter;

public class SquarePegAdapater extends RoundingPeg {

	private SquarePeg peg;

    public SquarePegAdapater(SquarePeg peg) {
        this.peg = peg;
    }
    
    @Override
    public int getRadius() {
		return peg.width*2;
	}
}
