package com.saugat.recursion.sorting;

import java.util.Arrays;

public class BubbleSortRecursion {

	public static void main(String[] args) {
		
		int[] arr = {7, 6, 4, 2, 1};
		bubbleSort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));

	}
	
	static void bubbleSort(int[] arr, int r, int c) {
		
		if(r < 1) {
			return ;
		}
		
		if(r > c) {
			if(arr[c] > arr[c+1]) {
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1] = temp;
				
				bubbleSort(arr, r, c + 1);
			}
		}
		else {
			bubbleSort(arr, r-1, 0);
		}
	}

}
