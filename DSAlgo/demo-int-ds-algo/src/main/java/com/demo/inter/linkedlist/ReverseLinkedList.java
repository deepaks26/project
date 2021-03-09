package com.demo.inter.linkedlist;

public class ReverseLinkedList {

	Node root;
	
	Node reverseLinkList(Node root){
		
		Node next=null;
		Node prev = null;
		Node current= root;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
				
		}
		root = prev;
		return root;
		
	}
	void printLinkedList(Node node){
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.root = new Node(85);
        list.root.next = new Node(15);
        list.root.next.next = new Node(4);
        //list.root.next.next.next = new Node(20);
        list.printLinkedList(list.root);
        list.printLinkedList(list.reverseLinkList(list.root));
 
	}

}
