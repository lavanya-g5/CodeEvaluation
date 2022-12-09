/*
 * 12. Given an array of ints, return true if one of the 1st four elements in the array is 9.
 * The array length will be greater than 4
 * input -> arrayFront9{1,2,9,3,4} , output -> true
 * input arrayFront9{1,2,3,4,9}, output -> false 
 */

package com.practice;

public class ArrayFirstFourElement9 {

	public boolean arrayFront9(int[] array) {
		for (int i = 0; i < 4; i++) {
			if (array[i] == 9) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		ArrayFirstFourElement9 arrayfirst49 = new ArrayFirstFourElement9();
		int[] input = { 1, 5, 3, 5, 0, 4 };
		System.out.println(arrayfirst49.arrayFront9(input));
	}
}

// OUTPUT
// input {1, 5, 3, 5, 0, 4}, output -> false
// input {1, 9, 3, 5, 0, 4}, output -> true