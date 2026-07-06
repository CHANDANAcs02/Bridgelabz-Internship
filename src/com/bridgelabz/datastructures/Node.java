package com.bridgelabz.datastructures;

/*
 * Node class represents each element
 * in the Linked List.
 */
public class Node<T> {

	// Data stored in the node
	T data;

	// Reference to next node
	Node<T> next;

	// Parameterized constructor
	public Node(T data) {

		this.data = data;
		this.next = null;
	}
}