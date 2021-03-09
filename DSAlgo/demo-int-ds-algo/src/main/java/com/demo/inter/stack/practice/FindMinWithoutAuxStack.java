package com.demo.inter.stack.practice;

import java.util.Stack;

public class FindMinWithoutAuxStack {

	Stack<Integer> st = new Stack<>();
	int min;
	
	void push(int data) {
		if(st.isEmpty()) {
			st.push(data);
			min = data;
		}else if(data>min) {
			st.push(data);
		}else {
			st.push(2*data-min);
			min = data;
		}
	}
	
	void pop() {
		int data = st.peek();
		if(data<min) {
			min = 2*min-data;
		}
		st.pop();
	}
}
