package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.SplitLinkedListTwoHalves.Node;

public class ReverseLinkedList {

	static Node reverse(Node head) {
		Node prev=null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	Node rev(Node head) {
		Node prev =null;
		Node next = null;
		Node current= head;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	public static void printList(Node head) {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " �> ");
			ptr = ptr.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(4);
		headA.next.next.next = new Node(5);
		headA.next.next.next.next = new Node(10);
		printList(reverse(headA));
	}

}
