package com.inter.immute;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Child1 extends Parent1 {
	private void printMessage()
	{
		System.out.println("World");
	}

	
	
	void work() {
		System.out.println("chil work");
	}
	void run() {
		super.run();
		System.out.println("chil run");
	}
	Optional<String> nam ;
	/*
	 * public Child1(Optional<String> nam ) { this.nam = nam; }
	 */
	
	Optional<String> getName(){
		return nam;
	}
	
	
	public static void main(String[] args) {
		
		Parent1 gfg = new Child1();
		gfg.function();
		
		/*
		 * final StringBuffer sb = new StringBuffer("abc"); sb.append("cde");
		 * System.out.println(sb.toString());
		 */
		
		/*
		 * Parent1 p = new Child1(); p.m2();
		 */
		/*
		 * Child1 ch = new Child1(Optional.ofNullable(null)); Optional<String> op =
		 * ch.getName();
		 */
		//op.ifPresent(System.out::println).orElse("empty");
		/*
		 * ch.m2(new LinkedList<String>()); //ch.m2(); System.out.println(ch.str);
		 */
		
		/*
		 * Parent1 p = new Child1(); // p.m2(); p.run();
		 */Child1 c = new Child1();
		  
		  System.out.println(c instanceof Child1);
		  
		  System.out.println(c instanceof Parent1);
		  System.out.println(c instanceof Child11);
		 
		 
	}
	String str ="a";
	public static void m2() {
		System.out.println("child");
	}
	
	public void m3() {
		str +="c";
	}
	/*
	 * void m1() { System.out.println("child"); }
	 */
}
