package com.demo.inter.bst;

import java.util.List;

public class FindEleFromRootToNthPract {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	Node root;
	
	static boolean findElement(Node root, List<Integer> list,int key) {
		if(root==null) {
			return false;
		}
		list.add(root.data);
		if(root.data==key) {
			return true;
		}
		if(findElement(root.left,list,key) || findElement(root.right,list,key)) {
			return true;
		}
		
		list.remove(list.size()-1);
		return false;
	}
	
	boolean findEl(Node root,List<Integer> list, int key) {
		if(root== null) {
			return false;
		}
		list.add(root.data);
		if(root.data==key) {
			return true;
		}
		
		if(findEl(root.left, list, key)|| findEl(root.right, list, key)) {
			return true;
		}
		list.remove(list.size()-1);
		return false;
	}
}
