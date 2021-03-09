package com.demo.inter.bst;

public class InorderPredecessor {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	static Node findPredecessor(Node root, Node pre, int key) {
		if (root == null) {
			return pre;
		}
		if (root.data == key) {
			if (root.left != null) {
				return findMax(root.left);
			}
		} else if (key < root.data) {
			return findPredecessor(root.left, pre, key);
		} else {
			pre = root; // need to understad
			return findPredecessor(root.right, pre, key);
		}
		return pre;

	}

	private static Node findMax(Node root) {
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}

	// Recursive function to insert a key into BST
	public static Node insert(Node root, int key) {
		// if the root is null, create a new node and return it
		if (root == null) {
			return new Node(key);
		}

		// if given key is less than the root node, recur for left subtree
		if (key < root.data) {
			root.left = insert(root.left, key);
		}

		// if given key is more than the root node, recur for right subtree
		else {
			root.right = insert(root.right, key);
		}

		return root;
	}

	public static void main(String[] args) {
		/*
		 * Construct below tree 15 / \ / \ 10 20 / \ / \ / \ / \ 8 12 16 25
		 */

		//int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
		int[] keys = { 15, 10, 20};

		Node root = null;
		for (int key : keys) {
			root = insert(root, key);
		}

		// find in-order predecessor for each key
		for (int key : keys) {
			Node prec = findPredecessor(root, null, key);

			if (prec != null) {
				System.out.println("Predecessor of node " + key + " is " + prec.data);
			} else {
				System.out.println("Predecessor doesn't exists for node " + key);
			}
		}
	}
}
