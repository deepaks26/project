package com.inter.immute;

public class Child11 extends Child1 {

	static String str;
	public void Child11() {
		System.out.println("In con");
		str = "hell";
	}
	
	public static void main(String[] args) {
		Child11 ch = new Child11();
		System.out.println(str);
	}
}


