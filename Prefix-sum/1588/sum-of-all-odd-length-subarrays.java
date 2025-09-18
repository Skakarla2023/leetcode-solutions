package com.skakarla.problems;

import java.util.Arrays;

public class Sum_Odd_length_subarrays {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 7 };
		int n = arr.length;
		int totalSum = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int length = j - i + 1;
				if (length % 2 == 1) {
					int[] subarray = Arrays.copyOfRange(arr, i, j + 1);
					int sum = 0;
					for (int num : subarray) { // for-each loop
						sum += num;
					}
					totalSum += sum;
				}

			}
		}
		System.out.println(totalSum);
	}

}
