package com.saugat.cyclicSort;

import java.util.Arrays;

public class SimpleCyclicSort {

	public static void main(String[] args) {
		
		int[] arr = {5, 4, 2, 3, 1};
		
		int[] result = sortCyclic(arr);
		System.out.println(Arrays.toString(result));

	}
	
	 static int[] sortCyclic(int[] arr) {
		 
		 int i = 0;
		 while(i < arr.length) {
			 
			 int correctIndex = arr[i] - 1;
			 if(arr[i] != arr[correctIndex]) {
				 int temp = arr[i];
				 arr[i] = arr[correctIndex];
				 arr[correctIndex] = temp;
			 }
			 else {
				 i++;
			 }
		 }
		 
		 return arr;
	 }

}
