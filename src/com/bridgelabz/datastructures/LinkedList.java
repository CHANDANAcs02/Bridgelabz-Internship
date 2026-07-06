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
}
