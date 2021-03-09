package com.demo.inter.stack;

public class ReverseStack {

	public static void main(String[] args) {

	}

	StackNode reverse(StackNode top) {
		StackNode prev = null;
		StackNode next = null;
		StackNode current = top;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		top = prev;
		return top;

	}
}
