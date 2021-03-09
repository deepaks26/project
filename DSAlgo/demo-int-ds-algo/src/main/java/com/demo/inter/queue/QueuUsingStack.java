package com.demo.inter.queue;

import com.demo.inter.stack.StackUsingLinkedList;

public class QueuUsingStack {

	StackUsingLinkedList stack1 = new StackUsingLinkedList();
	StackUsingLinkedList stack2 = new StackUsingLinkedList();

	void enQueue(int x) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop(stack1));
		}

		stack1.push(x);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop(stack2));
		}
	}

	int deQueue() {
		if (stack1.isEmpty()) {
			return 0;
		}
		int item = stack1.pop(stack1);
		return item;
	}

	void display() {
		stack1.printStack(stack1);
	}

	public static void main(String[] args) {
		QueuUsingStack queu1 = new QueuUsingStack();
		queu1.enQueue(1);
		queu1.enQueue(2);
		queu1.enQueue(3);
		queu1.display();
		queu1.deQueue();
		System.out.println("---------------------");
		queu1.display();
		
	}

}
