package com.bridgelabz.datastructures;

/*
 * UC9
 * Delete node with value 40
 * and display Linked List size.
 *
 * Initial List:
 * 56 -> 30 -> 40 -> 70
 *
 * Final List:
 * 56 -> 30 -> 70
 */

public class UC9Delete {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Linked List
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(40);
		linkedList.append(70);

		System.out.println("Before Deletion:");

		linkedList.display();

		// Delete node containing 40
		linkedList.delete(40);

		System.out.println("After Deletion:");

		linkedList.display();

		// Display Linked List size
		System.out.println("Size of Linked List : "
				+ linkedList.size());
	}
}