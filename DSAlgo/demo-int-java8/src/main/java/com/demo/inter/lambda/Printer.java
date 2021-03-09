package com.demo.inter.lambda;

@FunctionalInterface
public interface Printer<T> {

	void print(String s);
	
	default void printDef(String s) {
		System.out.println(s);
	}
	
	boolean equals(Object o);
	//int hashCode
}
