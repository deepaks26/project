package com.demo.inter.stack.practice;

import java.util.Stack;

public class FindElementsArrayGreaterThanRightElement {

	void find(int arr[]) {
		Stack<Integer> st = new Stack();
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && st.peek() < arr[i]) {
				st.pop();
			}
			st.push(arr[i]);
		}
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
