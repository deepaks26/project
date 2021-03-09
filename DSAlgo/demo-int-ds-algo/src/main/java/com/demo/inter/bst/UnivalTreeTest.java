package com.demo.inter.bst;

public class UnivalTreeTest {

	static class Node{
		int data;
		Node left;
		Node right;
	}
	
	Node root;
	int count;
	boolean findCountOfUnivalTree(Node root){
		if(root == null) {
			return false;
		}
		
		boolean left =findCountOfUnivalTree(root.left);
		boolean right =findCountOfUnivalTree(root.right);
		
		if(left==false && right == false) {
			return false;
		}
		
		if(root.left != null && root.data!= root.left.data) {
			return false;
		}
		if(root.right != null && root.data != root.right.data) {
			return false;
		}
		
		count++;
		return true;
	}
	
	
}
