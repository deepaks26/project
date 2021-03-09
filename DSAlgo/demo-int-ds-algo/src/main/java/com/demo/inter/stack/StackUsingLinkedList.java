package com.demo.inter.stack;

public class StackUsingLinkedList {

	public StackNode root;

	public static void main(String[] args) {
		/*
		 * StackUsingLinkedList stack = new StackUsingLinkedList(); stack.push(4);
		 * stack.push(6); stack.push(2); stack.push(1); //stack.push(4);
		 * stack.printStack(stack); //stack.reverseStack(); //stack.printStack(stack);
		 * StackUsingLinkedList sorted= stack.sortStack(stack);
		 * System.out.println("afte sort"); stack.printStack(sorted);
		 */
		System.out.println(reverseString("123"));
		
	}

	public void push(int data) {
		StackNode newNode = new StackNode(data);

		if (null == root) {
			root = newNode;
		} else {
			StackNode temp = root;
			root = newNode;
			root.next = temp;
		}
	}

	public Integer pop(StackUsingLinkedList stack) {
		if (null == stack.root) {
			System.out.println("empty stack");
			return 0;
		} else {
			int popped = stack.root.data;
			stack.root = stack.root.next;
			return popped;
		}
	}

	public void printStack(StackUsingLinkedList stack) {
		StackNode sn = stack.root;
		while (sn != null) {
			System.out.println(sn.data);
			sn = sn.next;
		}
	}

	public boolean isEmpty() {
		if (this.root == null) {
			return true;
		} else {
			return false;
		}

	}

	public void reverseStack() {
		if (this.isEmpty()) {
			return;
		}
		// Remove bottom element from stack
		int bottom = popBottom();

		// Reverse everything else in stack
		reverseStack();

		// Add original bottom element to top of stack
		this.push(bottom);
	}

	private int popBottom() {
		int top = 0;//this.pop();
		if (this.isEmpty()) {
			// If we removed the last element, return it
			return top;
		} else {
			// We didn't remove the last element, so remove the last element from what
			// remains
			int bottom = popBottom();
			// Since the element we removed in this function call isn't the bottom element,
			// add it back onto the top of the stack where it came from
			this.push(top);
			return bottom;
		}
	}

	private StackUsingLinkedList sortStack(StackUsingLinkedList input) {
		StackUsingLinkedList tempStack = new StackUsingLinkedList();
		while (input.root != null) {
			int data = input.pop(input);
			if (tempStack.root == null) {
				tempStack.push(data);

			} else {
				// sorting order
				if (tempStack.root.data < data) {
					tempStack.push(data);
				} else {
					StackNode sn = tempStack.root;
					while (sn.next != null) {
						if(sn.next.data<data) {
							StackNode next = sn.next;
							sn.next= new StackNode(data);
							sn.next.next=next;
							break;
						}else {
							sn = sn.next;
						}
					}
				}
			}
		}
		return tempStack;
	}
	private static String reverseString(String input) {
		StringBuffer output= new StringBuffer();
		StackUsingLinkedList stack = new  StackUsingLinkedList();
		for(int i=0;i<input.length();i++) {
			String s = Character.toString(input.charAt(i));
			stack.push(Integer.parseInt(s));
		}
		
		for(int i=0;i<input.length();i++) {
			
			output.append(((Integer)stack.pop(stack)).toString());
		}

		return output.toString();
		
	}

}