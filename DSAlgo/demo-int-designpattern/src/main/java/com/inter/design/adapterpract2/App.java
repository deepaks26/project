package com.inter.design.adapterpract2;

public class App {

	public static void main(String[] args) {
		RoundHole hole =  new RoundHole(10);
		RoundPeg peg = new RoundPeg(5);
		System.out.println(hole.isFit(peg));
		SquarePeg sq = new SquarePeg(12);
		SquareAdapter adapt = new SquareAdapter(sq);
		System.out.println(hole.isFit(adapt));
	}
}
