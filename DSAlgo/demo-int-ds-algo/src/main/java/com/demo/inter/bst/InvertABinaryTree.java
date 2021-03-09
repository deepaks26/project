package com.demo.inter.bst;

public class InvertABinaryTree {

	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data =  data;
		}	
	} 
	
	void invert(Node root) {
		if(root== null) {
			return;
		}
		
		swap(root);
		invert(root.left);
		invert(root.right);
	}

	private void swap(Node root) {
		if(root==null) {
			return ;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	
	private void preOrder(Node root) {
		if(root==null) {
			return;
		}
		
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
}