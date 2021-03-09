package com.demo.inter.linkedlist;

public class DeleteElementFromLinkedList {

	Node root;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	 void delete(int key) {
		Node prev = null;
		Node temp = root;
		while (temp != null) {
			if (temp.data == key) {
				prev.next = temp.next;
				break;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = root;
		root = new_node;
	}
	
	public void printList() 
    { 
        Node tnode = root; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
	
	public static void main(String[] args) 
    { 
		DeleteElementFromLinkedList llist = new DeleteElementFromLinkedList(); 
  
        llist.push(7); 
        llist.push(1); 
        llist.push(3); 
        llist.push(2); 
  
        System.out.println("\nCreated Linked list is:"); 
        llist.printList(); 
  
        llist.delete(1); // Delete node with data 1 
  
        System.out.println("\nLinked List after Deletion of 1:"); 
        llist.printList(); 
    } 
}
