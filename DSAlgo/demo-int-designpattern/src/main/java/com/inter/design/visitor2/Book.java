package com.inter.design.visitor2;

public class Book implements Visitable {

	int N;
	int price;
	@Override
	public int accept(Visitor vis) {
		return vis.visit(this);
	}

}
