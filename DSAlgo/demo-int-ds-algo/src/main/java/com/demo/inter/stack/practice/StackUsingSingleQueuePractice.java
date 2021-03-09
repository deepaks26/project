package com.demo.inter.stack.practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueuePractice {

	static Queue<Integer> qu= new LinkedList<Integer>();
	
	static void push(int data) {
		qu.add(data);
		for(int i=0;i<qu.size()-1;i++) {
			qu.add(qu.remove());
		}
	}
	
	static int pop() {
		return qu.remove();
	}
}
