package com.inter.design.visitorpract1;

public class Book implements Vistable {

	int price;
	@Override
	public int accpet(Visitor vis) {
		return vis.visit(this); 
	}

}
