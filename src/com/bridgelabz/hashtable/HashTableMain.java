package com.bridgelabz.hashtable;

/*
 * UC1
 * Find frequency of words
 * in a sentence.
 */

public class HashTableMain {

	public static void main(String[] args) {

		String sentence = "To be or not to be";

		String[] words = sentence.toLowerCase().split(" ");

		MyHashTable<String, Integer> hashTable =
				new MyHashTable<>();

		for (String word : words) {

			Integer count = hashTable.get(word);

			if (count == null) {

				hashTable.add(word, 1);
			}

			else {

				hashTable.add(word, count + 1);
			}
		}

		System.out.println("Word Frequency:");

		hashTable.display();
	}
}