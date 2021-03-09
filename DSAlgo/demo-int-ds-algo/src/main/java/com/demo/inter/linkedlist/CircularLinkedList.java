package com.demo.inter.linkedlist;

public class CircularLinkedList {

	public static void main(String[] args) {
		Node last =  null;
		last = addToEmpty(last, 6); 
	    last = addToBeggin(last, 4); 
	    last = addToBeggin(last, 2); 
	    last = addToEnd(last, 8); 
	    last = addToEnd(last, 12); 
	    last = addAfter(last, 10, 8);
	    
	    traverse(last); 
	}

	static Node addToEmpty(Node last, int data) {
		if (last != null) {
			return last;
		}
		Node temp = new Node(data);
		last = temp;
		last.next = last;

		return last;
	}

	static Node addToBeggin(Node last, int data) {
		if (last == null) {
			return addToEmpty(last, data);
		}
		Node temp = new Node(data);
		temp.next = last.next;
		last.next = temp;
		return last;
	}

	static Node addToEnd(Node last, int data) {
		if (last == null) {
			return addToEmpty(last, data);
		}
		Node temp = new Node(data);
		temp.next = last.next;
		last.next = temp;
		last =temp;
		return last;
	}

	static Node addAfter(Node last, int newValue, int afterValue) {
		if (last == null) {
			return null;
		}

		Node p = last.next;
		Node temp = null;
		do {
			if (p.data == afterValue) {
				temp = new Node(newValue);
				temp.next = p.next;
				p.next = temp;

				if (p == last) {
					last = temp;
				}
				return last;
			}
		} while (p != last.next);
		return last;
	}

	static void traverse(Node last) {
		Node p = null;
		if (last == null) {
			return;
		}
		p = last.next;
		do {
			System.out.print(p.data);
			System.out.println();
			p = p.next;

		} while (p != last.next);
	}

}