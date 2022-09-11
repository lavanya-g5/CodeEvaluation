/*
 * 2. Check the given number is odd or even, the definition of an "even" number is that the number is 
 * divisible by "2" without a remainder. Mathematicians would write an even number E=(2xN).Then E is 
 * always divisible by "2".The definition applies to all integers, +ve and -ve including 0.
 */

package com.practice;

public class OddOrEvenNumbers {

	public String testOddOrEven(int num) {
		int rem = num % 2;
		if (rem % 2 == 0) {
			return "even";
		} else
			return "odd";
	}

	public static void main(String[] args) {
		OddOrEvenNumbers oe = new OddOrEvenNumbers();
		System.out.println("Result : " + oe.testOddOrEven(15));
	}

}

//OUTPUT
// Scenario 1 -> input 15 -> Result : odd
// Scenario 2 -> input 10 -> Result : even

//Example -> 10%2

//2)10(5
//  10
//-------
//  00

// 2 is DIVISOR
// 10 is DIVIDEND
// 5 is QUOTIENT
// 00 is REMAINDER