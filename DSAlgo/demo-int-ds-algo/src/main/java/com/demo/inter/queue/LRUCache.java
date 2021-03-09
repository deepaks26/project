package com.demo.inter.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {

	private Deque<Integer> deque;
	private HashSet<Integer> set;
	private final int SIZE;

	public LRUCache(int size) {
		this.deque = new LinkedList<Integer>();
		this.set = new HashSet<Integer>();
		this.SIZE = size;
	}

	public void referPage(int page) {
		if (!set.contains(page)) {
			if (deque.size() == SIZE) {
				int last = deque.removeLast();
				set.remove(last);
			}
		} else {
			deque.remove(page);
		}
		deque.push(page);
		set.add(page);
	}

	public void display() {
		Iterator<Integer> itr = deque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {

		List l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			String s = (String) itr.next();

			if (s.equals("A")) {
				// Can remove
				l.remove(s);
				// itr.remove();
			}
			// }
		}
		System.out.println(l);

		/*
		 * List<String> myList = new ArrayList<String>();
		 * 
		 * myList.add("1"); myList.add("2"); myList.add("3"); myList.add("4");
		 * myList.add("5");
		 * 
		 * Iterator<String> it = myList.iterator(); while (it.hasNext()) { String value
		 * = it.next(); System.out.println("List Value:" + value); if
		 * (value.equals("3")) myList.remove(value); }
		 */

	}

}
