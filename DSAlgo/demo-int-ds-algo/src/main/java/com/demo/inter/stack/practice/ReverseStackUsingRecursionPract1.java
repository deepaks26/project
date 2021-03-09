package com.demo.inter.stack.practice;

import java.util.Stack;

public class ReverseStackUsingRecursionPract1 {

	static Stack<Integer> st = new Stack<>();
	static void rev() {
		if(st.isEmpty()) {
			return;
		}
		int data = st.pop();
		rev();
		insertAtBottm(data);
	}
	static private void insertAtBottm(int data) {
		if(st.isEmpty()) {
			st.push(data);
		}else {
			int d1 = st.pop();
			insertAtBottm(data);
			st.push(d1);
		}
	}
	
	public static void main(String[] args) {
		st.push(1); 
        st.push(2); 
        st.push(3); 
        st.push(4); 
          
        System.out.println("Original Stack"); 
          
        System.out.println(st); 
          
        rev(); 
          
        System.out.println("Reversed Stack"); 
          
        System.out.println(st); 
	}
}
