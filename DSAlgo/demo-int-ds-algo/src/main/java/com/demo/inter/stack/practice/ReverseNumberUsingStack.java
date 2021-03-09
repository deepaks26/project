package com.demo.inter.stack.practice;

import java.util.Stack;

public class ReverseNumberUsingStack {

	static Stack<Integer> st = new Stack<Integer>();

	static int reverseNum(int num) {
		while (num != 0) {
			st.push(num % 10);
			num = num / 10;
		}

		int i = 1;
		int reverse = 0;
		while (!st.isEmpty()) {
			reverse = reverse + st.pop() * i;
			i = i * 10;
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNum(123));
	}
}
