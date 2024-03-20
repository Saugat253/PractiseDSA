package com.saugat.bubbleSort;

import java.util.Arrays;

public class SimpleBubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};	
		int[] result = bubbleSort(arr);
		System.out.println(Arrays.toString(result));
		
	}
	
	static int[] bubbleSort(int[] arr) {
		// run the steps n-1 times
		for(int i=0; i<arr.length; i++) {
			// for each step, max item will come at the last respective index
			boolean swap = false;
			for(int j=1; j<arr.length - i; j++) {
				// swap if the item is smaller than previous item
				if (arr[j] < arr[j-1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					// set swap status to true for that parse
					swap = true;
				}
			}
			System.out.println("parse no = "+ (i+1));
			System.out.println("Swap done = "+ swap);
			if(!swap) {
				System.out.println("Since Swap did not occured, means already Sorted So returning array");
				return arr;
			}
		}
		return arr;
	}

}
