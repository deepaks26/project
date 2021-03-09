package com.inter.overlaod;

public interface Inter2 {
	default void addDef(int a, int b) {
		System.out.println(222);
	}
	
	//int subDef(int a, float b);
}
