package com.demo.inter.linkedlist.fromtechidelite;

public class SplitLinkedListTwoHalves {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static void split(Node head) {

		/*
		 * Node slow = source; Node fast = source.next;
		 * 
		 * // advance `fast` two nodes and `slow` by one node while (fast != null) {
		 * fast = fast.next; if (fast != null) { slow = slow.next; fast = fast.next; } }
		 */

		Node slow = head;
		Node fast = head;
		while (slow != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}

		Node first = head;
		Node second = slow.next;
		slow.next = null;
		printList("Front List: ", first);
		printList("Back List: ", second);
	}

	public static void printList(String msg, Node head) {
		System.out.print(msg);

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		split(head);
	}
}
