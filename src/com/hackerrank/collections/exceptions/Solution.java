package com.hackerrank.collections.exceptions;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-exception-handling?h_r=next-challenge&h_v=zen
*/
class MyCalculator {

	int power(int n, int p) throws Exception {
		if (Math.signum(n) != -1 && Math.signum(p) != -1) {
			return (int) Math.pow(n, p);
		} else {
			throw new Exception("n and p should be non-negative");
		}
	}
}

class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
