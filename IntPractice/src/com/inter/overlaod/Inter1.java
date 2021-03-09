package com.inter.overlaod;

public interface Inter1 {

	//int add();
	
	default void addDef(int a, int b) {
		System.out.println(111);
	}
	
	//void subDef(int a, float b);
}
