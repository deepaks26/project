package com.demo.inter.queue;

import java.util.Stack;

public class QueueUsingSingleStack {

	Stack<Integer> st = new Stack<Integer>();

	void dequeue() {
		if (st.size() == 1) {
			System.out.println(st.pop());
			return;
		}

		int data = st.pop();
		dequeue();
		st.push(data);
	}
	
	void enqueue(int data) {
		st.push(data);
	}
	int getRear() {
		return st.peek();
	}
	public static void main(String[] args) {
		QueueUsingSingleStack qu = new QueueUsingSingleStack();
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		
		
	}
}