package com.bridgelabz.datastructures;

/*
 * UC3
 * Create Linked List using append() method.
 *
 * Sequence:
 * Create 56
 * Append 30
 * Append 70
 *
 * Final Output:
 * 56 -> 30 -> 70
 */

public class UC3Append {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Append elements
		linkedList.append(56);

		linkedList.append(30);

		linkedList.append(70);

		// Display Linked List
		System.out.println("Linked List:");

		linkedList.display();
	}
}