package com.demo.inter.queue;

public class QNode {

	int data;
	QNode next;

	public QNode(int key) {
		this.data = key;
		this.next = null;
	}
}
