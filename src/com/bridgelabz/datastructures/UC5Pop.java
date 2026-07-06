package com.bridgelabz.datastructures;

/*
 * UC5
 * Delete the first element
 * from the Linked List.
 *
 * Initial List:
 * 56 -> 30 -> 70
 *
 * Final List:
 * 30 -> 70
 */

public class UC5Pop {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Linked List
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);

		System.out.println("Before Deleting First Node:");

		linkedList.display();

		// Delete first node
		linkedList.pop();

		System.out.println("After Deleting First Node:");

		linkedList.display();
	}
}