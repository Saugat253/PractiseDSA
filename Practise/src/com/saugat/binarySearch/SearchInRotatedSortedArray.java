package com.saugat.binarySearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// in order to search for the target element, first we need to find Pivot i.e largest element in rotated sorted array.
		//int[] arr = {0, 1, 2, 4, 7, 9, 13};
		int[] arr = {3, 3, 3, 1, 2, 3};
		int pivot = findPivot(arr);
		System.out.println(pivot);

	}
	
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			// in order to find pivot we need to deal with certain cases
			
			// case 1
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			// case 2
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid-1;
			}
			// case 3
			if(arr[start] < arr[mid]) {
				start = mid + 1;
			}
			else if(arr[start] > arr[mid]) { 
				end = mid - 1;
			} else {
				return -1;
			} 
		}
			
		return -1;
	}
	
	static int findPivotInDuplicate(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			
			if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
				// here elements at start mid and end are equal
				// so 1st check if start or end is pivot, if not skip these duplicate elements
				if(start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				if(end > start && arr[end] < arr[end - 1]) {
					return end - 1;
				}
			}
			else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
