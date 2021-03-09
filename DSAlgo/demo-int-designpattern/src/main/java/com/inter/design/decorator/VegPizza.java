package com.inter.design.decorator;

public class VegPizza extends Pizza {

	@Override
	public int getCost() {
		return 200;
	}

	private VegPizza() {
		desc = "Veg Pizza";
	}

}
