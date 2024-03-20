package com.saugat.insertionSort;

import java.util.Arrays;

public class SimpleInsertionSort {

	public static void main(String[] args) {

		int[] arr =   {1, 2, 3, 4, 5, 8, 9};
		int[] result = insertionSort(arr);
		
		System.out.println(Arrays.toString(result));;

	}
	
	static int[] insertionSort(int[] arr) {
		int comparison = 0;
		for(int i=0; i<arr.length-1; i++) {	
			for(int j=i+1; j>0; j--) {
				comparison++;
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					System.out.println("Already Sorted So breaking the Loop");
					break;
				}
			}
			System.out.println("Total comparison made after completing pass no: "+ (i+1) + " = " + comparison );
		}
		
		return arr;
	}

}
