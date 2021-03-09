package com.demo.inter.linkedlist;

public class DoubleLinkedList {

	DNode head;

	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.createNode(3);
		dll.insertAtBeginning(2);
		dll.insertAtBeginning(1);
		dll.insertAtEnd(4);
		dll.insertAtEnd(6);
		dll.insertAtBeginning(0);
		dll.insertAfter(4,5);
		dll.traverse();

	}

	private void createNode(Integer data) {
		head = new DNode(data);
	}

	private void insertAtBeginning(Integer data) {
		DNode node = new DNode(data);
		node.next = head;
		node.prev  = null;
		if(head != null) {
			head.prev =  node;
		}
		head= node;

	}
	
	private void insertAtEnd(Integer data) {
		DNode node = new DNode(data);
		DNode last = head;
		while(last.next !=null) {
			last = last.next;
		}
		
		node.prev = last;
		last.next = node;
		

	}

	private void traverse() {
		if (head.next == null) {
			System.out.println(2);
		}
		DNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	private void insertAfter(Integer insertAfter, Integer insertItem) {
		DNode matchingNode = null;
		DNode temp = head;
		while(temp != null) {
			if(temp.data==insertAfter) {
				matchingNode= temp;
				break;
			}
			temp = temp.next;
		}
		if(matchingNode != null) {
			temp = new DNode(insertItem);
			matchingNode.next.prev = temp;
			temp.next = matchingNode.next;
			matchingNode.next = temp;
			temp.prev = matchingNode;
		}
	}

}
