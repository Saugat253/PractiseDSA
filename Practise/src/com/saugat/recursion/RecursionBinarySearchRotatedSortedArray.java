package com.saugat.recursion;

public class RecursionBinarySearchRotatedSortedArray {

	public static void main(String[] args) {
		// binary search  using recursion in rotated sorted array
		
		int[] arr = {8, 9, 1, 2, 4, 5, 6, 7};
		int target = 6;
		int result = search(arr, target, 0, arr.length - 1);

		System.out.println(result);
	}
	
	static int search(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(target == arr[mid]) {
				return mid;
			}
			if(arr[start] <= arr[mid]) {
				
				if(target >= arr[start] && target <= arr[mid]) {
					return search(arr, target, start, mid-1);
				}
				else {
					return search(arr, target, mid + 1, end);
				}
			}
			else {
				if(target >= arr[mid] && target <= arr[end]) {
					return search(arr, target, mid + 1, end);
				}
				else {
					return search(arr, target, start, mid-1);
				}
			}
		}
		
		return -1;
		
	}

}
