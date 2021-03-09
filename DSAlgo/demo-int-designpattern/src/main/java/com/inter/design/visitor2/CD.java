package com.inter.design.visitor2;

public class CD implements Visitable{

	int N;
	int price;
	
	@Override
	public int accept(Visitor vis) {
		return vis.visit(this);
	}

}
