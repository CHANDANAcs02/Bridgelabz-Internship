package com.bridgelabz.datastructures;

/*
 * UC6
 * Delete the last element
 * from the Linked List.
 *
 * Initial List:
 * 56 -> 30 -> 70
 *
 * Final List:
 * 56 -> 30
 */

public class UC6PopLast {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Linked List
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);

		System.out.println("Before Deleting Last Node:");

		linkedList.display();

		// Delete last node
		linkedList.popLast();

		System.out.println("After Deleting Last Node:");

		linkedList.display();
	}
}