
package com.inter.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class YieldExample {
	public static void main(String[] args) {
		/*
		 * Producer p = new Producer(); Consumer c = new Consumer();
		 * p.setPriority(Thread.MIN_PRIORITY); c.setPriority(Thread.MAX_PRIORITY);
		 * p.start(); c.start();
		 */
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				myList.remove(value);
		}
	}

}
