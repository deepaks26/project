package com.inter.design.decoratorpract;

public class CopayUtilization extends Decorator {

	Utilization util;
	public CopayUtilization(Utilization util) {
		this.util = util;
	}
	@Override
	public String getDesc() {
		return util.desc+"copay";
	}

	@Override
	public int getCost() {
		return util.getCost()+250;
	}

}
