package com.inter.design.decoratorpract;

public class IntialUti extends Utilization {

	public IntialUti(String desc) {
		this.desc = desc;
	}
	@Override
	public int getCost() {
		return 100;
	}

}
