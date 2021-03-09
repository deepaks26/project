package com.demo.inter.stack.practice;

import java.util.Stack;

public class CustomDSWithO1Pract1 {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Stack<Integer> auxStack = new Stack<>();
	Node head;
	Node tail;
	Node mid;
	int size = 0;
	int minElement = 0;

	void push(int data) {
		Node newNode = new Node(data);
		newNode.next = tail;
		size++;
		if (size == 1) {
			head = newNode;
			mid = newNode;
			minElement = data;
			auxStack.push(data);
		} else {
			tail.prev = newNode;
			if (size % 2 != 0) {
				mid = mid.prev;
			}
			int y = auxStack.pop();
			if (data < y) {
				auxStack.push(data);
			} else {
				auxStack.push(y);
			}
		}
		tail = newNode;
	}

	int removeFirst() {
		int poped = tail.data;
		tail = tail.next;
		tail.prev = null;
		size--;
		if (size % 2 == 0) {
			mid = mid.next;
		}
		return poped;
	}

	int removeLast() {
		int data = head.data;
		head = head.prev;
		head.next = null;
		size--;
		if (size % 2 != 0) {
			mid = mid.prev;
		}
		return data;
	}
}
