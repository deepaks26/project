package com.demo.inter.stack.practice;

public class StackUsingLinkedList {

	Node top;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
		}
		Node temp = top;
		top = newNode;
		top.next = temp;
	}
	
	int pop() {
		if(top==null) {
			return 0;
		}
		int poped= top.data;
		top = top.next;
		return poped;
	}
	
	void traverse(Node root) {
		while(root!= null) {
			System.out.println(root.data + "->");
			root = root.next;
		}
	}
	
}
