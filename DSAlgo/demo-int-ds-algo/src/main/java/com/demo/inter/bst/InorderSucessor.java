package com.demo.inter.bst;

public class InorderSucessor {

	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	
	static Node findInOrderSuccessor(Node root,Node suc,int key){
		if(root==null) {
			return suc;
		}
		
		if(root.data==key) {
			if(root.right != null) {
				/*
				 * Node temp = root.right; while(temp.left != null) { temp = temp.left; } return
				 * temp;
				 */
				return findMinimum(root.right);
			}
		}else if(key <root.data) {
			suc = root;
			return findInOrderSuccessor(root.left,suc,key);
		}else {
			return findInOrderSuccessor(root.right,suc,key);
		}
		return suc;

	}
	
	// Recursive function to insert a key into BST
    public static Node insert(Node root, int key)
    {
        // if the root is null, create a new node and return it
        if (root == null) {
            return new Node(key);
        }
 
        // if given key is less than the root node, recur for left subtree
        if (key < root.data) {
            root.left = insert(root.left, key);
        }
 
        // if given key is more than the root node, recur for right subtree
        else {
            root.right = insert(root.right, key);
        }
 
        return root;
    }
    
    public static Node findMinimum(Node root)
    {
        while (root.left != null) {
            root = root.left;
        }
 
        return root;
    }
 
    public static void main(String[] args)
    {
        /* Construct below tree
                   15
                 /    \
                /      \
               10       20
              /  \     /  \
             /    \   /    \
            8     12 16    25
        */
 
        int[] keys = { 15, 10, 20, 8, 12, 16, 25 };
 
        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }
 
        // find in-order successor for each key
        for (int key : keys)
        {
            Node prec = findInOrderSuccessor(root, null, key);
 
            if (prec != null) {
                System.out.println("Successor of node " + key + " is "
                                    + prec.data);
            } else {
                System.out.println("Successor doesn't exists for node "
                                    + key);
            }
        }
    }
}
