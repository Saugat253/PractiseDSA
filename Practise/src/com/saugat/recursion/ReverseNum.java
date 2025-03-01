package com.saugat.recursion;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num = 843504;
		int result = rev(num);
		
		System.out.println(result);

	}
	
	static int rev(int num) {
		
		int digits = (int)Math.log10(num) + 1;
		
		return helper(num, digits);
		
	}
	
	static int helper(int num, int digits) {
		if(num == 0) {
			return 0;
		}
		int rem = num % 10;
		return (rem * (int)Math.pow(10, digits-1)) + helper(num/10, digits-1);
	}

}
