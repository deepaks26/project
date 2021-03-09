package com.demo.inter.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePract {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	static Node root;

	static Node addRecursive(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data) {
			root.left = addRecursive(root.left, data);
		} else {
			root.right = addRecursive(root.right, data);
		}
		return root;
	}
	
	static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
	static void preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		inorder(root.left);
		inorder(root.right);
	}
	static void postorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.println(root.data);
	}
	
	static void bfsTraverse(Node root) {
		if(root==null) {
			return;
		}
		
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node temp = qu.remove();
			System.out.println(temp.data);
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
		}
	}
	
	public static void main(String[] args) {
		BinaryTreePract bt = new BinaryTreePract();
		/*
		 * bt.root = new Node(1); bt.root.left = new Node(2); bt.root.right = new
		 * Node(3);
		 */
		Node root = bt.addRecursive(null, 6);
		bt.addRecursive(root, 4);
		bt.addRecursive(root, 8);
		bt.addRecursive(root, 3);
		bt.addRecursive(root, 5);
		bt.addRecursive(root, 7);
		bt.addRecursive(root, 9);

	bt.bfsTraverse(root);
	}
}
