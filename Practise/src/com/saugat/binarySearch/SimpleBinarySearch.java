package com.saugat.binarySearch;

public class SimpleBinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 7, 8, 11, 15, 17, 19, 23, 32, 35, 39, 42, 44, 51, 54};
		int target = 1;
		
		int index = searchBinary(arr, target);
		System.out.println(index);

	}
	
	static int searchBinary(int[] arr, int element) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while(start <= end) {
			mid = (start + end)/2 ;
			if( element > arr[mid]) {
				start = mid + 1;
			} else if(element < arr[mid]) {
				end = mid - 1;
			}
			else { 
				return mid;
			}
		}
		return end;
	}

}
