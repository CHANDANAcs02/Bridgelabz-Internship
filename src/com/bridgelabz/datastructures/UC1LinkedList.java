package com.bridgelabz.datastructures;

/*
 * UC1
 * Create a simple Linked List
 * with 56 -> 30 -> 70
 */
public class UC1LinkedList {

	public static void main(String[] args) {

		// Create Linked List object
		LinkedList<Integer> linkedList = new LinkedList<>();

		// Create Nodes
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);

		// Connect nodes
		linkedList.head = firstNode;

		firstNode.next = secondNode;

		secondNode.next = thirdNode;

		// Display Linked List
		System.out.println("Linked List:");

		linkedList.display();
	}
}