package com.inter.design.visitor;

public class Book implements ItemElement{

	int noOfBooks;
	int price;
	
	public Book(int noOfBooks,int price) {
		this.noOfBooks = noOfBooks;
		this.price = price;
	}

	@Override
	public int accpet(CartVisitor vistor) {
		return vistor.visit(this);
	}
	
}
