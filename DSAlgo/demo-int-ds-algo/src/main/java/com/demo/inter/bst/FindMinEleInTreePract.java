package com.demo.inter.bst;

public class FindMinEleInTreePract {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	static int findMinEleInTree(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		int data = root.data;
		int left = findMinEleInTree(root.left);
		int right = findMinEleInTree(root.right);
		if (left < data) {
			data = left;
		}
		if (right < data) {
			data = right;
		}
		return data;
	}
	
	static int findMin(Node root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int data = root.data;
		int left = findMin(root.left);
		int right = findMin(root.right);
		if(left<data) {
			data = left;
		}
		if(right<data) {
			data= right;
		}
		return data;
	}

}
