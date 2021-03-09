package com.demo.inter.queuepractice;

public class QueueUsingLinkedList {

	Node rear;
	Node front;
	
	static class Node<T>{
			T data;
			Node next;
			
			Node(T data){
				this.data = data;
			}
	}
	
	void enque(int data) {
		Node<Integer> newNode = new Node(1);
		if(rear==null) {
			rear = newNode;
			front  = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	int dequeu() {
		int data = (Integer) front.data;
		front = front.next;
		return data;
	}
	
	
}
