package com.demo.inter.linkedlist.fromtechidelite;

public class MergeSortOnLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}

	}
	Node head;

	static Node sort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = findMiddle(head);
		Node nextToMiddle = middle.next;
		middle.next = null;
		Node left = sort(head);
		Node right = sort(nextToMiddle);
		Node sortedHead = merge(left, right);
		return sortedHead;

	}

	private static Node merge(Node left, Node right) {
		Node result = null;
		if (left == null) {
			return right;
		}

		if (right == null) {
			return left;
		}

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}

		return result;
	}

	private static Node findMiddle(Node head) {
		if(head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	void push(int new_data) 
    { 
        /* allocate node */
        Node new_node = new Node(new_data); 
  
        /* link the old list off the new node */
        new_node.next = head; 
  
        /* move the head to point to the new node */
        head = new_node; 
    } 
  
    // Utility function to print the linked list 
    void printList(Node headref) 
    { 
        while (headref != null) { 
            System.out.print(headref.data + " "); 
            headref = headref.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
  
    	MergeSortOnLinkedList li = new MergeSortOnLinkedList(); 
        /* 
         * Let us create a unsorted linked list to test the functions 
         * created. The list shall be a: 2->3->20->5->10->15 
         */
        li.push(15); 
        li.push(10); 
        li.push(5); 
        li.push(20); 
        li.push(3); 
        li.push(2); 
  
        // Apply merge Sort 
        li.head = li.sort(li.head); 
        System.out.print("\n Sorted Linked List is: \n"); 
        li.printList(li.head); 
    } 

}
