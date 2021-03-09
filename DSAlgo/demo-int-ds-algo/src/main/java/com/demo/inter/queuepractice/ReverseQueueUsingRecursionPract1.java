package com.demo.inter.queuepractice;

import java.util.LinkedList;
import java.util.Queue;


public class ReverseQueueUsingRecursionPract1 {

	Queue<Integer> qu =  new LinkedList();
	
	void rev() {
		if(qu.isEmpty()) {
			return;
		}
		int front =  qu.remove();
		rev();
		qu.add(front);
	}
}
