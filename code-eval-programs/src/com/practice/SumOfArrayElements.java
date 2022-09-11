/*
 * 8. Given an array 'N' elements, return the sum of all array elements
 */

package com.practice;

public class SumOfArrayElements {

	public int arrayElementsSum(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		SumOfArrayElements arraySum = new SumOfArrayElements();
//		int[] arr=new int[5];
//		OR
		int[] arr = { 1, 5, 8, 6, 7 };
		System.out.println(arraySum.arrayElementsSum(arr));
	}
}

//OUTPUT
//Scenario 1 -> input 1 -> {2,5,8,7,5,3} -> Result : 30
//Scenario 2 -> input 2 -> {2,4,1,5} -> Result : 12
//Scenario 3 -> input 3 -> {1, 5, 8, 6, 7} -> Result : 27