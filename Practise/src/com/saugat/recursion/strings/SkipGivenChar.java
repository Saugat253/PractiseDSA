package com.saugat.recursion.strings;

public class SkipGivenChar {

	public static void main(String[] args) {
		// program to remove a from given String using recursion
		String word = "abbshabnjkteamolxaqpdcaa";
		skip("",word);
		
		// another way
        String result = skip2(word);
        System.out.println(result);
	}
	
	static void skip(String result, String word) {
		
		if(word.isEmpty()) {
			System.out.println(result);
			return;
		}
		
		char ch = word.charAt(0);
		
		if(ch == 'a' || ch == 'A') {
			skip(result, word.substring(1));
		}
		else {
			skip(result+ch, word.substring(1));
		}
	}
	
	static String skip2(String word) {
		
		if(word.isEmpty()) {
			return "";
		}
		char ch = word.charAt(0);
		if(ch == 'a' || ch == 'A') {
			return skip2(word.substring(1));
		}
		else {
			return ch + skip2(word.substring(1));
		}
	}

}
