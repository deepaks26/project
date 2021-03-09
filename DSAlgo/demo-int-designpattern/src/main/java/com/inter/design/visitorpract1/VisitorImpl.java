package com.inter.design.visitorpract1;

public class VisitorImpl implements Visitor {

	int finalPrice;
	
	@Override
	public int visit(Book book) {
		finalPrice = finalPrice+book.price;
		return finalPrice;
	}

	@Override
	public int visit(CD cd) {
		finalPrice = finalPrice+cd.price;
		return finalPrice;
	}

}
