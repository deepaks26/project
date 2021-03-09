package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class RearrangeSecondGreaterThanLeftAndRight {

	static Node rearrange(Node head) {
		Node prev = head;
		Node current = head.next;
		while (current != null) {
			if (prev.data > current.data) {
				int temp = prev.data;
				prev.data = current.data;
				current.data = temp;
			}

			if (current.next != null && current.next.data > current.data) {
				int temp = current.next.data;
				current.next.data = current.data;
				current.data = temp;
			}
			prev = current.next;
			if (current.next == null) {
				break;
			}

			current = current.next.next;
		}

		return head;
	}
	Node rearrangePract(Node head) {
		Node prev = head;
		Node current = head.next;
		while(current != null) {
			if(prev.data>current.data) {
				int temp = prev.data;
				prev.data = current.data;
				current.data = temp;
			}
			if(current.next != null && current.next.data>current.data) {
				int temp = current.data;
				current.data =current.next.data;
				current.next.data = temp;
			}
			if(current.next == null) {
				break;
			}
			prev =  current.next;
			current = current.next.next;
		}
		return head;
	}

	static void printList(Node headref) {
		while (headref != null) {
			System.out.print(headref.data + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(3);
		headA.next.next.next = new Node(4);
		headA.next.next.next.next = new Node(5);
		headA.next.next.next.next.next = new Node(6);
		headA.next.next.next.next.next.next = new Node(7);
		printList(rearrange(headA));

	}
}
