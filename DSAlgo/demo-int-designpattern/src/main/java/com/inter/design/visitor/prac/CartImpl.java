package com.inter.design.visitor.prac;

public class CartImpl implements CartVisitor{

	@Override
	public int visit(Book book) {
		return book.noOfBook*book.price;
	}

}
