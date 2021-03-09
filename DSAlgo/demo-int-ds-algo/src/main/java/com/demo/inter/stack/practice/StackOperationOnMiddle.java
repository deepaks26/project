package com.demo.inter.stack.practice;

public class StackOperationOnMiddle {

	public static void main(String[] args) {
		StackOperationOnMiddle stack = new StackOperationOnMiddle();
		stack.push(stack,1);
		stack.push(stack,2);
		stack.push(stack,3);
		System.out.println("popped ->" + stack.pop());
		stack.push(4);
		System.out.println("top ->"+ stack.top.data);
		System.out.println("middle -> "+ stack.middle.data);
		System.out.println("popped ->" + stack.pop());
		System.out.println("popped ->" + stack.pop());
		System.out.println("top ->"+ stack.top.data);
		System.out.println("middle -> "+ stack.middle.data);
	}
	static class DNode {
		DNode prev;
		DNode next;
		int data;

		DNode(int data) {
			this.data = data;
		}
	}
	
	DNode top;
	DNode middle;
	int size;
	
	public void push(int data) {
		DNode newNode = new DNode(data);
		size++;
		if(top==null) {
			top = newNode;
			top.prev = null;
			top.next = null;
			middle = top;
		}else {
			newNode.next = top;
			newNode.prev = null;
			top.prev= newNode;
			top = newNode;
			if(size%2!=0) {
				middle = middle.prev;
			}
			
		}
	}
	
	public void push(StackOperationOnMiddle stack,int data) {
		DNode newNode = new DNode(data);
		newNode.prev = null;
		newNode.next = top;
		size++;
		if(size==1) {
			middle = newNode;
		}else {
			top.prev = newNode;
			if(size%2 != 0) {
				middle = middle.prev;
			}
		}
		top = newNode;
				
	}
	public int pop() {
		DNode temp = top;
		top = top.next;
		top.prev = null;
		size--;
		if(size%2==0) {
			middle = middle.next;
		}
		return temp.data;
	}
}
