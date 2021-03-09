package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class FindKthNodeFromEnd {

	static int findKthNodeFromEnd(Node head,int k) {
		Node temp = head;
		Node ref = head;
		int count=0;
		while(count<k) {
			temp = temp.next;
			count++;
		}
		
		while(temp != null) {
			ref =  ref.next;
			temp = temp.next;
		}
		
		return ref.data;
	}
	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(4);
		headA.next.next.next = new Node(5);
		headA.next.next.next.next = new Node(10);
		System.out.println(findKthNodeFromEnd(headA,2));
	}
	
	
}
