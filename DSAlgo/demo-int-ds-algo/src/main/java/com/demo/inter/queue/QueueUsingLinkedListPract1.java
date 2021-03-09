package com.demo.inter.queue;

public class QueueUsingLinkedListPract1 {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node rear;
	Node front;
	
	void enquue(int data) {
		Node node  = new Node(data);
		if(rear== null) {
			rear = node;
			front = node;
		}else {
			rear.next = node;
			rear =  rear.next;
		}
	}
	
	int dequeue() {
		if(front== null) {
			return -1;
		}
		int data = front.data;
		front =  front.next;
		return data;
		
	}
}