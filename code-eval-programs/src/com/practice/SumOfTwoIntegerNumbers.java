/*
 * 1. Pass 2 integers as parameter and return the sum
 */

package com.practice;

public class SumOfTwoIntegerNumbers {

	public long SumOf2Numbers(int a, int b) {
		long sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		SumOfTwoIntegerNumbers sum = new SumOfTwoIntegerNumbers();
		System.out.println("Result : " + sum.SumOf2Numbers(10, -8));
	}
}

//OUTPUT
// Scenario 1 -> input (4,8) -> Result : 12
// Scenario 2 -> input (10,-8) -> Result : 2