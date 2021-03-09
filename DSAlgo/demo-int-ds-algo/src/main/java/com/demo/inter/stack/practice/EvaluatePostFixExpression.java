package com.demo.inter.stack.practice;

import java.util.Stack;

public class EvaluatePostFixExpression {

	static Stack<Integer> st = new Stack();
	static int eval(String exp) {
		 for(int i=0;i<exp.length();i++) {
			 if(Character.isDigit(exp.charAt(i))) {
				 st.add(Character.getNumericValue(exp.charAt(i)));
			 }else {
				 int x = st.pop();
				 int y = st.pop();
				char c =  exp.charAt(i);
				 if (c == '+') {
					 st.push(y + x);
	                }
	                else if (c == '-') {
	                	st.push(y - x);
	                }
	                else if (c == '�') {
	                	st.push(y * x);
	                }
	                else if (c == '/') {
	                	st.push(y / x);
	                }
			 }
		 }
		 return st.peek();
	 }
	
	 public static void main(String[] args)
	    {
	        String exp = "138�+";
	        System.out.println(eval(exp));
	    }
}