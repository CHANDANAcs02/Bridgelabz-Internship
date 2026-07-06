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
	
	// Method to delete the first node
	public void pop() {

		// Check if Linked List is empty
		if (head == null) {

			System.out.println("Linked List is empty.");
			return;
		}

		// Move head to next node
		head = head.next;
	}
	
	// Method to delete the last node
	public void popLast() {

		// Check if Linked List is empty
		if (head == null) {

			System.out.println("Linked List is empty.");
			return;
		}

		// If only one node is present
		if (head.next == null) {

			head = null;
			return;
		}

		// Traverse to second last node
		Node<T> temp = head;

		while (temp.next.next != null) {

			temp = temp.next;
		}

		// Remove last node
		temp.next = null;
	}
	// Method to search a node by value
	public Node<T> search(T key) {

		// Start from head node
		Node<T> temp = head;

		// Traverse the Linked List
		while (temp != null) {

			// Compare data with key
			if (temp.data.equals(key)) {

				return temp;
			}

			temp = temp.next;
		}

		// Return null if node is not found
		return null;
	}
	// Method to delete a node by value
	public void delete(T key) {

		// Check if Linked List is empty
		if (head == null) {

			return;
		}

		// If head node contains the key
		if (head.data.equals(key)) {

			head = head.next;
			return;
		}

		// Traverse the Linked List
		Node<T> temp = head;

		while (temp.next != null) {

			if (temp.next.data.equals(key)) {

				temp.next = temp.next.next;

				return;
			}

			temp = temp.next;
		}
	}
	
	// Method to find size of Linked List
	public int size() {

		int count = 0;

		Node<T> temp = head;

		while (temp != null) {

			count++;

			temp = temp.next;
		}

		return count;
	}
}
