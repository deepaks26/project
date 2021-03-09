package com.demo.inter.linkedlist;

import com.demo.inter.linkedlist.FindNthElementFromEnd.Node;

public class FindNthElementFromEndPract {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	int findNthElemFromEnd(Node root, int N) {
		int count = 0;
		Node ref = root;
		Node head = root;
		while (count < N) {
			ref = ref.next;
			count++;
		}

		while (ref != null) {
			head = head.next;
			ref = ref.next;
		}
		return head.data;

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

	}
}
