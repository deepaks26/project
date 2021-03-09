package com.inter.design.visitor.prac;

public class VisitorApp {

	public static void main(String[] args) {
		Book book = new Book(5,50);
		CartVisitor vis = new CartImpl();
		System.out.println(book.accept(vis));
	}
}
