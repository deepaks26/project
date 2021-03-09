package com.demo.inter.stack.practice;

import java.util.Stack;

public class ExpressionMatcherPract1 {

	boolean findExpMatch(String exp) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
				stack.push(exp.charAt(i));
				continue;
			}
			char ch = stack.pop();
			switch (exp.charAt(i)) {
			case ')':
				if (ch == '{' || ch == '[') {
					return false;
				}
				break;

			case '}':
				if (ch == '(' || ch == '[') {
					return false;
				}
				break;
			case ']':
				if (ch == '(' || ch == '{') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}
}
