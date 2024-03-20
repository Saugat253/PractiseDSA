package com.saugat.recursion.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSetPatternIteration {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3};
		List<List<Integer>> list = subset(arr);
		
		System.out.println(list);

	}

	static List<List<Integer>> subset(int[] arr){
	    // Creating an outer list to store all subsets
	    List<List<Integer>> outer = new ArrayList<>();
	    
	    // Adding an empty list to represent the empty subset
	    outer.add(new ArrayList<>());
	    
	    // Iterating through each element in the array
	    for(int num: arr) {
	        // Getting the current size of the outer list
	        int n = outer.size();
	        
	        // Iterating through each existing subset in the outer list
	        for(int i=0; i<n; i++) {
	            // Creating a new list by copying the existing subset
	            List<Integer> internal = new ArrayList<>(outer.get(i));
	            
	            // Adding the current element (num) to the new list
	            internal.add(num);
	            
	            // Adding the new list to the outer list, creating a new subset
	            outer.add(internal);
	        }
	    }
	    
	    // Returning the list of all subsets
	    return outer;
	}

}
