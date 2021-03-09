package com.inter.design.visitor2;

public class VisitApp {

	public static void main(String[] args) {
		Book b= new Book();
		b.N = 10;
		b.price = 100;
		
		CD cd =  new CD();
		cd.N = 5;
		cd.price =  500;
		
		VisitorImpl v = new VisitorImpl();
		b.accept(v);
		cd.accept(v);
		
		System.out.println(v.totalPrice);
	}
}
