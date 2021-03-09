package com.demo.inter.stack;

public class StackUsingArray {
	int maxLength = 10;
	int top;
	int stackArr[] = new int[maxLength];

	public StackUsingArray() {
		top = -1;
	}
	public boolean isEmpty() {
		return top<0;
	} 
	
	public boolean push(int elem) {
		if(top>=maxLength) {
			return false;
		}else {
			stackArr[++top] = elem;
			return true;
		}
	}

	/*
	 * //TODO public boolean pop(int elem) { if(top<0) { return false; }else {
	 * stackArr[++top] = elem; return true; } }
	 */
	public static void main(String[] args) {

	}
}