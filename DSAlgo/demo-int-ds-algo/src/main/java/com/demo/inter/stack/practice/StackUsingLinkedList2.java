package com.demo.inter.stack.practice;

public class StackUsingLinkedList2 {

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
		if(top==null) {
			top = newNode;
		}else {
			Node tempTop  = top;
			top = newNode;
			top.next = tempTop;
			
		}
	}
	
	int pop() {
		int poped = 0;
		if(top==null) {
			return poped;
		}
		poped = top.data;
		top = top.next;
		return poped;
	}
	boolean isEmpty() {
		return top==null;
	}
	void traverser() {
		while(top!=null) {
			System.out.println(top.data);
			top = top.next;
		}
	}
}

