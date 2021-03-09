package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.SplitLinkedListTwoHalves.Node;

public class MoceEvenNodeToTheEndInReverseOrder {

	static Node move(Node head) {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node current = head;
		while (current != null) {
			// even
			if (current.data % 2 == 0) {
				if (evenStart == null && evenEnd == null) {
					evenStart = new Node(current.data);
					evenEnd = evenStart;
				} else {
					Node newNode = new Node(current.data);
					newNode.next = evenStart;
					evenStart = newNode;
				}
			} else {
				if (oddStart == null && oddEnd == null) {
					oddStart = new Node(current.data);
					oddEnd = oddStart;
				} else {
					oddEnd.next = new Node(current.data);
					oddEnd = oddEnd.next;
				}

			}
			current = current.next;
		}
		oddEnd.next = evenStart;
		head = oddStart;
		return head;
	}

	static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		head = move(head);
		printList(head);
	}
}
