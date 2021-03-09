package com.inter.design.decorator;

public class DecApp {
	public static void main(String[] args) {

		Pizza paneerPizza = new PaneerPizza();
		 System.out.println( paneerPizza.getDescription() + 
                 " Cost :" + paneerPizza.getCost()); 
		 paneerPizza = new ExtraPaneer(paneerPizza);
		 paneerPizza = new ExtraCheese(paneerPizza);
		 
		 System.out.println( paneerPizza.getDescription() + 
                 " Cost :" + paneerPizza.getCost());

	}
}
