package com.demo.inter.queue;

public class QueueUsingLinkedList {
	QNode front;
	QNode rear;

	void enqueue(int data) {
		QNode newNode = new QNode(data);

		if (rear == null) {
			this.rear = this.front = newNode;
			return;
		}

		this.rear.next = newNode;
		this.rear = newNode;
	}
	
	void deQueue() {
		if(this.front == null) {
			return;
		}
		this.front = this.front.next;
	}
	

}
