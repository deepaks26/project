package com.demo.inter.queue;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithO1Pract {

	class Node{
		int key;
		int value;
		Node next;
		Node prev;
		
		Node(int  key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	Node head;
	Node tail;
	Map<Integer,Node> map = new HashMap<>();
	int capacity;
	int count;
	
	public LRUCacheWithO1Pract(int capa) {
		this.capacity= capa;
		head = new Node(0,0);
		tail = new Node(0,0);
		head.next = tail;
		tail.prev = head;
	}
	void deleteNode(Node temp){
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
	}
	int get(int key) {
		if(map.get(key)!= null) {
			Node value = map.get(key);
			deleteNode(value);
			addToHead(value);
			return value.value;
		}else {
			return -1;
		}
	}
	private void addToHead(Node temp) {
		temp.next = head.next;
		head.next.prev = temp;
		temp.prev = head;
		head.next = temp;
	}
	
	void set(int key,int value) {
		
		
		if(map.get(key)!= null) {
			Node temp = map.get(key);
			deleteNode(temp);
			addToHead(temp);
		}else {
			Node temp = new Node(key,value);
			map.put(key,temp);
			if(count<capacity) {
				addToHead(temp);
			}else {
				map.remove(tail.prev);
				deleteNode(tail.prev);
				addToHead(temp);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Going to test the LRU " + " Cache Implementation");
		LRUCacheWithO1 cache = new LRUCacheWithO1<Integer, Integer>(2);
		cache.set(1, 10);
		cache.set(2, 20);
		System.out.println("Value for the key: 1 is " + cache.get(1));
		// evicts key 2 and store a key (3) with
		// value 30 in the cache.
		cache.set(3, 30);
		System.out.println("Value for the key: 2 is " + cache.get(2)); // returns -1 (not found)

		// evicts key 1 and store a key (4) with
		// value 40 in the cache.
		cache.set(4, 40);
		System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found)
		System.out.println("Value for the key: 3 is " + cache.get(3)); // returns 30
		System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40

	}

}
