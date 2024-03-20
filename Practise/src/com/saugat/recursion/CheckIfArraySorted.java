package com.saugat.recursion;

public class CheckIfArraySorted {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 6, 7, 8, 10, 11, 12, 5};
		
		boolean result = isSorted(arr, 0);
		System.out.println(result);

	}
	
	static boolean isSorted(int[] arr, int index) {
		
		if(index == arr.length -1) {
			return true;
		}
		
		return (arr[index] < arr[index + 1]) && isSorted(arr, index + 1);
	}

}
