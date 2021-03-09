package com.inter.design.strategy1;

public class MultiplyStrategy implements Strategy{

	@Override
	public int perform(int n1, int n2) {
		return n1*n2;
	}

}
