package com.demo.inter.linkedlist;

public class FindLengthRecursive {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new  Node(2);
		root.next.next =  new Node(3);
		System.out.println(findLengthRecursively(root));
	}
	
	static int findLengthRecursively(Node root){
		if(root == null) {
			return 0;
		}
		return 1+findLengthRecursively(root.next);
	}
	
}
