package com.saugat.recursion;

public class CountNumOfZero {

	public static void main(String[] args) {
		
		int num = 354000;
		int result = countZero(num, 0);

		System.out.println(result);
	}
	
	static int countZero(int num, int count) {
		
		if(num == 0) {
			return count;
		}
		int rem = num % 10;
		if(rem == 0) {
			count++;
		}
		return countZero(num/10, count);
	}

}
