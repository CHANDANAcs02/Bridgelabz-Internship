package com.bridgelabz.datastructures;

/*
 * UC10
 * Create Ordered Linked List.
 *
 * Input:
 * 56,30,40,70
 *
 * Output:
 * 30 -> 40 -> 56 -> 70
 */

public class UC10OrderedList {

	public static void main(String[] args) {

		// Create Ordered Linked List
		OrderedLinkedList<Integer> linkedList =
				new OrderedLinkedList<>();

		// Add elements
		linkedList.add(56);

		linkedList.add(30);

		linkedList.add(40);

		linkedList.add(70);

		// Display Linked List
		System.out.println("Ordered Linked List:");

		linkedList.display();
	}
}