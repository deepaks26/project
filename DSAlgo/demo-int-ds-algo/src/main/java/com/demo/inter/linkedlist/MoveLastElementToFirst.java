package com.demo.inter.linkedlist;

public class MoveLastElementToFirst {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.next = new  Node(20);
		root.next.next =  new Node(30);
		int length = findLength(root);
		moveLastToFirst(root,length);
	}
	
	static int findLength(Node root){
		if(root==null) {
			return 0;
		}
		return 1+ findLength(root.next);
	}
	static void moveLastToFirst(Node root,int length){
		Node temp = root;
		for(int i =0;i<length;i++) {
			if(i==length-2) {
				Node next = root.next;
				root.next = null;
				next.next = temp;
				root = next;
				while(root!=null) {
					System.out.print(root.data + " ");
					root = root.next;
				}
				break;
			}else {
				root = root.next;
			}
		}
	}
}

