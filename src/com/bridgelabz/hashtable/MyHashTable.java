package com.bridgelabz.hashtable;

/*
 * Hash Table implementation
 * using Linked List.
 */

public class MyHashTable<K, V> {

	// Size of hash table
	private final int SIZE = 10;

	// Array of Linked Lists
	private MyMapNode<K, V>[] table;

	@SuppressWarnings("unchecked")
	public MyHashTable() {

		table = new MyMapNode[SIZE];
	}

	// Generate hash index
	private int getIndex(K key) {

		return Math.abs(key.hashCode()) % SIZE;
	}

	// Add key-value pair
	public void add(K key, V value) {

		int index = getIndex(key);

		MyMapNode<K, V> head = table[index];

		// Update existing key
		while (head != null) {

			if (head.key.equals(key)) {

				head.value = value;
				return;
			}

			head = head.next;
		}

		// Insert new node
		MyMapNode<K, V> newNode = new MyMapNode<>(key, value);

		newNode.next = table[index];

		table[index] = newNode;
	}

	// Get value using key
	public V get(K key) {

		int index = getIndex(key);

		MyMapNode<K, V> head = table[index];

		while (head != null) {

			if (head.key.equals(key)) {

				return head.value;
			}

			head = head.next;
		}

		return null;
	}

	// Display Hash Table
	public void display() {

		for (int i = 0; i < SIZE; i++) {

			MyMapNode<K, V> head = table[i];

			while (head != null) {

				System.out.println(head.key + " : " + head.value);

				head = head.next;
			}
		}
	}
	// Remove a key from Hash Table
	public void remove(K key) {

		int index = getIndex(key);

		MyMapNode<K, V> current = table[index];
		MyMapNode<K, V> previous = null;

		while (current != null) {

			if (current.key.equals(key)) {

				if (previous == null) {

					table[index] = current.next;
				}

				else {

					previous.next = current.next;
				}

				return;
			}

			previous = current;
			current = current.next;
		}
	}
}