package com.demo.inter.stack.practice;

import java.util.Stack;

public class ExpressionMatcher {

	public static void main(String[] args) 
    { 
        String expr = "([{}])"; 
  
        // Function call 
        if (isBalancedExpression(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
    } 
	static boolean  isBalancedExpression(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
				stack.push(exp.charAt(i));
				continue;
			}
			
			char poped = stack.pop();
			switch (exp.charAt(i)) {
			case ')':
				if(poped == '{' || poped == '[') {
					return false;
				}
				break;
			case '}':
				if(poped == '(' || poped == '[') {
					return false;
				}
				break;
			case ']':
				if(poped == '(' || poped == '{') {
					return false;
				}
				break;
			}
			
		}
		
		return  stack.isEmpty(); 
	}
}
