package com.demo.inter.stack.practice;

import java.util.Stack;

public class SortStackUsingRecursion {

	static Stack<Integer> stack = new Stack();
	static Stack<Integer> auxStack = new Stack();

	static void sortStack() {
		if (stack.isEmpty()) {
			return;
		}

		Integer in = stack.peek();
		stack.pop();
		sortStack();
		sortUsingAuxStack(in);
	}

	private static void sortUsingAuxStack(Integer in) {
		if (stack.isEmpty()) {
			stack.push(in);
		} else if (stack.peek() < in) {
			stack.push(in);
		} else {
			Integer in1 = stack.peek();
			stack.pop();
			sortUsingAuxStack(in);
			stack.push(in1);
		}

	}

	public static void main(String[] args) {
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(4);
		System.out.println("Original Stack");
		System.out.println(stack);
		sortStack();
		System.out.println("Sort Stack");
		System.out.println(stack);
	}

}
