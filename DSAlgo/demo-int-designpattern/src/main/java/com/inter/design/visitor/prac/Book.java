package com.inter.design.visitor.prac;

public class Book implements Item {

	int noOfBook;
	int price;

	public Book(int noOfBook, int price) {
		this.noOfBook = noOfBook;
		this.price = price;
	}

	@Override
	public int accept(CartVisitor cart) {
		return cart.visit(this);
	}

}
