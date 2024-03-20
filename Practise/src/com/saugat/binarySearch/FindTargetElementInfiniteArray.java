package com.saugat.binarySearch;

public class FindTargetElementInfiniteArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 5, 7, 8, 9, 12, 15, 16, 19, 22, 23, 27, 32, 35, 39};
		int target = 8;
		
		int result = searchInfiniteArray(arr, target);
		System.out.println(result);

	}
	
	static int searchInfiniteArray(int[] arr, int target) {
		
		int start = 0;
		int end = 1;
		
		while(target > arr[end]) {
			int temp = end + 1;  // new start index hold at temp
			end = end + (end - start + 1)*2;
			start = temp;
			
		}
		return binarySearch(arr, target, start, end);
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

}
