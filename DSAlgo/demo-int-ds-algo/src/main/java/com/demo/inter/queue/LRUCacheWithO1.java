package com.demo.inter.queue;

import java.util.HashMap;

public class LRUCacheWithO1<K, V> {

	static class Node<K, V> {
		K key;
		V value;
		Node next;
		Node prev;

		Node(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}

	HashMap<K, Node> map = new HashMap<K, Node>();
	int capacity;
	int count;
	Node head;
	Node tail;

	public LRUCacheWithO1(int capacity) {
		this.capacity = capacity;
		head = new Node(0, 0);
		tail = new Node(0, 0);
		count = 0;
		head.next = tail;
		tail.prev = head;
	}

	V get(K key) {
		if (map.containsKey(key)) {
			Node temp = map.get(key);
			deleteNode(temp);
			addToHead(temp);
			System.out.println("Got the value : " + temp.value + " for the key: " + key);
			return (V) temp.value;
		} else {
			System.out.println("Did not get any value" + " for the key: " + key);
			return null;
		}
	}

	private void addToHead(Node temp) {
		temp.next = head.next;
		head.next.prev = temp;
		temp.prev = head;
		head.next = temp;
	}

	private void deleteNode(Node temp) {
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
	}

	void set(K key, V value) {
		System.out.println("Going to set the (key, " + "value) : (" + key + ", " + value + ")");
		if (map.containsKey(key)) {
			Node temp = map.get(value);
			deleteNode(temp);
			addToHead(temp);
		} else {
			Node node = new Node<K, V>(key, value);
			map.put(key, node);
			if (count < capacity) {
				count++;
				addToHead(node);
			} else {
				map.remove(tail.prev.key);
				deleteNode(tail.prev);
				addToHead(node);

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
