package com.saugat.binarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOfTargetElement {

	public static void main(String[] args) {
		
		int[] nums = {4, 6, 7, 7, 9, 9, 9, 9, 11, 11, 11, 11, 11, 15};
		int target = 5;
		
		int[] result = searchInRange(nums, target);
		System.out.println(Arrays.toString(result));

	}
	
	static int[] searchInRange(int[] arr, int target) {
		
		int[] nums = {-1, -1};
		nums[0] = search(arr, target, true);
		nums[1] = search(arr, target, false);
		return nums;
		
	}
	
	static int search(int[] arr, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2;
			if(target < arr[mid]) {
				end = mid - 1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				// possible value
				ans = mid;
				if(findStartIndex) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
