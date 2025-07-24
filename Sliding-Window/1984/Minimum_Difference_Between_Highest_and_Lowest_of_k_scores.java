package com.skakarla.problems;

import java.util.Arrays;

public class Minimum_Difference_Between_Highest_and_Lowest {

	public static void main(String[] args) {
		int[] nums = { 4, 7, 9, 1 };
		Arrays.sort(nums);
		int k = 2;
		int diff;
		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i <= nums.length - k; i++) {
			diff = nums[i + k - 1] - nums[i];
			minDiff = Math.min(minDiff, diff);
		}

		System.out.println(minDiff);
		// TODO Auto-generated method stub

	}

}
