package com.inter.design.visitor;

public class CartImpl implements CartVisitor{

	@Override
	public int visit(Book book) {
		return book.noOfBooks*book.price;
	}

}
