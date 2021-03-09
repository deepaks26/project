package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class ReverseUsingRecursion {

	static void reverse(Node head) {
		if(head == null) {
			return;
		}
		Node temp = head;
		head = head.next;
		reverse(head);
		merge(head,temp);
	}

	private static void merge(Node head, Node temp) {
		if(head == null) {
			head=temp;
			//return head;
		}else {
			Node temp1 = head;
			temp1.next = temp;
			temp1 = temp1.next;
			//return temp1;
//			Node temp1 = head.next;
//			merge(head.next, temp);
//			temp.next =  temp1;
//			temp = temp.next;
			
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
	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(4);
		reverse(headA);
		printList(headA);
	}
	
}
