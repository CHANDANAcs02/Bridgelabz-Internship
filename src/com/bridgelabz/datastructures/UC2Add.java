package com.bridgelabz.datastructures;

/*
 * UC2
 * Create Linked List using add() method.
 *
 * Sequence:
 * Create 70
 * Add 30 before 70
 * Add 56 before 30
 *
 * Final Output:
 * 56 -> 30 -> 70
 */

public class UC2Add {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Add elements
		linkedList.add(70);

		linkedList.add(30);

		linkedList.add(56);

		// Display Linked List
		System.out.println("Linked List:");

		linkedList.display();
	}
}