package com.demo.inter.stack.practice;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Stack<Integer> auxStack = new Stack<Integer>();
	
	public void push(int data) {
		if(isEmpty()) {
			super.push(data);
			auxStack.push(data);
		}else {
			super.push(data);
			int y = auxStack.pop();
			auxStack.push(y);
			if(data<y) {
				auxStack.push(data);
			}else {
				auxStack.push(y);
			}
		}
	}
	
	public Integer pop() {
		int x = super.pop();
		auxStack.pop();
		return x;
	}
	
	public Integer findMin() {
		return auxStack.peek();
	}
	
	public static void main(String[] args) {
		SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.findMin());
        s.push(5);
        System.out.println(s.findMin());
	}
}
