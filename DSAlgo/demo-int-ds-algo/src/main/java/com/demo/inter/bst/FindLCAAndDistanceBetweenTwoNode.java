package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.List;

public class FindLCAAndDistanceBetweenTwoNode {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	 Node root;
	
	static int findLCAAndDis(Node root,int left, int right) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l3 = new ArrayList<Integer>();
		int lca = 0;
		findDistanceBetweenRootAndKey( root,l1, left);
		findDistanceBetweenRootAndKey( root,l2, right);
		for(int i=0;i<Math.min(l1.size(), l2.size());i++) {
			if(l1.get(i)!=l2.get(i)) {
				lca = l1.get(i-1);
				System.out.println("lca -> " + lca);
				break;
			}
		}
		
		findDistanceBetweenRootAndKey( root,l3, lca);
		return  (l1.size()+l2.size())-2*l3.size();
	}

	private static boolean findDistanceBetweenRootAndKey(Node root2, List<Integer> l1, int left) {
		if(root2==null) {
			return false;
		}
		l1.add(root2.data);
		if(root2.data==left) {
			return true;
		}
		
		if(findDistanceBetweenRootAndKey(root2.left,l1,left) || findDistanceBetweenRootAndKey(root2.right,l1,left)) {
			return true;
		}
		
		l1.remove(l1.size()-1);
		return false;
	}
	
	public static void main(String[] args) {
		FindLCAAndDistanceBetweenTwoNode tree = new FindLCAAndDistanceBetweenTwoNode();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		System.out.println(findLCAAndDis(tree.root,4,7));
	}
}
