package com.bridgelabz.searching;

/*
 * Linear Search
 * Find first sentence containing a word.
 */

public class SearchSentence {

	public static String searchSentence(String[] sentences, String word) {

		for (String sentence : sentences) {

			if (sentence.toLowerCase().contains(word.toLowerCase())) {

				return sentence;
			}
		}

		return "Not Found";
	}

	public static void main(String[] args) {

		String[] sentences = {
				"Java is easy to learn",
				"BridgeLabz provides training",
				"Data Structures are important"
		};

		String result = searchSentence(sentences, "BridgeLabz");

		System.out.println(result);
	}
}