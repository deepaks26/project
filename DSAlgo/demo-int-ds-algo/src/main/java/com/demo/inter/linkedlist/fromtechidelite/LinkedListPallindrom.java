package com.demo.inter.linkedlist.fromtechidelite;

import java.util.Stack;

import com.demo.inter.linkedlist.fromtechidelite.InsertAtSortedPosition.Node;

public class LinkedListPallindrom {

	static Stack<Integer> stack = new Stack<>();
	
	static boolean isPallindrom(Node head){
		Node temp = head;
		while(temp!= null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		boolean isBoolean  = true;
		while(head != null) {
			if(head.data != stack.pop()) {
				isBoolean= false;
				break;
			}
			head = head.next;
		}
		return isBoolean;
	}
	boolean isPall(Node head) {
		Node temp  =head;
		Stack<Integer> stack = new Stack<Integer>();
		while(temp!= null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		while(head != null) {
			if(head.data != stack.pop()) {
				return false;
			}
			head = head.next;
		}
		return true;
	}
	public static void main(String[] args) {
		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(3);
		headA.next.next.next = new Node(2);
		headA.next.next.next.next = new Node(1);
	System.out.println(isPallindrom(headA));	
	}
	
}