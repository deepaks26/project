package com.demo.inter.bst;

import java.util.ArrayList;
import java.util.List;

public class ReplaceWithPreAndSucBSTPract1 {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}
	static class INT{
		int count;
	}
	
	void replace(Node root) {
		List<Integer> list   = new ArrayList<Integer>();
		collectInord(root,list);
		INT i = new INT();
		i.count = 1;
		replacePredSuc(root,list,i);
		
	}

	private void replacePredSuc(Node root, List<Integer> list, INT i) {
		if(root== null) {
			return;
		}
		replacePredSuc(root.left, list,  i);
		root.data = list.get(i.count-1)+list.get(i.count+1);
		replacePredSuc(root.right, list,  i);
		
	}

	private void collectInord(Node root, List<Integer> list) {
		if(root == null) {
			return ;
		}
		collectInord(root.left,list);
		list.add(root.data);
		collectInord(root.right, list);
		
	}
}
