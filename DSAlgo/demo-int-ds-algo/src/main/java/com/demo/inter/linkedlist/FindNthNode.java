package com.demo.inter.linkedlist;

public class FindNthNode {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.next = new  Node(20);
		root.next.next =  new Node(30);
		//System.out.println(findLength(root));
		System.out.println(finNthNode(root,(findLength(root)-3)+1));
		//System.out.println(finNthNode(root,1));
	}
	static int count = 0;
	static int finNthNode(Node root,int index){
		if(count==index) {
			return root.data;
		}else {
			count++;
		}
		return finNthNode(root.next,index);
	}
	
	static int findLength(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+findLength(root.next);
	}
}
