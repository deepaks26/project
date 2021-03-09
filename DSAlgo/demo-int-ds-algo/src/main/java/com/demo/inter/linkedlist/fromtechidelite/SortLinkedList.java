package com.demo.inter.linkedlist.fromtechidelite;

/**
 * 
 * @author deepsahoo
 *
 */
public class SortLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	static Node sortLinkedList(Node head) {
		Node result = null;
		Node temp = head;
		while (temp != null) {
			result = insertAtSorted(result, temp.data);
			temp = temp.next;
		}
		return result;
	}

	static Node insertAtSorted(Node result, int data) {
		Node current = result;
		if (result == null) {
			result = new Node(data);
			return result;
		}
		while (current.next != null && current.next.data < data) {
			current = current.next;
		}
		Node temp = new Node(data);
		temp.next = current.next;
		current.next = temp;
		return result;
	}

	static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(3);
		print(sortLinkedList(head));
	}
}
