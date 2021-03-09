package com.inter.design.decorator;

public class PaneerPizza extends Pizza {

	public PaneerPizza() {
		desc = "Paneer Pizza";
	}
	@Override
	public int getCost() {
		return 100;
	}

}
