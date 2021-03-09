package com.demo.inter.bst;

public class UnivalTree {

	static class Node{
		int data;
		Node left;
		Node right;
	}
	int count = 0;
	
	boolean findCountOfUnivalTree(Node root,int count){
		
		if(root==null) {
			return true;
		}
		
		boolean left = findCountOfUnivalTree(root.left, count);
		boolean right = findCountOfUnivalTree(root.right, count);
		if(left==false && right==false) {
			return false;
		}
		
		if(root.left != null && root.data != root.left.data) {
			return false;
		}
		
		if(root.right != null && root.data != root.right.data) {
			return false;
		}
		
		count++;
		return true;
	}
	
	boolean findUnival(Node root, int count) {
		if(root==null) {
			return true;
		}
		
		boolean left = findUnival(root.left, count);
		boolean right = findUnival(root.right, count);
		if(left==false && right==false) {
			return false;
		}
		if(root.left != null && root.data != root.left.data) {
			return false;
		}
		if(root.right != null && root.data != root.right.data) {
			return false;
		}
		count++;
		return true;
	}
	
	
}