package com.demo.inter.linkedlist;

public class SearchRecursive {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new  Node(2);
		root.next.next =  new Node(3);
		System.out.println(searchRecursively(root,3));
	}
	
	static boolean searchRecursively(Node root,int key) {
		if(root==null) {
			return false;
		}
		if(root.data == key) {
			return true;
		}
		return searchRecursively(root.next,key);
	}
}

