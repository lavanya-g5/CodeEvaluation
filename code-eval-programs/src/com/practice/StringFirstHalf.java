/*
 * 13.Given a String of even length , Return the 1st half, so the string "WOOHOO" yields "WOO".
 */

package com.practice;

public class StringFirstHalf {

	public String stringHalf(String input) {
		String result = input.substring(0, input.length() / 2);
		return result;
	}

	public static void main(String[] args) {
		StringFirstHalf str = new StringFirstHalf();
		System.out.println(str.stringHalf("WOOHOO"));
	}

}

// INPUT -> WOOHOO, OUTPUT -> WOO
// INPUT -> TESTING1, OUTPUT -> TEST