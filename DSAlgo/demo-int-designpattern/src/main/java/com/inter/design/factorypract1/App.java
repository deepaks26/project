package com.inter.design.factorypract1;

public class App {

	public static void main(String[] args) {
		Factory fact =  new Factory();
		CloudStorage store = fact.get("AWS");
		store.write("ABC");
		System.out.println(store.read());
	}
}
