package com.demo.inter.stack.practice;

import java.util.Stack;

public class CustomDSWithO1 {

	static class DNode{
		DNode next;
		DNode prev;
		int data;
		public DNode(int data) {
			this.data = data;
		}
	}
	
	DNode head;
	DNode tail;
	DNode mid;
	int size;
	Stack<Integer> auxStack = new Stack<Integer>();
	int minElemnt=0;
	
	public void push(int data) {
		DNode newNode = new DNode(data);
		newNode.prev = null;
		newNode.next = tail;
		size++;
		if(size==1) {
			head = newNode;
			mid = newNode;
			minElemnt = newNode.data;
			auxStack.push(data);
		}else {
			tail.prev = newNode;
			if(size%2!=0) {
				mid = mid.prev;
			}
			if(size==2) {
				head.prev = newNode;
			}
			
			//min
			int y = auxStack.pop();
			if(data<y) {
				auxStack.push(data);
			}else {
				auxStack.push(y);
			}
		
		}
		tail = newNode;
	}
	public int removeFirst() {
		int data = tail.data;
		DNode temp = tail.next;
		size--;
		temp.prev = null;
		tail = temp;
		if(size%2==0) {
			mid = mid.next;
		}
		return data;
	}
	
	public int removeLast() {
		int data = head.data;
		DNode temp = head.prev;
		head = head.prev;
		head.prev = temp.prev;
		head.next = null;
		size--;
		if(size%2!=0) {
			mid = mid.prev;
		}
		return data;
	}
	
	public int findMinElement() {
		return auxStack.peek();
	}
	
	public void display() {
		DNode temp = tail;
		while(temp != null) {
			System.out.println(temp.data +" -> " );
			temp = temp.next;
		}

	}
	public static void main(String[] args) {
		CustomDSWithO1 cs = new CustomDSWithO1();
		cs.push(1);
		cs.push(2);
		cs.push(3);
		cs.display();
		System.out.println("mid -> "+ cs.mid.data);
		System.out.println("minElement -> "+ cs.findMinElement());
		cs.push(4);
		cs.removeLast();
		cs.display();
		System.out.println("mid -> "+ cs.mid.data);
		System.out.println("minElement -> "+ cs.findMinElement());
		
	}
}
