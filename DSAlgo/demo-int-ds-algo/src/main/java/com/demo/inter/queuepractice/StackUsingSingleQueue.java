package com.demo.inter.queuepractice;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

	static Queue<Integer> qu1 = new LinkedList<Integer>();
	static Queue<Integer> qu2 = new LinkedList<Integer>();
	
	static void push(int data) {
		qu1.add(data);
	}
	
	static int popRecur() {
		int poped= qu1.remove();
		if(qu1.isEmpty()) {
			return poped;
		}
		int data = popRecur();
		qu1.add(poped);
		return data;
	}
	
	static void pushWithTwoQueue(int data){
		while(!qu1.isEmpty()) {
			qu2.add(qu1.poll());
		}
		qu1.add(data);
		while(!qu2.isEmpty()) {
			qu1.add(qu2.poll());
		}
	}
	
	static int delete() {
		return qu1.poll();
	}
	
	
	static void pushWithForLoop(int data) {
		int size = qu1.size();
		qu1.add(data);
		for(int i=0;i<size;i++) {
			qu1.add(qu1.remove());
		}
	}
	
	static int deququeForLoop() {
		return qu1.remove();
	}
	public static void main(String[] args) {
		pushWithForLoop(1);
		pushWithForLoop(2);
		pushWithForLoop(3);
		System.out.println(deququeForLoop());
		System.out.println(deququeForLoop());
		
	}
}
