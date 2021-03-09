package com.demo.inter.linkedlist;

public class LinkedListIntersect {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new Node(2);
		root.next.next = new Node(3);
		
		Node root1 = new Node(5);
		root1.next = new Node(3);
		root1.next.next = new Node(1);
		findIntersection(root,root1);
	}

	static void findIntersection(Node root1, Node root2) {
		while(root1 != null) {
			Node temp = root2;
			while(temp != null) {
				if(temp.data==root1.data) {
					System.out.println(temp.data + " ");
				}
				temp = temp.next;
			}
			root1 = root1.next;
		}
	}
}
