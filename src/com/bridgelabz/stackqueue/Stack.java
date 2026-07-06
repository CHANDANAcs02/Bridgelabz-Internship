package com.bridgelabz.stackqueue;

import com.bridgelabz.datastructures.LinkedList;

/*
 * UC1 & UC2
 * Stack implementation using Linked List.
 */

public class Stack<T> {

	// Linked List object
	private LinkedList<T> linkedList = new LinkedList<>();

	// Push element onto stack
	public void push(T data) {

		linkedList.add(data);
	}

	// Peek top element
	public T peek() {

		return linkedList.peek();
	}

	// Pop top element
	public T pop() {

		T data = linkedList.peek();

		if (data != null) {

			linkedList.pop();
		}

		return data;
	}

	// Check if stack is empty
	public boolean isEmpty() {

		return linkedList.isEmpty();
	}

	// Display Stack
	public void display() {

		linkedList.display();
	}

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();

		// UC1 - Push Elements
		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println("Stack:");

		stack.display();

		// UC2 - Peek
		System.out.println("\nTop Element : " + stack.peek());

		// UC2 - Pop till stack is empty
		System.out.println("\nPopping Elements:");

		while (!stack.isEmpty()) {

			System.out.println("Removed : " + stack.pop());

			stack.display();
		}
	}
}