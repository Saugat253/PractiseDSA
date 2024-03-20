package com.saugat.binarySearch;

public class SearchInMountainArray {

	public static void main(String[] args) {
		// for a given mountain array, return the minimum index such that arr.get(index) == target, if such index doesnot exist return -1
		
		int[] arr = {1, 3, 4, 6, 7, 9, 12, 15, 12, 11, 10, 9, 8, 7, 6, 3, 1};
		int target = 11;
		int start = 0;
		int end = arr.length - 1;
		int peakIndex = findPeak(arr, target);
		int result = binarySearch(arr, target, start, peakIndex);
		if(result == -1) {
			result = reverseBinarySearch(arr, target, peakIndex + 1, end);
		}
		System.out.println(result);

	}
	
	static int findPeak(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = (start + end)/2;
			if(arr[mid] >arr[mid + 1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
static int reverseBinarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(target > arr[mid]) {
				end = mid - 1;
			}
			else if(target < arr[mid]) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
