package com.demo.inter.linkedlist;

public class FindMiddleOfLinkedList {

	void printMiddle(Node root) {
		Node slowP = root;
		Node fastP =root;
		while(slowP !=null && fastP.next != null) {
			fastP = fastP.next.next;
			slowP = slowP.next;
		}
		System.out.println("The middle element is "+ slowP.data);
	}

}
