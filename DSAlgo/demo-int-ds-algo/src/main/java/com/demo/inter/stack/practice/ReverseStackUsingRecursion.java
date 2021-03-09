package com.demo.inter.stack.practice;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	static Stack<Integer> st = new Stack<>();
	
	static void reverseStack() {
		if(st.isEmpty()) {
			return;
		}
		Integer in = st.peek();
		st.pop();
		reverseStack();
		insertAtBottom(in);
	}

	private static void insertAtBottom(Integer in) {
		if(st.isEmpty()) {
			st.push(in);
		}else {
			Integer in1= st.peek();
			st.pop();
			insertAtBottom(in);
			st.push(in1);
		}
		
	}
	
	public static void main(String[] args) {
		st.push(1); 
        st.push(2); 
        st.push(3); 
        st.push(4); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(st); 
          
        reverseStack(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(st); 
	}
}
