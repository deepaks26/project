package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.SplitLinkedListTwoHalves.Node;

public class IntersectionOfTwoSortedList {

	static Node merge(Node head1, Node head2) {
		Node result = new Node(0);
		Node temp = result;

		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				temp.next = head1;
				temp = temp.next;
				head1 = head1.next;
				head2 = head2.next;
			} else if (head1.data < head2.data) {
				head1 = head1.next;
			} else {
				head2 = head2.next;
			}
		}

		return result.next;
	}

	Node mergeSorted(Node head1,Node head2) {
		Node dummyNode = new Node(0);
		Node temp = dummyNode;
		while(head1!= null && head2 != null) {
			if(head1.data == head2.data) {
				temp.next = head1;
				temp = temp.next;
				head1 = head1.next;
				head2 = head2.next;
			}else if(head1.data < head2.data) {
				head1 = head1.next;
			}else {
				head2 = head2.next;
			}
		}
		return dummyNode.next;
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

		Node headB = new Node(3);
		headB.next = new Node(4);
		headB.next.next = new Node(5);
		headB.next.next.next = new Node(10);
		printList(merge(headA, headB));
	}
}
