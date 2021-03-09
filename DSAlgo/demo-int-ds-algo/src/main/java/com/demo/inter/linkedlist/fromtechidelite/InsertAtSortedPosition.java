package com.demo.inter.linkedlist.fromtechidelite;

public class InsertAtSortedPosition {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head;
	
	static void sortAsInserted(Node head,int data) {
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.data>data) {
				Node newNode = new Node(data);
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}else {
				temp = temp.next;
			}
		}
	}
	
	void sortAsInsert(Node root,int data) {
		Node temp= root;
		while(temp.next!= null) {
			if(temp.next.data>data) {
				Node newNode = new Node(data);
				temp.next = newNode.next;
				temp.next = newNode;
				break;
			}else {
				temp = temp.next;
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
		head.next.next = new Node(4);
		sortAsInserted(head,3);
		print(head);
	}
}