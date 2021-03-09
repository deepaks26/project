package com.demo.inter.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	Node root;

	public BinaryTree(int item) {
		root = new Node(item);
	}

	BinaryTree() {
		root = null;
	}

	public Node addRecursive(Node root, int item) {
		if (root == null) {
			root = new Node(item);
			return root;
		}

		if (item < root.key) {
			root.left = addRecursive(root.left, item);
		} else if (item > root.key) {
			root.right = addRecursive(root.right, item);
		}
		return root;
	}

	Node  addRecursive1(Node root,int data){
		if(root == null) {
			root = new Node(data);
			return root;
		}
		if(data<root.key) {
			root.left = addRecursive1(root.left,data);
		}else {
			root.right = addRecursive1(root.right, data);
		}
		return root;
	}
	public void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.key + " ");
		inorder(root.right);

	}
	
	void inOrd(Node root){
		if(root==null) {
			return;
		}
		inOrd(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + " ");

	}

	public void insertAtLeftIfNull(Node root, int item) {
		if (root == null) {
			root = new Node(item);
			return;
		}

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.peek();
			queue.remove();

			if (temp.left == null) {
				Node left = new Node(item);
				temp.left = left;
				break;
			} else {
				queue.add(temp.left);
			}

			if (temp.right == null) {
				Node right = new Node(item);
				temp.right = right;
				break;
			} else {
				queue.add(temp.right);
			}
		}

	}
	
	void bfs(Node root) {
		if(root== null) {
			return;
		}
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		while(!qu.isEmpty()) {
			Node temp = qu.remove();
			System.out.println(temp.key);
			if(temp.left != null) {
				qu.add(temp.left);
			}else if(temp.right != null) {
				qu.add(temp.right);
			}
		}
	}
	public void bfsTraverse(Node root) {
		if(root==null) {
			return;
		}
		Queue<Node> nodes = new LinkedList<Node>();
		nodes.add(root);
		while(!nodes.isEmpty()) {
			Node temp = nodes.remove();
			System.out.print(temp.key + " ");
			
			if(temp.left!=null) {
				nodes.add(temp.left);
			}
			
			if(temp.right != null) {
				nodes.add(temp.right);
			}

		}
		
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
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
		/*,
		 * Node root1 = new Node(10); root1.left = new Node(11); root1.left.left = new
		 * Node(7); root1.right = new Node(9); root1.right.left = new Node(15);
		 * root1.right.right = new Node(8);
		 * 
		 * System.out.print("Inorder traversal before insertion:"); bt.inorder(root1);
		 * 
		 * int key = 12; bt.insertAtLeftIfNull(root1, key);
		 * 
		 * System.out.print("\nInorder traversal after insertion:"); bt.inorder(root1);
		 */
	}
	
	Node addRec(Node root,int item) {
		
		if(root== null) {
			Node n = new Node(item);
			root = n;
			return root;
		}
		
		if(item<root.key){
			root.left = addRec(root.left,item);
		}
		if(item>root.key){
			root.right = addRec(root.right,item);
		}
		return root;
	}
}
