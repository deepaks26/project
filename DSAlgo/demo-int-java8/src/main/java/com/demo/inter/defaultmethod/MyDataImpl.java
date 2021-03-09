package com.demo.inter.defaultmethod;

public class MyDataImpl implements MyData {

	public boolean isNull(String str) {
		System.out.println("My data Impl Null Check");

		return str == null ? true : false;
	}

	/*
	 * public void print(String str) { if (!isNull(str))
	 * System.out.println("MyDataImpl Print::" + str); }
	 */

	public static void main(String args[]) {
		/*
		 * MyData obj = (s) -> System.out.print(s) ; obj.print("abc");
		 */
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}

	@Override
	public void printFunc(String s) {
		System.out.println("do nothing");

	}
}
