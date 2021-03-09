package com.inter.design.iterator;

public class IteratorApp {

	public static void main(String[] args) {
		CustomCollection cc = new CustomCollection();
		Iterator itr = cc.getIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}