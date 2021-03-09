package com.demo.inter.linkedlist;

public class LinkedListIntersection {

	Node root;
	
	static class Node {
		int data;
		Node next;
	}
	
	int findInterSection(Node root1,Node root2) {
		Node temp1 = root1;
		Node temp2 = root2;
		int l1=0;
		int l2=0;
		//find length
		
		while(temp1 != null) {
			l1++;
			temp1 =temp1.next;
		}
		
		while(temp2 != null) {
			l2++;
			temp2 =temp2.next;
		}
		
		if(l1>l2) {
			int diff = l1-l2;
			for(int i=0;i<diff;i++) {
				temp1 = temp1.next;
			}
		}else {
			int diff = l2-l1;
			for(int i=0;i<diff;i++) {
				temp2 = temp2.next;
			}
		}
		
		while(temp1 != null && temp2 != null) {
			if(temp1==temp2) {
				return temp1.data;
			}
			
			temp1 = temp1.next;
			temp2 =  temp2.next;
		}
		return -1;
	}
}
