package com.saugat.recursion.sorting;

import java.util.Arrays;

public class SelectionSortRecursion {

	public static void main(String[] args) {
		
		int[] arr = {7, 6, 4, 3, 2, 1};
		selectionSort(arr, arr.length, 0, 0);
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void selectionSort(int[] arr, int r, int c, int maxCol) {
		
		if(r < 1) {
			return;
		}
		
		if(r > c) {
			if(arr[c] > arr[maxCol]) {
				selectionSort(arr, r, c+1, c);
			}
			else {
				selectionSort(arr, r, c+1, maxCol);
			}
		}
		else {
			int temp = arr[maxCol];
			arr[maxCol] = arr[r-1];
			arr[r-1] = temp;
			
			selectionSort(arr, r-1, 0, 0);
		}
	}

}
