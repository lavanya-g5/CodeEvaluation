/*
 * 9. Pass an int array and an int and do a search of the 2nd parameter in the 1st and return true or false?
 */

package com.practice;

public class SearchElementInAnArray {

	public boolean searchElement(int[] array, int elementToSearch) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elementToSearch) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SearchElementInAnArray search = new SearchElementInAnArray();
		int[] arr = { 1, 6, 3, 9, 4 };
		System.out.println("Result : "+ search.searchElement(arr, 6));
	}
}

// OUTPUT
// Scenario 1 -> input 1 -> ({ 1, 6, 3, 9, 4 },5) -> Result : false
// Scenario 2 -> input 2 -> ({ 1, 6, 3, 9, 4 },6) -> Result : true
// Scenario 3 -> input 3 -> ({ 12, 5, 14, 6, 78}, 2) -> Result : false
// Scenario 4 -> input 4 -> ({ 12, 5, 14, 6, 78}, 12) -> Result : true
