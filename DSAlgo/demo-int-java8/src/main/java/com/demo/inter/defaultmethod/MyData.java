package com.demo.inter.defaultmethod;

@FunctionalInterface
public interface MyData {
	
	void printFunc(String s);
	
	default void print(String str) {
		if (!isNull(str))
			System.out.println("MyData Interface Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
