package com.saugat.recursion.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {19, 16, 18, 8, 12, 15, 5, 2, 1};
		
		int[] result = mergeSort(arr);
		System.out.println(Arrays.toString(result));

	}
	
	static int[] mergeSort(int[] arr) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length/2;
		int[] first = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] second = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(first, second);
	}
	
	static int[] merge(int[] first, int[] second) {
		
		int[] mergedArray = new int[first.length + second.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < first.length && j < second.length) {
			if(first[i] < second[j]) {
				mergedArray[k] = first[i];
				i++;
			} else {
				mergedArray[k] = second[j];
				j++;
			}
			k++;
		}
		
		while(i < first.length) {
			mergedArray[k] = first[i];
			i++;
			k++;
		}
		
		while(j < second.length) {
			mergedArray[k] = second[j];
			j++;
			k++;
		}
		return mergedArray;
	}

}
