package com.inter.design.decorator;

public abstract class Pizza {

	String desc = "";

	public String getDescription() {
		return desc;
	}

	
	public abstract int getCost();
}
