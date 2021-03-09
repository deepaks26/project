package com.inter.design.strategy1;

public class Context {

	Strategy s;

	public Context(Strategy s) {
		this.s = s;
	}
	
	 public int perform (int n1, int n2) {
		 return s.perform(n1, n2);
	 }
}
