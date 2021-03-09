package com.demo.inter.linkedlist;

public class LinkedListApp {
	public static void main(String[] args) {
		LinkedList lnkList = new LinkedList();
		lnkList.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);
		lnkList.head.next = second;
		second.next = third;
		printLinkedList(lnkList);

	}
	
	public static void printLinkedList(LinkedList lnkList) {
		Node head = lnkList.head;
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
