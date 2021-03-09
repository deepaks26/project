package com.demo.inter.queue;

public class QueueUsingArray {

	int front;
	int rear;
	int array[];
	int capacity;
	int size;

	public QueueUsingArray(int capacity) {
		this.front = size = 0;
		this.capacity = capacity;
		this.rear = this.capacity - 1;
		this.array = new int[capacity];
	}

	boolean isFull(QueueUsingArray queue) {
		return queue.size == queue.capacity;
	}

	boolean isEmty(QueueUsingArray queue) {
		return queue.size == 0;
	}

	void enqueue(int item) {
		if (isFull(this)) {
			return;
		}
		this.rear = (this.rear + 1) % this.capacity;
		this.array[rear] = item;
		this.size++;
		System.out.println(item + "enqued");
	}

	int dequeue() {
		if (isEmty(this)) {
			return 0;
		}
		int item = this.array[front];
		this.front = (this.front+1)%this.capacity;
		this.size--;
		return item;
	}
	void display() {
		for(int i = this.front;i<=this.rear;i++) {
			System.out.println(this.array[i]);
		}
	}
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(4);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();
		
		queue.dequeue();
		queue.display();
	}

}
