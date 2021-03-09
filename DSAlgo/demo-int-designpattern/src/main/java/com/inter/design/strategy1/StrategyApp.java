package com.inter.design.strategy1;

public class StrategyApp {

	public static void main(String[] args) {
		Context c= new Context(new MultiplyStrategy());
		System.out.println(c.perform(2, 3));
		
		Context c1= new Context(new AddStrategy());
		System.out.println(c1.perform(2, 3));
				
	}
}
