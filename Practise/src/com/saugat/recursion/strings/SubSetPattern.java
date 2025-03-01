package com.saugat.recursion.strings;

import java.util.ArrayList;

public class SubSetPattern {

	public static void main(String[] args) {
		// generate all the subset possibility
		
		String word = "aeiou";
		//ArrayList<String> subSets = new ArrayList<String>(); 
		generateSubSet("", word);
//		ArrayList<String> subSets2 =generateSubSet2("", word, subSets);
//       System.out.println(subSets2);
	}
	
	static void generateSubSet(String subset, String word){
	
		if(word.isEmpty()) {
			System.out.println(subset);
			return ;
		}
		
		char ch = word.charAt(0);
		generateSubSet(subset+ch, word.substring(1));
		generateSubSet(subset, word.substring(1));
		
	}
	
	static ArrayList<String> generateSubSet2(String subset, String word, ArrayList<String> subsets){
		
		if(word.isEmpty()) {
			subsets.add(subset);
			return subsets;
		}
		
		char ch = word.charAt(0);
		
		subsets = generateSubSet2(subset+ch, word.substring(1), subsets);
		subsets = generateSubSet2(subset, word.substring(1), subsets);
	
		return subsets;
		
	}

}
