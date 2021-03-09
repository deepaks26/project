package com.inter.design.visitor2;

public class VisitorImpl implements Visitor {

	int totalPrice;
	
	@Override
	public int visit(Book book) {
		totalPrice += book.N*book.price;
		return totalPrice;
	}

	@Override
	public int visit(CD cd) {
		totalPrice +=cd.N*cd.price;
		return totalPrice;
	}

}
