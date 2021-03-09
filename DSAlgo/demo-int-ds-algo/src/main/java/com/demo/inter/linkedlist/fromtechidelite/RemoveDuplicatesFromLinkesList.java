package com.demo.inter.linkedlist.fromtechidelite;

public class RemoveDuplicatesFromLinkesList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	static void removeDuplicates(Node head) {
		Node current = head;
		while(current.next != null) {
			if(current.data== current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}
	
	void removeDup(Node head) {
		Node current = head;
		while(current.next != null) {
			if(current.data ==current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
	}
	static void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		removeDuplicates(head);
		print(head);
	}
}
