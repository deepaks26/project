package com.inter.design.decorator;

public class ExtraPaneer extends Decorator {

	Pizza pizza;
	
	public  ExtraPaneer(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+"ExtraPaneer";
	}

	@Override
	public int getCost() {
		return 70+pizza.getCost();
	}

}
