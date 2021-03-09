package com.demo.inter.linkedlist.fromtechidelite;

public class SplitAlternate {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}

	public static void printList(Node head) {

		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " —> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

	public static void alternatingSplit(Node head) {
		Node nodeA = new Node(0);
		Node tempA = nodeA;
		Node nodeB = new Node(0);
		Node tempB = nodeB;
		Node current = head;
		while(current != null) {
			Node newNode  = current;
			current = current.next;
			
			newNode.next = tempA.next;
			tempA.next = newNode;
			tempA = tempA.next;
			
			if(current != null) {
				newNode  = current;
				current = current.next;
				
				newNode.next = tempB.next;
				tempB.next = newNode;
				tempB = tempB.next;
				
			}
		}
		printList(nodeA.next);
		printList(nodeB.next);
	}
	
	
	public static void alternatingSplitOddEven(Node head) {
		Node nodeA = new Node(0);
		Node tempA = nodeA;
		Node nodeB = new Node(0);
		Node tempB = nodeB;
		Node current = head;
		while(current != null) {
			
			if(current.data % 2==0) {
				Node newNode  = current;
				current = current.next;
				
				newNode.next = tempA.next;
				tempA.next = newNode;
				tempA = tempA.next;
			}else {
				Node newNode  = current;
				current = current.next;
				
				newNode.next = tempB.next;
				tempB.next = newNode;
				tempB = tempB.next;
			}
			
			
		}
		printList(nodeA.next);
		printList(nodeB.next);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(4);
		head.next.next.next = new Node(3);
		alternatingSplit(head);
	}
}
