package com.demo.inter.lambda;

public class PrintApp {

	public static void main(String[] args) {

		Printer<String> print = (a) -> {
			System.out.println(a);
		};
		String s = "abc";
		print.print(s);
		print.printDef(s);
		
		int a[][] = new int[2][1];
		a[0][0] = 1;
		System.out.println(a.length);
		
		
		
		      Integer i = new Integer(10); 
		      Integer j = new Integer(20); 
		      swap(i, j); 
		      System.out.println("i = " + i + ", j = " + j); 

	}
	
	public static void swap(Integer i, Integer j)  
	   { 
	     // Integer temp = i;
	      i = 20;
	     // j = temp; 
	   } 

}
