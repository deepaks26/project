package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
	Node root;

	static void findLCA() {
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		List<Integer> path1 = new ArrayList<Integer>();
		List<Integer> path2 = new ArrayList<Integer>();
		tree.findElementeBetweenRootAndNode(tree.root, path1, 4);
		tree.findElementeBetweenRootAndNode(tree.root, path2, 7);
		for (int i = 0; i < Math.min(path1.size(), path2.size()); i++) {
			if (!path1.get(i).equals(path2.get(i))) {
				System.out.println(path1.get(i - 1));
				break;
			}
		}

	}

	boolean findElementeBetweenRootAndNode(Node root, List path, int key) {
		if (root == null) {
			return false;
		}
		path.add(root.key);
		if (root.key == key) {
			return true;
		}

		if (findElementeBetweenRootAndNode(root.left, path, key)
				|| findElementeBetweenRootAndNode(root.right, path, key)) {
			return true;
		}

		path.remove(path.size() - 1);
		return false;
	}
	
	public static void main(String[] args) {
		findLCA();
		finDistanceBetweenTwoNodes();
		
		
		
		
		
	}
	
	static void finDistanceBetweenTwoNodes() {
		LowestCommonAncestor tree = new LowestCommonAncestor();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		List<Integer> path1 = new ArrayList<Integer>();
		List<Integer> path2 = new ArrayList<Integer>();
		List<Integer> path3 = new ArrayList<Integer>();
		Integer lca= null;
		tree.findElementeBetweenRootAndNode(tree.root, path1, 4);
		tree.findElementeBetweenRootAndNode(tree.root, path2, 7);
		for (int i = 0; i < Math.min(path1.size(), path2.size()); i++) {
			if (!path1.get(i).equals(path2.get(i))) {
				lca = path1.get(i-1);
				break;
			}
		}
		tree.findElementeBetweenRootAndNode(tree.root, path3, lca);
		Integer distance = (path1.size()+path2.size())- 2*path3.size();
		System.out.println("distance is "+ distance);
	}
	
	
}
