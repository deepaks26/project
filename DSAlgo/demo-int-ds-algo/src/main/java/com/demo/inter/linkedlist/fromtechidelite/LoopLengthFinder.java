package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class LoopLengthFinder {

	static int findLoopLength(Node head) {
		
		Node slow  =head;
		Node fast  = head;
		while(slow != null && fast.next != null) {
			slow = slow.next;
			fast =  fast.next.next;
			if(slow == fast) {
				return findLength(slow);
			}
		}
		return 0;
	}

	private static int findLength(Node slow) {
		Node temp = slow;
		int count=0;
		while(temp.next != slow) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	int findLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast.next != null) {
			slow = slow.next;
			fast=fast.next.next;
			if(slow == fast) {
				return findLen(slow);
			}
		}
		return -1;
	}
	
	int findLen(Node slow){
		Node temp  = slow;
		int count = 0;
		while(temp.next!= slow) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		/* Create a loop for testing */
		head.next.next.next.next.next = head.next;

		System.out.println(findLoopLength(head));
	}
}
