package com.inter.design.adapter;

public class AdapterApp {

	public static void main(String[] args) {
		RoundHole hole= new RoundHole(5);
		RoundingPeg peg = new RoundingPeg(5);
		System.out.println(hole.canAccomodate(peg));
		
		SquarePeg speg = new SquarePeg(2);
		
		SquarePegAdapater adapt = new SquarePegAdapater(speg);
		
		System.out.println(hole.canAccomodate(adapt));
	}
}
