package com.demo.inter.stack.practice;

import java.util.Stack;

public class SortStackUsingRecursionPract1 {

	static Stack<Integer> stack =  new Stack<>();
	
	static void  sort() {
		if(stack.isEmpty()) {
			return;
		}
		int d = stack.pop();
		sort();
		merge(d);
	}

	private static void merge(int d) {
		if(stack.isEmpty()) {
			stack.push(d);
		}else if(stack.peek()<d) {
			stack.push(d);
		}else {
			int d1 =  stack.pop();
			merge(d);
			stack.push(d1);
		}
	}
	
	public static void main(String[] args) {
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		System.out.println("Original Stack");
		System.out.println(stack);
		sort();
		System.out.println("Sort Stack");
		System.out.println(stack);
	}
}
