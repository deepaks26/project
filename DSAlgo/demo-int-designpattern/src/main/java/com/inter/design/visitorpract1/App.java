package com.inter.design.visitorpract1;

public class App {

	public static void main(String[] args) {
		Book book = new Book();
		CD cd = new CD();
		
		book.price = 100;
		cd.price =  200;
		
		VisitorImpl impl = new VisitorImpl();
		book.accpet(impl);
		cd.accpet(impl);
		System.out.println(impl.finalPrice);
	}
}
