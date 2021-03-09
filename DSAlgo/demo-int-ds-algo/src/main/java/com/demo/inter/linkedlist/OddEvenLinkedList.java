package com.demo.inter.linkedlist;

public class OddEvenLinkedList {

	Node head;  // head of list 
	   
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
	void segregateEvenOdd(Node root) {
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;

		while (root != null) {
			if (root.data % 2 == 0) {
				if (evenStart == null) {
					evenStart = new Node(root.data);
					evenEnd = evenStart;
				} else {
					evenEnd.next = new Node(root.data);
					evenEnd = evenEnd.next;
				}
			} else {
				if (oddStart == null) {
					oddStart = new Node(root.data);
					oddEnd = oddStart;
				} else {
					oddEnd.next = new Node(root.data);
					oddEnd = oddEnd.next;
				}
			}
			root = root.next;
		}

		if (evenStart == null || oddStart == null) {
			return;	
		}

		evenEnd.next = oddStart;
		oddEnd.next = null;
		root = evenStart;
		
		while(root != null) 
        { 
            System.out.print(root.data+" "); 
            root = root.next; 
        } 
        //System.out.println(); 

	}

	void push(int new_data) 
    { 
        /* 1 & 2: Allocate the Node & 
                  Put in the data*/
        Node new_node = new Node(new_data); 
   
        /* 3. Make next of new Node as head */
        new_node.next = head; 
   
        /* 4. Move the head to point to new Node */
        head = new_node; 
    } 
   
    // Utility function to print a linked list 
	
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	 
      
    /* Driver program to test above functions */
    public static void main(String args[]) 
    { 
    	OddEvenLinkedList llist = new OddEvenLinkedList(); 
        llist.push(11); 
        llist.push(10); 
        llist.push(9); 
        llist.push(6); 
        llist.push(4); 
        llist.push(1); 
        llist.push(0); 
        System.out.println("Origional Linked List"); 
       llist.printList(); 
   
        System.out.println("Modified Linked List"); 
        llist.segregateEvenOdd(llist.head); 
   
     //   llist.printList(); 
    } 
}
