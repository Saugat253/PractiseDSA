package com.saugat.binarySearchIn2D;

import java.util.Arrays;

public class RolColMatrix {

	public static void main(String[] args) {
		// Apply binary search to find the given element in 2 dimensional matrix
		// where matrix is sorted in row wise and col wise.
		
		int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {28, 29, 37, 49}, {34, 38, 46, 50}};
		int target = 9;
		int[] result = searchTarget(arr, target);
		System.out.println(Arrays.toString(result));

	}
	
	static int[] searchTarget(int[][] arr, int target) {
		
		int row = 0;
		int col = arr.length -1;   
		while(row< arr.length && col > 0) {
			if(target == arr[row][col]) {
				return new int[] {row, col};
			}
		    if(target < arr[row][col]) {
				col --;
			} else {
				row ++;
			}
		}	
		return new int[] {-1, -1};
	}

}
