package com.bridgelabz.binarysearchtree;

/*
 * UC1, UC2 & UC3
 * Binary Search Tree Operations.
 */

public class BSTMain {

	public static void main(String[] args) {

		BinarySearchTree<Integer> bst =
				new BinarySearchTree<>();

		// UC1
		bst.add(56);
		bst.add(30);
		bst.add(70);

		// UC2
		bst.add(22);
		bst.add(40);
		bst.add(60);
		bst.add(95);
		bst.add(11);
		bst.add(65);
		bst.add(3);
		bst.add(16);
		bst.add(63);
		bst.add(67);

		System.out.println("Total Nodes : " + bst.size());

		// UC3
		if (bst.search(63)) {

			System.out.println("63 Found");
		}

		else {

			System.out.println("63 Not Found");
		}
	}
}