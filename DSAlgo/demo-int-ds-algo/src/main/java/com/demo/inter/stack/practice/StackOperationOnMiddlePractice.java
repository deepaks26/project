package com.demo.inter.stack.practice;

public class StackOperationOnMiddlePractice {

	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	static Node top;
	static Node mid;
	static int size=0;
	static void push(int data) {
		Node newNode = new Node(data);
		if(top==null) {
			top = newNode;
			mid = top;
			size++;
		}else {
			newNode.next = top;
			top.prev= newNode;
			top = newNode;
			size++;
			if(size%2!=0) {
				mid = mid.prev;
			}
		}
	}
	
	static int pop() {
		int poped = top.data;
		top = top.next;
		top.prev= null;
		size--;
		if(size%2==0) {
			mid = mid.next;
		}
		return poped;
	}
	
	public static void main(String[] args) {
		StackOperationOnMiddlePractice stack = new StackOperationOnMiddlePractice();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("popped ->" + stack.pop());
		stack.push(4);
		System.out.println("top ->"+ stack.top.data);
		System.out.println("middle -> "+ stack.mid.data);
		System.out.println("popped ->" + stack.pop());
		System.out.println("popped ->" + stack.pop());
		System.out.println("top ->"+ stack.top.data);
		System.out.println("middle -> "+ stack.mid.data);
	}
}
