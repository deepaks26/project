package com.demo.inter.stack.practice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

	Queue<Integer> qu = new LinkedList<Integer>();

	public void push(int data) {
		qu.add(data);
		for (int i = 0; i < qu.size() - 1; i++) {
			qu.add(qu.remove());
		}
	}

	public int pop() {
		return qu.remove();
	}

	int top() {
		if (qu.isEmpty())
			return -1;
		return qu.peek();
	}

	public static void main(String[] args) {
		StackUsingSingleQueue s = new StackUsingSingleQueue();
		s.push(10);
		s.push(20);
		System.out.println("Top element :" + s.top());
		s.pop();
		s.push(30);
		s.pop();
		System.out.println("Top element :" + s.top());
	}
}
