package com.saugat.binarySearch;

public class PeakOfMountainArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 6, 7, 9, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -3, -5};
		
		int result = findPeak(arr);
		System.out.println(result);

	}
	
	static int findPeak(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = (start + end)/2;
			if(arr[mid] > arr[mid + 1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return arr[start];
	}

}
