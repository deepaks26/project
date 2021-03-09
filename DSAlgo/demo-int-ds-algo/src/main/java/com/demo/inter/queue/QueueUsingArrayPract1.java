package com.demo.inter.queue;

public class QueueUsingArrayPract1 {

	int arr[];
	int size;
	int capacity;
	int rear;
	int front;
	QueueUsingArrayPract1(int capacity){
		this.capacity = capacity;
		this.front = 0;
		this.rear= capacity-1;
		arr = new int[capacity];
	}
	
	void enqueu(int data) {
		this.rear = (this.rear+1)% this.capacity;
		arr[rear]= data;
		size++;
	}
	
	int deque() {
		int data =  arr[front];
		front = (front+1)%capacity;
		size--;
		return data;
	}
	
}
