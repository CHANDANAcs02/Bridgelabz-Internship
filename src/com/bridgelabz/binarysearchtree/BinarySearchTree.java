package com.bridgelabz.binarysearchtree;

/*
 * Binary Search Tree implementation.
 */

public class BinarySearchTree<T extends Comparable<T>> {

	private BSTNode<T> root;

	// Add node
	public void add(T data) {

		root = addRecursive(root, data);
	}

	private BSTNode<T> addRecursive(BSTNode<T> current, T data) {

		if (current == null) {

			return new BSTNode<>(data);
		}

		if (data.compareTo(current.data) < 0) {

			current.left = addRecursive(current.left, data);
		}

		else if (data.compareTo(current.data) > 0) {

			current.right = addRecursive(current.right, data);
		}

		return current;
	}

	// Find total nodes
	public int size() {

		return size(root);
	}

	private int size(BSTNode<T> node) {

		if (node == null) {

			return 0;
		}

		return 1 + size(node.left) + size(node.right);
	}

	// Search node
	public boolean search(T key) {

		return search(root, key);
	}

	private boolean search(BSTNode<T> node, T key) {

		if (node == null) {

			return false;
		}

		if (key.compareTo(node.data) == 0) {

			return true;
		}

		if (key.compareTo(node.data) < 0) {

			return search(node.left, key);
		}

		return search(node.right, key);
	}
}