package com.demo.inter.queuepractice;

import java.util.function.Function;
import java.util.function.Predicate;

public class CircularQueuUsingLinkedList {

	int charCount;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	Node front;
	Node rear;

	void enqueu(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			rear = front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
			rear.next = front;
		}
	}

	int deQuque() {
		int data = front.data;
		front = front.next;
		rear.next = front;
		return data;
	}

	public static Predicate<String> m1(String args) {

		Function<String, CircularQueuUsingLinkedList> fun = s -> m2(s);

		Predicate<String> prd = (str) -> str.startsWith(args);
		return prd;
	}

	static CircularQueuUsingLinkedList m2(String s) {
		return null;
	}

	static int countManipulations(String s1, String s2) {
		int count = 0;

		// store the count of character
		int char_count[] = new int[26];

		// iterate though the first String and update
		// count
		for (int i = 0; i < s1.length(); i++)
			char_count[s1.charAt(i) - 'a']++;

		// iterate through the second string
		// update char_count.
		// if character is not found in char_count
		// then increase count
		for (int i = 0; i < s2.length(); i++) {
			char_count[s2.charAt(i) - 'a']--;
		}

		for (int i = 0; i < 26; ++i) {
			if (char_count[i] != 0) {
				count += Math.abs(char_count[i]);
			}
		}

		return count;
	}

	// Driver code
	static int countAlteration(String s1, String s2) {
		int count = 0;
		int char_count[] = new int[26];
		for (int i = 0; i < 26; i++) {
			char_count[i] = 0;
		}
		for (int i = 0; i < s1.length(); i++)
			char_count[s1.charAt(i) - 'a']++;
		
		
		for (int i = 0; i < s2.length(); i++) {
			char_count[s2.charAt(i) - 'a']--;
			if (char_count[s2.charAt(i) - 'a'] < 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String s1 = "cc", s2 = "cd";
		System.out.println(countAlteration(s1, s2));
	}

}