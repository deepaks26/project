package com.demo.inter.queuepractice;

public class QueueUsingArray {

		int arr[];
		int size;
		int rear;
		int front;
		int capacity;
		
		public QueueUsingArray(int capacity) {
			this.capacity = size;
			this.rear = capacity-1;
			this.front = 0;
			this.arr = new int[capacity];
		}
		void enque(int item) {
			rear = (rear+1)%capacity;
			arr[rear] = item;
			size++;
		}
		
		int deQueue() {
			int item = arr[front];
			front = (front+1)%capacity;
			size--;
			return item;
		}
		
		void display() {
			for(int i=front;i<rear;i++) {
				System.out.println(arr[i]);
			}
		}
		
}
