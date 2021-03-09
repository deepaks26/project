package com.inter.design.decoratorpract;

public class DecApp {

	public static void main(String[] args) {
		Utilization util1 = new IntialUti("init");
		util1 = new CopayUtilization(util1);
		System.out.println(util1.getDesc()+ " " + util1.getCost());
		
	}
	
}
