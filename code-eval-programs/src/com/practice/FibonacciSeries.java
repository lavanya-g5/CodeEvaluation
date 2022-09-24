/*
 * 11. To generate fibonacci series of limit of numbers of elements.
 * input -> 5, output -> 0, 1, 1, 2, 3
 * input -> 3, output -> 0, 1, 1
 */

package com.practice;

public class FibonacciSeries {

	public int fibSeries(int count) {
		int firstTerm = 0;
		int secondTerm = 1;
		for (int i = 2; i <= count; i++) {
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		return firstTerm;
	}

	public static void main(String[] args) {
		int limit = 6;
		FibonacciSeries fib = new FibonacciSeries();
		System.out.println(fib.fibSeries(limit));
	}
}

// OUTPUT
// scenario 1 -> input -> limit -> 10, Output-> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// scenario 2 -> input -> limit -> 6, Output-> 0, 1, 1, 2, 3, 5