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
}