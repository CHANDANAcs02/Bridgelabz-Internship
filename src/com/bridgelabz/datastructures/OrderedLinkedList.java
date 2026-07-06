package com.bridgelabz.datastructures;

/*
 * UC10
 * Ordered Linked List
 * Elements are inserted in ascending order.
 */

public class OrderedLinkedList<T extends Comparable<T>> {

	// Head node
	Node<T> head;

	// Method to insert elements in sorted order
	public void add(T data) {

		// Create new node
		Node<T> newNode = new Node<>(data);

		// If list is empty or new node is smallest
		if (head == null || head.data.compareTo(data) > 0) {

			newNode.next = head;
			head = newNode;
			return;
		}

		// Traverse to find correct position
		Node<T> temp = head;

		while (temp.next != null &&
				temp.next.data.compareTo(data) < 0) {

			temp = temp.next;
		}

		// Insert node
		newNode.next = temp.next;
		temp.next = newNode;
	}

	// Display Linked List
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