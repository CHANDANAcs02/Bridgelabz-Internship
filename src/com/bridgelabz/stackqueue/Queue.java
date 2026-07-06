package com.bridgelabz.stackqueue;

import com.bridgelabz.datastructures.LinkedList;

/*
 * UC3 & UC4
 * Queue implementation using Linked List.
 */

public class Queue<T> {

	// Linked List object
	private LinkedList<T> linkedList = new LinkedList<>();

	// Enqueue element
	public void enqueue(T data) {

		linkedList.append(data);
	}

	// Dequeue element
	public T dequeue() {

		T data = linkedList.peek();

		if (data != null) {

			linkedList.pop();
		}

		return data;
	}

	// Check whether queue is empty
	public boolean isEmpty() {

		return linkedList.isEmpty();
	}

	// Display Queue
	public void display() {

		linkedList.display();
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new Queue<>();

		// UC3 - Enqueue elements
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);

		System.out.println("Queue:");

		queue.display();

		// UC4 - Dequeue elements
		System.out.println("\nDequeuing Elements:");

		while (!queue.isEmpty()) {

			System.out.println("Removed : " + queue.dequeue());

			queue.display();
		}
	}
}