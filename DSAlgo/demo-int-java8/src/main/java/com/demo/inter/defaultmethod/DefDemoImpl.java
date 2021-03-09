package com.demo.inter.defaultmethod;

public class DefDemoImpl implements DefaultDemo {

	
	
	public static void main(String[] args) {
		DefaultDemo impl  =  new DefDemoImpl();
		impl.move2();
	}
	
	public boolean move2() {
		System.out.println("class moved");
		return true;
	}
	
//	public void move3() {
//		System.out.println("class called");
//	}
//	
//	public void move() {
//		System.out.println("class moved");
//	}
	
	
}
