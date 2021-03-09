package com.demo.inter.linkedlist;

public class LinkedListInsertAtFirstNode {

	public static void main(String[] args) {
		LinkedList lnkList = new LinkedList();
		lnkList.head = new Node(1);

		Node second = new Node(2);
		Node third = new Node(3);
		lnkList.head.next = second;
		second.next = third;
		/*
		 * printLinkedList(lnkList); pushAtFirstNode(lnkList, 10);
		 * printLinkedList(lnkList);
		 * 
		 * pushAtGivenNode(lnkList, lnkList.head.next); printLinkedList(lnkList);
		 * 
		 * pushAtLastNode(lnkList); printLinkedList(lnkList);
		 * 
		 * 
		 * deleteGivenNode(lnkList,3); printLinkedList(lnkList);
		 */
		
		deleteAtPosition(lnkList,1);
		printLinkedList(lnkList);
	}

	public static void printLinkedList(LinkedList lnkList) {
		Node head = lnkList.head;
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	static void pushAtFirstNode(LinkedList list, int data) {
		Node head = new Node(10);
		head.next = list.head;
		list.head = head;
		
	}
	
	static void pushAtGivenNode(LinkedList list, Node prevNode) {
		Node newNode = new Node(15);
		newNode.next = prevNode.next ;
		prevNode.next   = newNode;
	}
	
	static void pushAtLastNode(LinkedList list) {
		Node newNode = new Node(20);
		Node last  = list.head;
		while(last.next != null) {
			last  = last.next;
		}
		last.next = newNode;
	}
	
	static void deleteGivenNode(LinkedList list,int data) {
		Node temp  = list.head;
		while(temp.next != null) {
			if(temp.next.data == data) {
				Node matchingNode = temp.next;
				if(matchingNode.next != null) {
					temp.next  = matchingNode.next;
					break;
				}else {
					temp.next = null;
					break;
				}
				
			}else {
				temp = temp.next;
			}
		}
	}
	
	static void deleteAtPosition(LinkedList list, int position) {
		if(position==0) {
			list.head = list.head.next;
			return;
		}
		Node temp  = list.head;
		int iteration = 0;
		while(temp.next != null) {
			if(iteration==position-1) {
				Node matchingNode = temp.next;
				if(matchingNode.next != null) {
					temp.next  = matchingNode.next;
					break;
				}else {
					temp.next = null;
					break;
				}
			}else {
				temp = temp.next;
				iteration++;
			}
		}
	}
	

}
