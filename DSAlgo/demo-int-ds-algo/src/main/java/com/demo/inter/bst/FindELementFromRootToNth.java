package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.List;

public class FindELementFromRootToNth {
	public static void printPath(Node root, int x) {
		// ArrayList to store the path
		ArrayList<Integer> arr = new ArrayList();
		// if required node 'x' is present
		// then print the path
		if (findElem(root, arr, x)) {
			for (int i = 0; i < arr.size() - 1; i++)
				System.out.print(arr.get(i) + "->");
			System.out.print(arr.get(arr.size() - 1));
		}
		// 'x' is not present in the binary tree
		else
			System.out.print("No Path");
	}

	static boolean findElem(Node root, List<Integer> path, int key) {
		if (root == null) {
			return false;
		}
		path.add(root.key);

		if (root.key == key) {
			return true;
		}

		if (findElem(root.left, path, key) || findElem(root.right, path, key)) {
			return true;
		}

		path.remove(path.size() - 1);
		return false;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		int x = 5;
		printPath(root, x);
	}
}
