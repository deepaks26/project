package com.demo.inter.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> qlist1 = new LinkedList<Integer>();
	Queue<Integer> qlist2 = new LinkedList<Integer>();
	
	void push(int x) {
		while(!qlist1.isEmpty()) {
			qlist2.add(qlist1.poll());
		}
		
		qlist1.add(x);
		
		while(!qlist2.isEmpty()) {
			qlist1.add(qlist2.poll());
		}
	}
	
}
