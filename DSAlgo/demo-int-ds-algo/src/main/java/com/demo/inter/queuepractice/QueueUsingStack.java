package com.demo.inter.queuepractice;

import java.util.Stack;

public class QueueUsingStack {

	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	//double stack
	static void enqueUsingTwoStack(int data){
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(data);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	static int dequeu() {
		return stack1.pop();
	}
	
	static void enqueUsingSingleStack(int data) {
		stack1.push(data);
	}
	
	static void enqueUsingSingleStackRecur(int data) {
		if(stack1.isEmpty()) {
			stack1.add(data);
			return;
		}
		
		int poped = stack1.pop();
		enqueUsingSingleStackRecur(data);
		stack1.push(poped);
	}
	
	static int dequeUsingSingleStack() {
		int popped = stack1.pop();
		if(stack1.isEmpty()) {
			return popped;
		}
		int data = dequeUsingSingleStack();//1
		stack1.push(popped);
		return data;
		
	}
	public static void main(String[] args) {
		/*
		 * enqueUsingTwoStack(1); enqueUsingTwoStack(2); enqueUsingTwoStack(3);
		 * System.out.println(dequeu()); System.out.println(dequeu());
		 */
		
		enqueUsingSingleStack(1);
		enqueUsingSingleStack(2);
		enqueUsingSingleStack(3);
		System.out.println(dequeUsingSingleStack());
		System.out.println(dequeUsingSingleStack());
	}
	
}
