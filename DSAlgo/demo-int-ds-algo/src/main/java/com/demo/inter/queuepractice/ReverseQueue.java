package com.demo.inter.queuepractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	static void reverse(Queue<Integer> qu) {
		Stack<Integer> stack = new Stack<Integer>();
		while(!qu.isEmpty()) {
			stack.push(qu.remove());
		}
		
		while(!stack.isEmpty()) {
			qu.add(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.add(1);
		qu.add(2);
		qu.add(3);
		System.out.println(qu);
		reverse(qu);
		System.out.println(qu);
	}
}
