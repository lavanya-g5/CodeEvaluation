/*
 * 10. Given a String, return a new string where the 1st and last chars have been changed.
 * Ex: input -> code, output ->edoc
 */

package com.practice;

public class FirstAndLastCharChanged {

	public String charChanged(String str) {
		String result = "";
		result = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
		return result;
	}

	public static void main(String[] args) {
		FirstAndLastCharChanged character = new FirstAndLastCharChanged();
		String input = "QWERTY";
		System.out.println(character.charChanged(input));
	}
}

// OUTPUT
// Scenario 1 -> input 1 -> QWERTY -> Result : YWERTQ
// Scenario 2 -> input 2 -> code -> Result : eodc
// Scenario 3 -> input 3 -> abcd -> Result : dbca