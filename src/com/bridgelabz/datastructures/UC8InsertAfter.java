package com.bridgelabz.datastructures;

/*
 * UC8
 * Search the Linked List for 30
 * and insert 40 after it.
 *
 * Initial List:
 * 56 -> 30 -> 70
 *
 * Final List:
 * 56 -> 30 -> 40 -> 70
 */

public class UC8InsertAfter {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Linked List
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);

		System.out.println("Before Insertion:");

		linkedList.display();

		// Search for node with value 30
		Node<Integer> node = linkedList.search(30);

		// Insert 40 after 30
		if (node != null) {

			linkedList.insert(node, 40);
		}

		System.out.println("After Insertion:");

		linkedList.display();
	}
}