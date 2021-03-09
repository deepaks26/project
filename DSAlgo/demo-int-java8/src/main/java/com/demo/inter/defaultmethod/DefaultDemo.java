package com.demo.inter.defaultmethod;

//@FunctionalInterface
public interface DefaultDemo {

	/*default void move() {
		System.out.println("interface invoked");
	}
	
	default void move1() {
		System.out.println("interface invoked");
	}*/
	
	default boolean move2() {
		System.out.println("interface invoked");
		return true;
	}
	
	//void move3();
	
}


