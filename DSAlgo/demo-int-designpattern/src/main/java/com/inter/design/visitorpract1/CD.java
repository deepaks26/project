package com.inter.design.visitorpract1;

public class CD implements Vistable {

	int price;
	
	
	@Override
	public int accpet(Visitor vis) {
		return vis.visit(this);
	}

}
