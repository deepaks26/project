package com.inter.thread;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
	List<Integer> queue = new LinkedList<>();
	int capacity = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (queue.size() == capacity)
					wait();
				System.out.println("Producer produced-" + value);

				queue.add(value++);
				notify();

				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (queue.isEmpty())
					wait();
				int val = queue.remove(0);

				System.out.println("Consumer consumed-" + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		
		System.out.println(a[0][0]);
	}
	
}
