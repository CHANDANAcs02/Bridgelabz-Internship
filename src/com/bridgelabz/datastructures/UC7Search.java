package com.bridgelabz.datastructures;

/*
 * UC7
 * Search a node in the Linked List.
 *
 * Linked List:
 * 56 -> 30 -> 70
 */

public class UC7Search {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Linked List
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);

		System.out.println("Linked List:");

		linkedList.display();

		// Search for node with value 30
		Node<Integer> foundNode = linkedList.search(30);

		// Display result
		if (foundNode != null) {

			System.out.println("Node Found : " + foundNode.data);
		}

		else {

			System.out.println("Node Not Found");
		}
	}
}