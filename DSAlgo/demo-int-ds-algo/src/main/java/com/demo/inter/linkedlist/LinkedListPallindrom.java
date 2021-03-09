package com.demo.inter.linkedlist;

public class LinkedListPallindrom {

	public static void main(String[] args) {
		Node root = new Node("A");
		root.next = new Node("B");
		root.next.next = new Node("A");
		System.out.println(isListPallindrom(root));
	}

	static boolean isListPallindrom(Node root) {
		Node tempRoot = root;
		StringBuilder str = new StringBuilder();
		StringBuilder strRev = new StringBuilder();
		while (tempRoot != null) {
			str = str.append(tempRoot.key);
			tempRoot = tempRoot.next;

		}
		root = reverseLinkedList(root);
		while (root != null) {
			strRev = strRev.append(root.key);
			root = root.next;
		}
		return str.toString().equals(strRev.toString());
	}

	static Node reverseLinkedList(Node root) {
		Node prev = null;
		Node next = null;
		Node current = root;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		root = prev;
		return root;
	}

}
