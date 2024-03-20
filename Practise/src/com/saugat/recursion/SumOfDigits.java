package com.saugat.recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int num = 2543123;
		int result = sumDig(num);
		
		System.out.println(result);

	}
	
	static int sumDig(int num) {
		
		if(num == 0) {
			return 0;
		}
		int rem = num % 10;
		num = num/10;
		return rem + sumDig(num);
	}

}
