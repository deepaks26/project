package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.SplitLinkedListTwoHalves.Node;

public class MergeTwoSortedLinkedList {

	static void merge(Node headA,Node headB) {
		Node result = new Node(0);
		Node temp = result;
		
		while(true) {
			if(headA==null) {
				temp.next = headB;
				break;
			}
			if(headB==null) {
				temp.next = headA;
				break;
			}
			
			if(headA.data<headB.data) {
				//Node newNode = new Node(headA.data);
				//newNode.next = temp.next;
				temp.next = headA;
				temp = temp.next;
				headA= headA.next;
			}else {
				//Node newNode = new Node(headB.data);
				//newNode.next = temp.next;
				temp.next = headB;
				temp = temp.next;
				headB= headB.next;
			}
		}
		printList(result.next);
	}
	
	
	Node mergeSorted(Node head1,Node head2){
		Node result = new Node(0);
		Node temp = result;
		while(true) {
			if(head1==null) {
				temp.next = head2;
				break;
			}
			if(head2==null) {
				temp.next = head1;
				break;
			}
			if(head1.data<head2.data) {
				temp.next  = head1;
				temp = temp.next;
				head1 = head1.next;
			}else {
				temp.next  = head2;
				temp = temp.next;
				head2= head2.next;
			}
		}
		return result.next;
	}
	  public static void printList( Node head)
	    {
	 
	        Node ptr = head;
	        while (ptr != null)
	        {
	            System.out.print(ptr.data + " �> ");
	            ptr = ptr.next;
	        }
	 
	        System.out.println("null");
	    }
	  
	  public static void main(String[] args) {
			Node headA = new Node(1);
			headA.next = new Node(3);
		//	headA.next.next = new Node(4);
			Node headB = new Node(2);
			headB.next = new Node(4);
			
			merge(headA,headB);
		}
}