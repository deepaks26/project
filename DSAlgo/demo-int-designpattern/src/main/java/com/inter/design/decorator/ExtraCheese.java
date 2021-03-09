package com.inter.design.decorator;

public class ExtraCheese extends Decorator {

	Pizza pizza;
	
	public ExtraCheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription()+"ExtraCheese";
	}

	@Override
	public int getCost() {
		return 80+pizza.getCost();
	}

}
