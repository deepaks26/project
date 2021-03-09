package com.demo.inter.stack.practice;

import java.util.Stack;

public class ReverseNumberUsingStackPract1 {

	static int reverse(int num) {
		Stack<Integer> st = new Stack();
		while(num != 0) {
			st.push(num%10);
			num = num/10;
		}
		
		int i =1;
		int result = 0;
		while(!st.isEmpty()) {
			result = result + st.pop()*i;
			i = i*10;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
}
