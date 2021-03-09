package com.demo.inter.linkedlist;

public class RemoveDuplicates {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void removeDuplicateFromLinkedList(Node root) {
		Node outer = root;
		while (outer != null) {
			Node inner = outer.next;
			Node prev = outer;
			while (inner != null) {
				if (outer.data == inner.data) {
					prev.next = inner.next;
					inner = inner.next;
				} else {
					prev = inner;
					inner = inner.next;
				}

			}
			outer = outer.next;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicates list = new RemoveDuplicates();
		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(12);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(21);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

		System.out.println("Linked List before removing duplicates : \n ");
		list.printList(head);

		list.removeDuplicateFromLinkedList(head);
		System.out.println("");
		System.out.println("Linked List after removing duplicates : \n ");
		list.printList(head);
	}
}
