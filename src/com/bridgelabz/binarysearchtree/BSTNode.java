package com.bridgelabz.binarysearchtree;

/*
 * Node class for Binary Search Tree.
 */

public class BSTNode<T extends Comparable<T>> {

	T data;

	BSTNode<T> left;
	BSTNode<T> right;

	// Parameterized Constructor
	public BSTNode(T data) {

		this.data = data;
	}
}