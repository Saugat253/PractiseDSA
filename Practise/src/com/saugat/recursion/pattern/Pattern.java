package com.saugat.recursion.pattern;

public class Pattern {

	public static void main(String[] args) {
		
		triangle(4, 0);
		triangle2(4, 0);

	}
	
	static void triangle(int row, int col) {
		
		if(row < 1) {
			return;
		}
		if(row > col) {
			System.out.print("* ");
			triangle(row, col + 1);
		}
		else {
			System.out.println();
			triangle(row - 1, 0);
		}
		
	}
	
static void triangle2(int row, int col) {
		
		if(row < 1) {
			return;
		}
		if(row > col) {
			triangle2(row, col + 1);
			System.out.print("* ");
		}
		else {
			triangle2(row - 1, 0);
			System.out.println();
		}
		
	}

}
