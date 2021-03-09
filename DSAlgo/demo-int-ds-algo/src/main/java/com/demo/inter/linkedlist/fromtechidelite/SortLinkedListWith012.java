package com.demo.inter.linkedlist.fromtechidelite;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class SortLinkedListWith012 {

	static Node sort(Node head) {
		Node first = new Node(0);
		Node zero = first;
		
		Node second = new Node(0);
		Node one = second;
		
		Node third = new Node(0);
		Node two = third;
		Node temp = head;
		while(temp != null) {
			if(temp.data ==0) {
				Node newnode = new Node(temp.data);
				newnode.next = zero.next;
				zero.next = newnode;
				zero = zero.next;
			}
			else if(temp.data ==1) {
				Node newnode = new Node(temp.data);
				newnode.next = one.next;
				one.next = newnode;
				one = one.next;
				
			}else {
				Node newnode = new Node(temp.data);
				newnode.next = two.next;
				two.next = newnode;
				two = two.next;
			}
			temp = temp.next;
		}
		
		one.next = third.next;
		zero.next = second.next;
		return first.next;
	}
	
	  static void printList(Node headref) 
	    { 
	        while (headref != null) { 
	            System.out.print(headref.data + " "); 
	            headref = headref.next; 
	        } 
	    } 
	  
	  public static void main(String[] args) {
			Node headA = new Node(1);
			headA.next = new Node(0);
			headA.next.next = new Node(1);
			headA.next.next.next = new Node(2);
			headA.next.next.next.next = new Node(0);
			Node temp = sort(headA);
			printList(temp);
		}
}
