package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinElementInTree {

	static int findMinEleInTree(Node node) {
		 if (node == null) 
	            return Integer.MAX_VALUE; 
	  
	        int res = node.key; 
	        int lres = findMinEleInTree(node.left); 
	        int rres = findMinEleInTree(node.right); 
	  
	        if (lres < res) 
	            res = lres; 
	        if (rres < res) 
	            res = rres; 
	        return res; 
	}

	static List findElmMin(Node root, List list) {
		if (root == null) {
			return list;
		}

		findElmMin(root.left, list);
		list.add(root.key);
		findElmMin(root.right, list);
		return list;

	}

	public static void main(String[] args) {
		Node root = new Node(18);
		root.left = new Node(4);
		root.right = new Node(3);
		root.left.left = new Node(10);
		root.left.right = new Node(2);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		List l = new ArrayList();
		l = findElmMin(root, l);
		Collections.sort(l);
		System.out.println(l.get(0));
		System.out.println(findMinEleInTree(root));
	}
}
