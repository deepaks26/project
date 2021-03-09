package com.demo.inter.stack.practice;

public class MergeStackUsingCircularLinkedListPract1 {

	static class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data =  data;
		}
	}
	
	Node head;
	Node tail;
	
	void push(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
		}else {
			node.next =  tail;
			tail.prev = node;
			tail = node;
		}
	}
	
	int pop() {
		int data =  tail.data;
		Node temp = tail.next;
		tail.next = null;
		tail = temp;
		tail.prev = null;
		return data;
	}
	
	void merge(MergeStackUsingCircularLinkedListPract1 st2) {
	 head.next = st2.tail;
	 st2.tail.prev = head;
	 head = st2.head;
	 st2.tail = st2.head =  null;
	 
	}
	
}

