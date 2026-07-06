package com.bridgelabz.hashtable;

/*
 * UC2 & UC3
 * Find frequency of words in a paragraph
 * and remove the word "avoidable".
 */

public class HashTableMain {

	public static void main(String[] args) {

		String paragraph = "Paranoids are not paranoid because they are paranoid "
				+ "but because they keep putting themselves deliberately "
				+ "into paranoid avoidable situations";

		String[] words = paragraph.toLowerCase().split(" ");

		MyHashTable<String, Integer> hashTable =
				new MyHashTable<>();

		// Count word frequency
		for (String word : words) {

			Integer count = hashTable.get(word);

			if (count == null) {

				hashTable.add(word, 1);
			}

			else {

				hashTable.add(word, count + 1);
			}
		}

		System.out.println("Before Removing:");

		hashTable.display();

		// Remove avoidable
		hashTable.remove("avoidable");

		System.out.println("\nAfter Removing 'avoidable':");

		hashTable.display();
	}
}