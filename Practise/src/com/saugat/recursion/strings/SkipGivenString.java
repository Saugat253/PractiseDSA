package com.saugat.recursion.strings;

public class SkipGivenString {

	public static void main(String[] args) {
		// Skip the word apple if exists
		
		String word = "Saugatapplbgha";
		
		String result = skipApple(word);
		System.out.println(result);

	}
	
	static String skipApple(String word) {
		if(word.isEmpty()) {
			return "";
		}
		
		if(word.startsWith("apple")) {
			return skipApple(word.substring(5));
		}
		else {
			return word.charAt(0) + skipApple(word.substring(1));
		}
	}

}
