package com.saugat.stringsAndStringBuilder;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="savas";
		int start = 0;
		int end = name.length()-1;
		boolean palindrome = false;
		while(start<=end) {
			if(name.charAt(start) == name.charAt(end)) {
				palindrome = true;
				start++;
				end--;
			} else {
				palindrome = false;
				break;
			}	
		}
		
		System.out.println("Palindrome Status = "+ palindrome);

	}

}
