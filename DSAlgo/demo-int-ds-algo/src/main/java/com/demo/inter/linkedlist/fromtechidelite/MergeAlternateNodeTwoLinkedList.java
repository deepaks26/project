package com.demo.inter.linkedlist.fromtechidelite;

public class MergeAlternateNodeTwoLinkedList {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
		Node(){
			
		}
	}
	Node head;
	
	static void merge(Node headA,Node headB) {
		Node result = new Node();
		Node temp = result;
		while(headA != null || headB != null) {
			
			if(headA== null) {
				temp.next = headB;
				break;
			}
			if(headB== null) {
				temp.next = headA;
				break;
			}
			
			temp.next = headA;
			temp = headA;
			headA = headA.next;
			
			temp.next = headB;
			temp = headB;
			headB = headB.next;
		}
		print(result.next);
	}
	
	void mergePract(Node head1,Node head2) {
		Node result = new Node(0);
		Node temp = result;
		while(true) {
			if(head1 == null) {
				temp.next  = head2;
				break;
			}
			if(head2==null) {
				temp.next =  head1;
			}
			temp.next =  head1;
			temp = temp.next;
			head1 = head1.next;
			
			temp.next = head2;
			temp = temp.next;
			head2 = head2.next;
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
		Node headA = new Node(1);
		headA.next = new Node(2);
	//	headA.next.next = new Node(4);
		Node headB = new Node(3);
		headB.next = new Node(4);
		
		merge(headA,headB);
	}
}
