package com.demo.inter.queuepractice;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueueUsingRecursion {

	static void revUsingRecusrion(Queue<Integer> qu){
		if(qu.isEmpty()) {
			return;
		}
		int front = qu.remove();
		revUsingRecusrion(qu);
		qu.add(front);
	}
	
	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		qu.add(2);
		qu.add(3);
		System.out.println(qu);
		revUsingRecusrion(qu);
		System.out.println(qu);
	}
}
