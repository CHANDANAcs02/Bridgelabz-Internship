package com.bridgelabz.datastructures;

/*
 * UC4
 * Insert 30 between 56 and 70
 *
 * Initial List:
 * 56 -> 70
 *
 * Final List:
 * 56 -> 30 -> 70
 */

public class UC4Insert {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create nodes
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(70);

		// Connect 56 -> 70
		linkedList.head = firstNode;
		firstNode.next = secondNode;

		// Insert 30 after 56
		linkedList.insert(firstNode, 30);

		// Display Linked List
		System.out.println("Linked List:");

		linkedList.display();
	}
}