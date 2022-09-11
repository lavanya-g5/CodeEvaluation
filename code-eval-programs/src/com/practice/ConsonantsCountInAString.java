/*
 * 7. Accept a String as parameter. Find out how many consonants present in it.
 */

package com.practice;

public class ConsonantsCountInAString {

	public int consonantsCount(String input) {
		String in = input.toLowerCase();
		int count = 0;
		for (int i = 0; i < in.length(); i++) {
			if (in.charAt(i) != 'a' && in.charAt(i) != 'e' && in.charAt(i) != 'i' && in.charAt(i) != 'o'
					&& in.charAt(i) != 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ConsonantsCountInAString character = new ConsonantsCountInAString();
		System.out.println("Result: " + character.consonantsCount("ASDFGHJKL"));
	}
}

// OUTPUT
// Scenario 1 -> input 1 -> "CVCVCV" -> Result: 6
// Scenario 2 -> input 2 -> "GUN" -> Result: 2
// Scenario 3 -> input 3 -> "ASDFGHJKL" -> Result: 8