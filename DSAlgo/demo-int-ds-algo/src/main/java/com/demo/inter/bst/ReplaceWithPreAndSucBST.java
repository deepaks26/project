package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWithPreAndSucBST {

	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static class INT 
	{ 
	    int data; 
	} 
	   
	static void replaceWithSum(Node root){
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		collectInOrderElement(root,list);
		list.add(0);
		INT i = new INT(); 
	    i.data=1; 
		replaceWithSumUtil(root,list,i);
	}
	
	static void collectInOrderElement(Node root,List<Integer> list){
		if(root== null) {
			return;
		}
		collectInOrderElement(root.left,list);
		list.add(root.data);
		collectInOrderElement(root.right,list);
		
	}
	
	static void replaceWithSumUtil(Node root,List<Integer> list, INT index){
		if(root==null) {
			return;
		}
		replaceWithSumUtil(root.left,list,index);
		root.data = list.get(index.data-1)+list.get(index.data+1);
		index.data++;
		replaceWithSumUtil(root.right,list,index);
		
	}
	
	static void preorderTraversal( Node root) 
	{ 
	    // if root is null 
	    if (root==null) 
	        return; 
	   
	    // first print the data of node 
	    System.out.print( root.data + " "); 
	   
	    // then recur on left subtree 
	    preorderTraversal(root.left); 
	   
	    // now recur on right subtree 
	    preorderTraversal(root.right); 
	} 
	
	public static void main(String args[]) 
	{ 
	    // binary tree formation 
	     Node root = new Node(1);       //         1         
	    root.left = new Node(2);        //       /   \       
	    root.right = new Node(3);       //     2      3      
	    root.left.left = new Node(4);  //    /  \  /   \    
	    root.left.right = new Node(5); //   4   5  6   7    
	    root.right.left = new Node(6); 
	    root.right.right = new Node(7); 
	   
	    System.out.println( "Preorder Traversal before tree modification:"); 
	    preorderTraversal(root); 
	   
	    replaceWithSum(root); 
	   
	    System.out.println("\nPreorder Traversal after tree modification:"); 
	    preorderTraversal(root); 
	}
	
	void replace(Node root,List<Integer> list,int index) {
		if(root==null) {
			return;
		}
		replace(root.left, list, index);
		root.data = list.get(index-1)+list.get(index+1);
		index++;
		replace(root.right, list, index);
	}
	   
}

