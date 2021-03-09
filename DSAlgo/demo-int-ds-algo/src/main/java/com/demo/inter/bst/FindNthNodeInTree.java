
package com.demo.inter.bst;

public class FindNthNodeInTree {

	static int count = 0;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	void findNthNode(Node root) {
		if (root == null) {
			return;
		}
		if (count <= 4) {
			findNthNode(root.left);
			count++;
			if (count == 4) {
				System.out.println(root.data);
			}
			findNthNode(root.right);
		}

	}

	public static void main(String[] args) {
		FindNthNodeInTree tree = new FindNthNodeInTree();
		FindNthNodeInTree.Node root = tree.new Node(10);
		root.left = tree.new Node(20);
		root.right = tree.new Node(30);
		root.left.left = tree.new Node(40);
		root.left.right = tree.new Node(50);
		tree.findNthNode(root);
	}

}
