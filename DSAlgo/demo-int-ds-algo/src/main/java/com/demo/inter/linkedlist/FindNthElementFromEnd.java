package com.demo.inter.linkedlist;

public class FindNthElementFromEnd {

	/*
	 * class MyThread extends Thread{ public MyThread() {
	 * System.out.println("My Thread"); // TODO Auto-generated constructor stub }
	 * public void run() { System.out.println("Bar"); } public void run(String s) {
	 * System.out.println("Baz"); }
	 * 
	 * }
	 */

	static Node root;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	static int findNthElementFromTail(int N) {
		Node headPoint = root;
		Node refPoint = root;
		int count = 0;
		while (count < N) {
			refPoint = refPoint.next;
			count++;
		}
		while (refPoint != null) {
			headPoint = headPoint.next;
			refPoint = refPoint.next;
		}
		return headPoint.data;
	}

	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = root;

		/* 4. Move the head to point to new Node */
		root = new_node;
	}

	/* Driver program to test above methods */
	public static void main(String[] args) {

		FindNthElementFromEnd llist = new FindNthElementFromEnd();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		System.out.println(llist.findNthElementFromTail(3));

		/*
		 * Thread t = new MyThread() { public void run() { System.out.println("Foo"); }
		 * }; t.start();
		 */
	}
}
