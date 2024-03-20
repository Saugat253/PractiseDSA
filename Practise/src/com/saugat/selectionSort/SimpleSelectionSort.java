package com.saugat.selectionSort;

import java.util.Arrays;

public class SimpleSelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 2, 3, 1};
		int[] result = selectionSort(arr);
		System.out.println(Arrays.toString(result));

	}
	
	static int[] selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int last = arr.length - i -1;
			int maxIndex = getMaxIndex(arr, 0, last);
			swap(arr, maxIndex, last);
		}
		return arr;
	}
	
	static int getMaxIndex(int[] arr, int start, int last) {
		int max = start;
		for(int i=start; i<=last; i++) {
			if(arr[max] < arr[i]) {
				max = i;
			}
		}
		return max;
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}


}
