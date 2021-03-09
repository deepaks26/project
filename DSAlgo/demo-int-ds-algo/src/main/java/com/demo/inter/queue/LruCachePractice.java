package com.demo.inter.queue;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class LruCachePractice {

	Deque<Integer> queue;
	Set<Integer> set;
	int size;

	public LruCachePractice(int size) {
		queue = new LinkedList();
		set = new HashSet<Integer>();
		this.size  = size;
	}
	
	public void referPage(int page) {
		
		if(set.contains(page)) {
			queue.remove(page);
			queue.push(page);
			set.add(page);
		}else {
			if(queue.size()==size) {
				queue.removeLast();
				set.remove(page);
				queue.push(page);
				set.remove(page);
			}
			
		}
	} 
}

