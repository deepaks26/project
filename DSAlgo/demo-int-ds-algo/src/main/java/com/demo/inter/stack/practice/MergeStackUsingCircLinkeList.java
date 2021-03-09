package com.demo.inter.stack.practice;

public class MergeStackUsingCircLinkeList {

	static class DNode{
		DNode prev;
		DNode next;
		int data;
		public DNode(int data) {
			this.data = data;
		}
	}
	DNode head;
	DNode tail;
	
	void push(int data) {
		DNode newNode = new DNode(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next= tail;
			newNode.prev = null;
			tail.prev = newNode;
			tail=newNode;
		}
	}
	
	 int pop() {
		int data =  tail.data;
		DNode temp = tail.next;
		tail.next = null;
		tail = temp;
		tail.prev = null;
		return data;
	}
	 
	 void merge(MergeStackUsingCircLinkeList st) {
		 head.next = st.tail;
		 st.tail.prev = head;
		 head = st.head;
		 st.tail = st.head =  null;
	 }
	 
	 public void display() 
	 { 
	     if(tail != null) 
	     { 
	         DNode n = tail; 
	         while(n != null) 
	         { 
	             System.out.print(n.data + " "); 
	             n = n.next; 
	         } 
	         System.out.println(); 
	     } 
	     else
	     { 
	         System.out.println("Stack Underflow"); 
	     } 
	 } 
	 
	 public static void main (String[] args) 
	 { 
		 MergeStackUsingCircLinkeList ms1 = new MergeStackUsingCircLinkeList(); 
		 MergeStackUsingCircLinkeList ms2 = new MergeStackUsingCircLinkeList(); 
	      
	     ms1.push(1); 
	     ms1.push(2); 
	     ms1.push(3); 
	     ms2.push(6); 
	     ms2.push(5); 
	     ms2.push(4); 
	      
	     ms1.merge(ms2); 
	     ms1.display(); 
	 } 
}

