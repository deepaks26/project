package com.inter.immute;

import java.util.List;

public class Parent1 {

	private void printMessage()
	{
	System.out.println("Hello");
	}
	public void function()
	{
	 printMessage();
	}
	

	void work() {
		System.out.println("parent work");
	}
	void run() {
		work();
		System.out.println("parent run");
	}
	
	
	/*
	 * static void m1() { System.out.println("parent"); }
	 */

	public static void m2() {
		System.out.println("Parent");
	}

	/*
	 * void m2(Child1 p) { System.out.println("Child"); float f = (float) 1.2; int t
	 * = (int) f; System.out.println(t);
	 * 
	 * }
	 * 
	 * 
	 * int m3() { return 1; }
	 * 
	 * void tests3() { System.out.println("Fest class : tests3"); }
	 * 
	 * static void tests3() { System.out.println("Fest class : static tests3");
	 * //<-- gives "method tests3() is already defined in class Fest" }
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * try { throw new StackOverflowError(); } catch (Error e) {
	 * System.out.println("caught"); } System.out.println("post catch");
	 * 
	 * 
	 * Parent1 p = new Parent1(); p.m2(p);
	 * 
	 * 
	 * Parent1 p1 = new Child1(); p.m2(p1);
	 * 
	 * Child1 c1 = new Child1(); p.m2(c1);
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.m2();
	}
}
