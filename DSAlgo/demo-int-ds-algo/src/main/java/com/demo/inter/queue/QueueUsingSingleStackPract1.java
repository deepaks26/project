package com.demo.inter.queue;

import java.util.Stack;

public class QueueUsingSingleStackPract1 {

	Stack<Integer> stack = new Stack();
	
	void  deQu() {
		if(stack.size()==1) {
			 System.out.println(stack.pop());
			 return;
		}
		int data = stack.pop();
		deQu();
		stack.push(data);
	}
}
