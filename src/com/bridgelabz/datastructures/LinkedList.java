package com.bridgelabz.datastructures;

/*
 * LinkedList class to create
 * a simple Linked List.
 */
public class LinkedList<T> {

	// Head node
	Node<T> head;

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