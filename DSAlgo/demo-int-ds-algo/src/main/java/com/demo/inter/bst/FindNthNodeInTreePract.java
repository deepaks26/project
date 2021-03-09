package com.demo.inter.bst;

public class FindNthNodeInTreePract {

	static class Node{
		int data;
		Node left;
		Node right;
	}
	static int count=0;
	static void findNthNode(Node root,int N) {
		if(root==null) {
			return;
		}
		
		if(count<=N) {
			findNthNode(root.left,N);
			count++;
			if(count==N) {
				System.out.println(root.data);
			}
			findNthNode(root.right,N);
		}
	}
}


