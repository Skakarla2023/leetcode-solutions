package com.skakarla.problems;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {

	public static void main(String[] args) {

		int n = 19;
		if (isHappy(n)) {
			System.out.println("The given number is happy😊");
		} else {
			System.out.println("The given number is not happy😢");
		}
	}

	private static boolean isHappy(int n) {

		Set<Integer> seen = new HashSet<>();
		while (n != 0 && !seen.contains(n)) {
			seen.add(n);
			n = getSumOfSquares(n);
		}
		return n == 1;
	}

	private static int getSumOfSquares(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;

	}

}
