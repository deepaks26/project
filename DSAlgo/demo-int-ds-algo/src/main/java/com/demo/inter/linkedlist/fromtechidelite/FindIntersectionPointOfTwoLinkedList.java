package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.SplitLinkedListTwoHalves.Node;

public class FindIntersectionPointOfTwoLinkedList {

	static int findIntersectionPoint(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		int l1 = 0;
		int l2 = 0;
		while(temp1 != null) {
			l1++;
			temp1 =  temp1.next;
		}
		while(temp2 != null) {
			l2++;
			temp2 = temp2.next;
		}
		temp1 = head1;
		temp2 = head2;
		if(l1>l2) {
			for(int i=0;i<l1-l2;i++) {
				temp1 = temp1.next;
			}
		}else {
			for(int i=0;i<l2-l1;i++) {
				temp2 = temp2.next;
			}
		}
		
		while(temp1 != null && temp2 != null) {
			if(temp1.data == temp2.data) {
				return temp1.data;
			}
			temp1=temp1.next;
			temp2 = temp2.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(4);
		headA.next.next.next = new Node(5);
		headA.next.next.next.next = new Node(10);
		
		
		Node headB = new Node(3);
		headB.next = new Node(4);
		headB.next.next = new Node(5);
		headB.next.next.next = new Node(10);
		System.out.println(findIntersectionPoint(headA,headB));
	}

}
