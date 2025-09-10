package com.skakarla.problems;

import java.util.*;

class NumArray {
	private int[] prefixsum;

	public NumArray(int[] nums) {
		prefixsum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			prefixsum[i + 1] = prefixsum[i] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		return prefixsum[right + 1] - prefixsum[left];
	}
}

public class Range_sum_Query {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] nums = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

		NumArray obj = new NumArray(nums);

		// Take number of queries
		System.out.print("Enter number of queries: ");
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			System.out.print("Enter left and right indices: ");
			int left = sc.nextInt();
			int right = sc.nextInt();
			System.out.println("Sum from " + left + " to " + right + " = " + obj.sumRange(left, right));
		}
	}
}
