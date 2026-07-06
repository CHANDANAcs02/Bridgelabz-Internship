package com.bridgelabz.datastructures;

/*
 * LinkedList class to perform
 * basic Linked List operations.
 */
public class LinkedList<T> {

	// Head node
	Node<T> head;

	// Method to add node at beginning
	public void add(T data) {

		Node<T> newNode = new Node<>(data);

		newNode.next = head;

		head = newNode;
	}

	// Method to display Linked List
	public void display() {

		Node<T> temp = head;

		while (temp != null) {

			System.out.print(temp.data);

			if (temp.next != null) {

				System.out.print(" -> ");
			}

			temp = temp.next;
		}

		System.out.println();
	}
	// Method to append node at the end
	public void append(T data) {

		// Create new node
		Node<T> newNode = new Node<>(data);

		// If Linked List is empty
		if (head == null) {

			head = newNode;
			return;
		}

		// Traverse till last node
		Node<T> temp = head;

		while (temp.next != null) {

			temp = temp.next;
		}

		// Connect last node to new node
		temp.next = newNode;
	}
	// Method to insert a node after a given node
	public void insert(Node<T> previousNode, T data) {

		// Check if previous node exists
		if (previousNode == null) {

			System.out.println("Previous node cannot be null.");
			return;
		}

		// Create new node
		Node<T> newNode = new Node<>(data);

		// Link new node to next node
		newNode.next = previousNode.next;

		// Link previous node to new node
		previousNode.next = newNode;
	}
}
