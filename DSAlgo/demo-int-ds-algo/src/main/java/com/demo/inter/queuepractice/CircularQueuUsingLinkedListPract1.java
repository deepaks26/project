package com.demo.inter.queuepractice;

public class CircularQueuUsingLinkedListPract1 {

	int charCount;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node front;
	Node rear;
	
	 void enq(int data) {
		 
		 Node node =  new Node(data);
		 rear.next = node;
		 rear = rear.next;
		 rear.next =  front;
	 }
	 int dequ() {
		 int data = front.data;
		 front = front.next;
		 rear.next = front;
		 return data;
	 }

}
