package com.bridgelabz.hashtable;

/*
 * Node class to store
 * Key-Value pair.
 */

public class MyMapNode<K, V> {

	K key;
	V value;

	MyMapNode<K, V> next;

	// Parameterized Constructor
	public MyMapNode(K key, V value) {

		this.key = key;
		this.value = value;
	}
}